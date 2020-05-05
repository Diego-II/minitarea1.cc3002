package cc3002.minitarea1.measure.units;

public class Inches extends abstractMeasureUnit {

    public Inches(double len) {
        super(len);
    }

    @Override
    public IMeasureUnit addUnits(IMeasureUnit anotherUnit) {
        double sum = this.getLen() + anotherUnit.toInches();
        return new Inches(sum);
    }

    @Override
    public double toMeter() {
        double inchToMeter = 0.0254;
        double inches = this.getLen();
        double transformed = inches*inchToMeter;
        return transformed;
    }

    @Override
    public double toInches() {
        return this.getLen();
    }
}
