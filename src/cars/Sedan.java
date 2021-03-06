package cars;

public abstract class Sedan extends Car{

    private String drive;

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public Sedan(String model, String color, int maxSpeed, String drive) {
        super(model, color, maxSpeed, "sedan");
        this.drive = drive;
    }

    public Sedan(String color, int maxSpeed, String drive) {
        super(color, maxSpeed, "sedan");
        this.drive = drive;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "тип привода: " + this.drive;
    }
}
