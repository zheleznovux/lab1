package cars.decorators;

import cars.Car;

public abstract class CustomizingDecorator extends Car {

    protected Car car;

    public CustomizingDecorator(Car car) {
        this.car = car;
    }

    public abstract String getDescription();
}
