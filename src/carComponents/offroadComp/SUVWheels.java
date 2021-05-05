package carComponents.offroadComp;

import carComponents.Wheels;

public class SUVWheels implements Wheels {
    @Override
    public void getDescription() {
        System.out.println("4 large wheels");
    }
}
