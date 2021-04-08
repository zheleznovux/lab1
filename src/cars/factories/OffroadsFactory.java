package cars.factories;

import cars.Car;
import cars.offroaders.BigSUV;
import cars.offroaders.MediumSUV;
import cars.offroaders.SmallSUV;

public class OffroadsFactory extends Factory {

    @Override
    protected Car createCar(String type) {
        switch(type)
        {
            case "big":
                return new BigSUV();

            case "medium":
                return new MediumSUV();

            case "small":
                return new SmallSUV();

            default:
                return null;
        }
    }
}
