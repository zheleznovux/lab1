package cars;

public class Spoiler extends CustomizingDecorator{

    Car car;

    public Spoiler(Car car) {
        this.car = car;
    }

    @Override
    public double cost() {
        return car.cost() + 5000;
    }

    public String getDescription() {
        return car.getDescription() + " with spoiler ";
    }
}
