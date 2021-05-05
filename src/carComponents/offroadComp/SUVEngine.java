package carComponents.offroadComp;

import carComponents.Engine;

public class SUVEngine implements Engine {
    @Override
    public void getDescription() {
        System.out.println("high-torque engine");
    }
}
