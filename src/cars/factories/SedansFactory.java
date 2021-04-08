package cars.factories;

import cars.Car;
import cars.offroaders.BigSUV;
import cars.offroaders.MediumSUV;
import cars.offroaders.SmallSUV;
import cars.sedans.HatchbackSedan;
import cars.sedans.SuperCarSedan;

public class SedansFactory extends Factory {

    @Override
    protected Car createCar(String type) {
        switch(type)
        {
            case "hatchback":
                return new HatchbackSedan();

            case "Supercar":
                return new SuperCarSedan();

            default:
                return null;
        }
    }
}
