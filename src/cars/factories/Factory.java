package cars.factories;
import cars.Car;


public abstract class Factory {

    public Car orderNewCar(String type)
    {
        Car car = createCar(type);
        car.addDescription("(from the off roads factory)");

        return car;
    }

    protected abstract Car createCar(String type);
}
