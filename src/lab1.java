import cars.AudiTT;
import cars.Offroader;
import cars.SuperCar;
import cars.Car;

import java.util.Random;

public class lab1 {
    public static void main(String args[])  {
//        System.out.print("Hello\n");
//        cars.Sedan volvoS80 = new cars.Sedan("VolvoS80", "Red", 160, "rear-wheel");
//        System.out.println(volvoS80.getDescription());
        Car[] myCars = new Car[10];

        Random random = new Random();

        for(int i = 0; i <= 9; i++) {
            int j = random.nextInt(2) + 1;
            switch (j) {
                case (1):
                    myCars[i] = new Offroader("ToyotaFJCruiser", "yellow", 200, false);
                    break;
                case (2):
                    myCars[i] = new SuperCar("Lambo", "red", 250, "rear-wheel", 3.5);
                    break;
                case (3):
                    myCars[i] = new AudiTT("grey", 220, "rear-wheel", 4.6);
                    break;
            }
        }
        for(int i = 0; i <= 9; i++) {
           System.out.println(myCars[i].getDescription());
        }
    }
}
