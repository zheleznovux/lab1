package carComponents.offroadComp;

import carComponents.*;

public class SUVComponentsFactory implements ComponentsFactory {
    @Override
    public Surface createSurface() {
        return new SUVSurface();
    }

    @Override
    public Wheels createWheels() {
        return new SUVWheels();
    }

    @Override
    public Engine createEngine() {
        return new SUVEngine();
    }

    @Override
    public Suspension createSuspension() {
        return new SUVSuspension();
    }
}
