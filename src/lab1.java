import cars.*;

import java.util.Random;

public class lab1 {
    public static void main(String args[])  {

        Car[] myCars = new Car[10];

        Random random = new Random();

        Car supercar = new SuperCar("red",200,"rear");

        System.out.println(supercar.getDescription() + supercar.cost());

        for(int i = 0; i <= 9; i++) {
            int j = random.nextInt(2) + 1;
            int k = random.nextInt(2) + 1;

            switch (j) {
                case (1):
                    myCars[i] = setRandomDecorator(setRandomDecorator(new Offroader("yellow", 200, false)));
                    break;
                case (2):
                    myCars[i] = setRandomDecorator(setRandomDecorator(setRandomDecorator(new SuperCar("red", 250, "rear-wheel"))));
                    break;
            }
        }
        for(int i = 0; i <= 9; i++) {
           System.out.println(myCars[i].getDescription() + " Стоимостью: " + myCars[i].cost());
        }
    }

    static Car setRandomDecorator(Car car) {
        Random random = new Random();
        int k = random.nextInt(2) + 1;
        switch (k) {
            case (1):
                return new Spoiler(car);
            case (2):
                return new Turbo(car);
            default:
                throw new IllegalStateException("Unexpected value: " + k);
        }
    }
}
