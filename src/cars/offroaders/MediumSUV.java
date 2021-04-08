package cars.offroaders;

public class MediumSUV extends SUV {

    public MediumSUV() {
        addDescription("medium SUV");
        isPickUp();
    }

    @Override
    public double cost() {
        return 20000;
    }
}