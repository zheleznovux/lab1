import cars.AudiTT;
import cars.Offroader;
import cars.SuperCar;

import java.util.Random;

public class lab1 {
    public static void main(String args[])  {
//        System.out.print("Hello\n");
//        cars.Sedan volvoS80 = new cars.Sedan("VolvoS80", "Red", 160, "rear-wheel");
//        System.out.println(volvoS80.getDescription());
        Random random = new Random();
        int i = random.nextInt(2) + 1;

        for(; i != 0; i--) {
            switch (i) {
                case (1) -> {
                    Offroader toyotaFJCruiser = new Offroader("ToyotaFJCruiser", "yellow", 200, false);
                    System.out.println(toyotaFJCruiser.getDescription());
                }
                case (2) -> {
                    SuperCar lambo = new SuperCar("Lambo", "red", 250, "rear-wheel", 3.5);
                    System.out.println(lambo.getDescription());
                }
                case (3) -> {
                    AudiTT ttsNumber = new AudiTT("grey", 220, "rear-wheel", 4.6);
                    System.out.println(ttsNumber.getDescription());
                }
            }

        }
    }
}
