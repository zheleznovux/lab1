package carComponents;

public interface ComponentsFactory {
    public Surface createSurface();
    public Wheels createWheels();
    public Engine createEngine();
    public Suspension createSuspension();
}
