package threads;

public class Storage {

    private int resUnits;

    public int maxRes() {
        return 255;
    }

    public int minRes() {
        return 0;
    }

    public Storage() {
        this.setResUnits(1);
    }

    public int getResUnits() {
        return resUnits;
    }

    public void setResUnits(int resUnits) {
        this.resUnits = resUnits;
    }

    void inc() {
        if(resUnits < 255)
            resUnits++;
    }

    void dec() {
        if(resUnits > 0)
            resUnits--;
    }

    public String getDescription() {
        return "Товара на складе: " + this.resUnits;
    }

}
