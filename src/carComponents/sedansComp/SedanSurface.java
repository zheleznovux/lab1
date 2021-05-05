package carComponents.sedansComp;

import carComponents.Surface;

public class SedanSurface implements Surface{
    @Override
    public void getDescription() {
        System.out.println("shiny paint surface");
    }
}
