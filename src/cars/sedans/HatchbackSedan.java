package cars.sedans;

public class HatchbackSedan extends Sedan{

    public HatchbackSedan() {
        addDescription("Hatchback");
    }

    public double cost() {
        return 10000;
    }
}
