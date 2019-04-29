package dungeon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class UI {
    private Scanner reader;
    private Dungeon dungeon;

    public UI(Dungeon dungeon) {
        this.reader = new Scanner(System.in);
        this.dungeon = dungeon;
    }

    public String[] readCommand() {
        String h = reader.nextLine();
        return h.split("");
    }

    public void printMatrix() {
        ArrayList<Creature> creaturesSet = (ArrayList<Creature>) dungeon.getCreaturesSet();
        int height = dungeon.getMaxY();
        int lenght = dungeon.getMaxX();
        System.out.println("");
        for(int i = 0; i<height; i++) {
            for(int j = 0; j<lenght; j++) {
                if(creaturesSet.contains(new Vampire(j, i))) {
                    System.out.printf("v");
                } else if (creaturesSet.contains(new Player(j, i))){
                    System.out.printf("@");
                } else {
                    System.out.printf(".");
                }
            }
            System.out.println();
        }
    }

    public void printCreatures() {
        System.out.println("");
        for(Movable v : dungeon.getCreaturesSet()) {
            if(v.getClass() == new Player(0, 0).getClass()) {
                System.out.println(v);
            }
        }
        for(Movable v : dungeon.getCreaturesSet()) {
            if(v.getClass() != new Player(0,0).getClass()) {
                System.out.println(v);
            }
        }
    }

}


