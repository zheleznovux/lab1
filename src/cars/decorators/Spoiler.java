package cars.decorators;

import cars.Car;
import cars.decorators.CustomizingDecorator;

public class Spoiler extends CustomizingDecorator {

    public Spoiler (Car car) {
        super(car);
    }

    @Override
    public double cost() {
        return car.cost() + 5000;
    }

    public String getDescription() {
        return car.getDescription() + " with spoiler ";
    }
}
