public abstract class Car {

    private String model;
    private String color;
    private int maxSpeed;
    private String type;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

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

    Car(String model, String color, int maxSpeed, String type) {
        this.model = model;
        this.color = color;
        this.type = type;
        setMaxSpeed(maxSpeed);
    }

    public String getDescription() {
        return "Машина модели: " + this.model + ' ' + this.type + ", цвет: " + this.color  + ", макс. скорость = " + this.maxSpeed + "км/ч, ";
    }
}
