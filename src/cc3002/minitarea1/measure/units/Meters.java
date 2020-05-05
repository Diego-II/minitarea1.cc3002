package cc3002.minitarea1.measure.units;

import org.jetbrains.annotations.NotNull;

/**
 * Abstract class 
 */
public class Meters extends abstractMeasureUnit {

    public Meters(double len) {
        super(len);
    }

    @Override
    public IMeasureUnit addUnits(IMeasureUnit anotherUnit) {
        double sum = this.getLen() + anotherUnit.toMeter();
        return new Meters(sum);
    }


    @Override
    public double toMeter() {
        return this.getLen();
    }

    @Override
    public double toInches() {
        double meterToInch = 39.3701;
        double meters = this.getLen();
        double transformed = meters*meterToInch;
        return transformed;
    }

}
