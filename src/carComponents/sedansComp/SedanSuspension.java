package carComponents.sedansComp;

import carComponents.Suspension;

public class SedanSuspension implements Suspension {
    @Override
    public void getDescription() {
        System.out.println("low suspension");
    }
}
