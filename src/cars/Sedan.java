package cars;

public abstract class Sedan extends Car{

    private String drive;

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public Sedan(String color, int maxSpeed, String drive) {
        setDescription("This is Sedan ");

        setMaxSpeed(maxSpeed);
        setColor(color);

        this.drive = drive;
    }
}
