import collections.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lab7 {
    public static void main(String args[])
    {
        Random random = new Random();

        Room kv1  = new Room("Shop",  (random.nextInt(120) + 1));
        Room kv2  = new Room("Living",(random.nextInt(120) + 1));
        Room kv3  = new Room("Office",(random.nextInt(120) + 1));
        Room kv4  = new Room("Shop",  (random.nextInt(120) + 1));
        Room kv5  = new Room("Shop",  (random.nextInt(120) + 1));
        Room kv6  = new Room("Living",(random.nextInt(120) + 1));
        Room kv7  = new Room("Office",(random.nextInt(120) + 1));
        Room kv8  = new Room("Shop",  (random.nextInt(120) + 1));
        Room kv9  = new Room("Office",(random.nextInt(120) + 1));
        Room kv10 = new Room("Shop",  (random.nextInt(120) + 1));
        Room kv11 = new Room("Living",(random.nextInt(120) + 1));
        Room kv12 = new Room("Office",(random.nextInt(120) + 1));
        Room kv13 = new Room("Living",(random.nextInt(120) + 1));
        Room kv14 = new Room("Shop",  (random.nextInt(120) + 1));

        Room [] rooms1 = {kv1, kv2, kv3, kv4};

        ArrayList <Room> rooms2 = new ArrayList<Room>();
        rooms2.add(kv5);
        rooms2.add(kv6);
        rooms2.add(kv7);
        rooms2.add(kv8);
        rooms2.add(kv9);

        List <Room> rooms3 = new ArrayList<Room>();
        rooms3.add(kv10);
        rooms3.add(kv11);
        rooms3.add(kv12);
        rooms3.add(kv13);
        rooms3.add(kv14);

        Floor floor1 = new Floor( 1, rooms1);
        FloorAarrayList floor2 = new FloorAarrayList(2, rooms2);
        FloorList floor3 = new FloorList(3, rooms3);

        Collection [] floors1 = {floor1, floor2, floor3};
        Building lenina1 = new Building(floors1);

        int sum = 0;
        while (lenina1.getIterator().hasNext()) {
            Collection col = (Collection) lenina1.getIterator().next();

            while (col.getIterator().hasNext()) {
                Room curRoom = (Room) col.getIterator().next();
                sum += curRoom.getSquare();
            }
        }

        System.out.println(sum);


    }
}
