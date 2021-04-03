package cars;

public class SuperCar extends Sedan{

    private double acceleration;

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        if(acceleration <= 0) {
            System.out.println("Err:    unsuitable values!");
        } else {
            this.acceleration = acceleration;
        }
    }
//    Sedan(String color, int maxSpeed, String drive)
    public SuperCar(String color, int maxSpeed, String drive) {
        super(color, maxSpeed, drive);
        super.setDescription("This is Supercar ");
        setAcceleration(3.5);
    }

    public double cost() {
        return 10000;
    }
}
