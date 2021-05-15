package carComponents.sedansComp;

import carComponents.Wheels;

public class SedanWheels implements Wheels {
    @Override
    public void getDescription() {
        System.out.println("4 small wheels");
    }
}
