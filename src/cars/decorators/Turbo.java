package cars.decorators;

import cars.Car;
import cars.decorators.CustomizingDecorator;

public class Turbo extends CustomizingDecorator {

    public Turbo(Car car) {
        super(car);
    }

    @Override
    public double cost() {
        return car.cost() + 10000;
    }

    public String getDescription() {
        return car.getDescription() + " with turboboost ";
    }
}