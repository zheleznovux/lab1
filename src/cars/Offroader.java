package cars;

public class Offroader extends Car{

    private String drive;

    public boolean isPickUp() {
        return pickUp;
    }

    public void setPickUp(boolean pickUp) {
        this.pickUp = pickUp;
    }

    boolean pickUp;

    public void setDescription(String description) {
        super.description = description;
    }

    public Offroader(String color, int maxSpeed, boolean pickUp) {
        setDescription("This is Offroader ");

        setColor(color);
        setMaxSpeed(80);
        setPickUp(pickUp);
    }


    @Override
    public double cost() {
        return 15000;
    }
}
