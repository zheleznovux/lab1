import cars.*;
import cars.decorators.Spoiler;
import cars.decorators.Turbo;
import cars.factories.Factory;
import cars.factories.OffroadsFactory;
import cars.factories.SedansFactory;
import cars.offroaders.BigSUV;
import cars.sedans.SuperCarSedan;

import java.util.Random;

public class labs {
    public static void main(String args[])  {

        Car[] myCars = new Car[10];

        Random random = new Random();

        for(int i = 0; i <= 9; i++) {
            int j = random.nextInt(2) + 1;

            switch (j) {
                case (1):

                    myCars[i] = setRandomDecorator(setRandomDecorator(new BigSUV()));
                    break;
                case (2):
                    myCars[i] = setRandomDecorator(setRandomDecorator(setRandomDecorator(new SuperCarSedan())));
                    break;
                case (1) -> myCars[i] = setRandomDecorator(setRandomDecorator(new BigSUV()));
                case (2) -> myCars[i] = setRandomDecorator(setRandomDecorator(setRandomDecorator(new SuperCarSedan())));
            }
        }
        for(int i = 0; i <= 9; i++) {
            System.out.println("\n" + myCars[i].getDescription() + "\nСтоимостью: " + myCars[i].cost());
        }

        Factory offroadsFactory = new OffroadsFactory();
        Car bigFoot =  setRandomDecorator(offroadsFactory.orderNewCar("big"));
        System.out.println(bigFoot.getDescription());

        Factory sedansFactory = new SedansFactory();
        Car someSuperCar =  setRandomDecorator(sedansFactory.orderNewCar("hatchback"));
        System.out.println(someSuperCar.getDescription());
    }

    static Car setRandomDecorator(Car car)
    {
        Random random = new Random();
        int k = random.nextInt(2) + 1;
        return switch (k) {
            case (1) -> new Spoiler(car);
            case (2) -> new Turbo(car);
            default -> throw new IllegalStateException("Unexpected value: " + k);
        };
    }
}
