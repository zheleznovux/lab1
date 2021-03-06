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

    public SuperCar(String model, String color, int maxSpeed, String drive, double acceleration) {
        super(model, color, maxSpeed, drive);
        setAcceleration(acceleration);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", разгон до 100км/ч: " + this.acceleration;
    }
}
