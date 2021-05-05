package carComponents.sedansComp;

import carComponents.*;
import carComponents.offroadComp.SUVSurface;
import carComponents.offroadComp.SUVWheels;

public class sedanComponentsFactory implements ComponentsFactory {

    @Override
    public Surface createSurface() {
        return new SedanSurface();
    }

    @Override
    public Wheels createWheels() {
        return new SUVWheels();
    }

    @Override
    public Engine createEngine() {
        return new SedanEngine();
    }

    @Override
    public Suspension createSuspension() {
        return new SedanSuspension();
    }
}
