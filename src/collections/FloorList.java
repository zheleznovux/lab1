package collections;

import java.util.ArrayList;
import java.util.List;

public class FloorList implements Collection{

    private int   floorNumber;
    private List<Room> rooms;
    private Iterator iterator = new FloorList.RoomsIterator();

    public FloorList(int number, List<Room> rooms)
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

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
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
