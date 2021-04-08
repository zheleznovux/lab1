package cars.sedans;

import cars.sedans.Sedan;

public class SuperCarSedan extends Sedan {

    private double acceleration;

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        if(acceleration <= 0) {
            System.out.println("Err:    acceleration isn't negative value!");
        } else {
            this.acceleration = acceleration;
        }
    }
//    Sedan(String color, int maxSpeed, String drive)
    public SuperCarSedan() {
        addDescription("supercar");
        setAcceleration(3.5);
    }

    public double cost() {
        return 130000;
    }
}
