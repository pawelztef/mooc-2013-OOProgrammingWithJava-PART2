package boxes;

public class OneThingBox extends Box {
    private Thing th;

    public OneThingBox() {

    }

    @Override
    public void add(Thing thing) {
        if (th == null ) {
            this.th = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (th != null && th.equals(thing)) return true;
        return false;
    }
}
