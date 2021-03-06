package cars;

public class Offroader extends Car{
    private String drive;
    private boolean pickUp;

    public Offroader(String model, String color, int maxSpeed, boolean pickUp) {
        super(model, color, maxSpeed, "roadster");
        this.drive = "all-wheel drive";
        this.pickUp = pickUp;
    }

    @Override
    public String getDescription() {
        if(pickUp) {
            return super.getDescription() + "тип привода: " + this.drive + ", Наличие грузового отсека: имеется";
        } else {
            return super.getDescription() + "тип привода: " + this.drive + ", Наличие грузового отсека: не имеется";
        }
    }
}
