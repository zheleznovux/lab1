package cars.sedans;

import cars.Car;

public abstract class Sedan extends Car {

    private String drive;

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public void addDescription(String description) {
        super.description += " " + description;
    }

    public Sedan() {
        addDescription("this is Sedan");
        setMaxSpeed(180);
    }
}
