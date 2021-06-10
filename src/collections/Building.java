package collections;

public class Building implements Collection{
    private Collection[]  floors;
    private Iterator iterator = new Building.FloorIterator();

    public Building(Collection[]  floors)
    {
        this.floors = floors;

    }

    public Collection[] getFloors() {
        return floors;
    }

    public void setFloors(Collection[]  floors) {
        this.floors = floors;
    }

    @Override
    public Iterator getIterator() {
        return iterator;
    }

    private class FloorIterator implements Iterator {
        short index;

        @Override
        public boolean hasNext()
        {
            if(index < floors.length)
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next()
        {
            return floors[index++];
        }
    }
}