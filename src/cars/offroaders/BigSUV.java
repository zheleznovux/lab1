package cars.offroaders;

public class BigSUV extends SUV{

    public BigSUV() {
        addDescription("big frame SUV");
        isPickUp();
    }

    @Override
    public double cost() {
        return 25000;
    }
}
