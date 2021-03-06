
public class Main {
    public static void main(String args[])  {
//        System.out.print("Hello\n");
//        Sedan volvoS80 = new Sedan("VolvoS80", "Red", 160, "rear-wheel");
//        System.out.println(volvoS80.getDescription());
        Offroader toyotaFJCruiser = new Offroader("ToyotaFJCruiser","yellow", 200, false);
        System.out.println(toyotaFJCruiser.getDescription());
        SuperCar lambo = new SuperCar("Lambo","red",250,"rear-wheel",3.5);
        System.out.println(lambo.getDescription());
    }
}
