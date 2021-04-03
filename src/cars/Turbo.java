package cars;

public class Turbo extends CustomizingDecorator{

    Car car;

    public Turbo(Car car) {
        this.car = car;
    }

    @Override
    public double cost() {
        return car.cost() + 10000;
    }

    public String getDescription() {
        return car.getDescription() + " with turboboost ";
    }
}