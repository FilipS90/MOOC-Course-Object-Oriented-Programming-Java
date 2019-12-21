package moving;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;

public class Main {

    public static void main(String[] args) {
        List<Thing> things = new ArrayList<Thing>();
        things.add( new Item("Stone", 6) );
        things.add( new Item("Stone", 9) );
        things.add( new Item("Stone", 1) );
        things.add( new Item("Stone", 2) );
        things.add( new Item("Stone", 8) );
       Packer packer = new Packer(20);
       packer.packThings(things);
    }
}
