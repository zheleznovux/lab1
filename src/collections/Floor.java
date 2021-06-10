package collections;

public class Floor implements Collection{

    private int   floorNumber;
    private Room[]  rooms;
    private Iterator iterator = new Floor.RoomIterator();

    public Floor(int number, Room[] rooms)
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

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Iterator getIterator() {
        return iterator;
    }

    private class RoomIterator implements Iterator {
        short index;

        @Override
        public boolean hasNext()
        {
            if(index < rooms.length)
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next()
        {
            return rooms[index++];
        }
    }

}
