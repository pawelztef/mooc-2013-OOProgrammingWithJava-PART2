package dungeon;

import java.util.*;

public class Dungeon {

    private int maxX, maxY, vampires, moves;
    private boolean vampireMoves;
    private Player player;
    private List<Creature> creaturesSet;

    public Dungeon(int lenght, int height, int vampires, int moves, boolean vampireMoves) {
        this.maxX = lenght;
        this.maxY = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampireMoves = vampireMoves;
        this.creaturesSet = new ArrayList<Creature>();
        this.player = new Player(0, 0);
        for (int i = 0; i < vampires; i++) {
            creaturesSet.add(new Vampire(0, 0));
        }
        this.creaturesSet.add(player);
    }

    public void run() {
        UI ui = new UI(this);
        setVampires();
        boolean h;
        do {
            System.out.println(getMoves());
            ui.printCreatures();
            ui.printMatrix();
            if (vampireMoves) setVampires();
            String[] parsed = ui.readCommand();
            movePlayer(parsed);
            updateMoves();
            h = checkGameStatus();
        } while (h);
    }


    private void movePlayer(String[] command) {
        Player pl = (Player) this.getPlayer();
        int x = pl.getX();
        int y = pl.getY();

        for (String h : command) {
            if (h.equals("w")) {
                if ((y - 1) >= 0) {
                    y -= 1;
                    pl.move(x, y);
                }
            } else if (h.equals("s")) {
                if ((y + 1 ) <= getMaxY()-1) {
                    y += 1;
                    pl.move(x, y);
                }
            } else if (h.equals("a")) {
                if ((x - 1) >= 0) {
                    x -= 1;
                    pl.move(x, y);
                }
            } else if (h.equals("d")) {
                if ((x + 1) <= getMaxX()-1) {
                    x += 1;
                    pl.move(x, y);
                }
            }
            deleteIfPresent(x, y);
        }
    }

    private void setVampires() {
        for (Movable v : getCreaturesSet()) {
            if (v.getClass() != this.player.getClass()) {
                int x, y;
                x = new Random().nextInt(getMaxX());
                y = new Random().nextInt(getMaxY());
                if (x >= 0 && y >= 0 && x < getMaxX() && y < getMaxY()) {
                    v.move(x, y);
                }
            }
        }
    }

    private void deleteIfPresent(int x, int y) {
        List<Creature> toRemove = new ArrayList<Creature>();
        for(Creature cr: getCreaturesSet()) {
           if(cr.getX() == x && cr.getY() == y){
             ArrayList<Creature> s =  getCreaturesSet();
             toRemove.add(new Vampire(x, y));
           }
        }
        List<Creature> cr = getCreaturesSet();
        cr.removeAll(toRemove);
    }

    private boolean checkGameStatus() {
        if (getMoves() < 1) {
            System.out.println("YOU LOSE");
            return false;
        } else if (getMoves() >= 0 && getCreaturesSet().size() == 1) {
            System.out.println("YOU WIN");
            return false;
        }
        return true;
    }


    public ArrayList<Creature> getCreaturesSet() {
        return (ArrayList<Creature>) this.creaturesSet;
    }

    public int getMaxY() {
        return this.maxY;
    }

    public int getMaxX() {
        return this.maxX;
    }

    public Movable getPlayer() {
        return this.player;
    }

    private int getMoves() {
        return this.moves;
    }

    private void updateMoves() {
        this.moves--;
    }


}
