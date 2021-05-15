package carComponents.sedansComp;

import carComponents.Engine;

public class SedanEngine implements Engine {
    @Override
    public void getDescription() {
        System.out.println("fast engine");
    }
}
