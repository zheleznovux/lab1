package cars;

public abstract class Car { //interface

    private String color;
    private int maxSpeed;
    String description = "Car";

    public abstract double cost();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0 ) {
            System.out.println("Err:    Отрицательная скорость, установлено стандартное значение(180).");
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
