package collections;

import java.util.ArrayList;

public class FloorAarrayList implements Collection{

    private int   floorNumber;
    private ArrayList<Room> rooms;
    private Iterator iterator = new FloorAarrayList.RoomsIterator();

    public FloorAarrayList(int number, ArrayList<Room> rooms)
    {
        this.floorNumber    = number;
        this.rooms          = rooms;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public Iterator getIterator() {
        return iterator;
    }

    private class RoomsIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext()
        {
            if(index < rooms.size())
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next()
        {
            return rooms.get(index++);
        }
    }
}
