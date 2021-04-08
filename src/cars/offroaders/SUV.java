package cars.offroaders;

import cars.Car;

public abstract class SUV extends Car {

    private boolean pickUp = false;

    public void isPickUp() {
        this.pickUp = this.pickUp;
    }

    public void isntPickUp() {
        this.pickUp = !this.pickUp;
    }

    public void addDescription(String description) {
        super.description += " " + description;
    }

    public SUV() {
        addDescription("this is Offroader");
        setMaxSpeed(80);
    }

}
