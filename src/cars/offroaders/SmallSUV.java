package cars.offroaders;

public class SmallSUV extends SUV{

    public SmallSUV() {
        addDescription("medium SUV");
        isntPickUp();
    }

    @Override
    public double cost() {
        return 15000;
    }
}
