package cars;

public class AudiTT extends SuperCar{

    private double engine;

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        if (engine <= 0.1) {
            System.out.println("Err:    unsuitable values!");
        } else {
            this.engine = engine;
        }
    }

    public AudiTT(String color, int maxSpeed, String drive, double acceleration) {
        super(color, maxSpeed, drive, acceleration);
        super.setModel("audiTT");
        setEngine(2.0);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", объём двигаетля:" + this.engine + "литра";
    }
}
