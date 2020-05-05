package cc3002.minitarea1.measure.units;

public abstract class abstractMeasureUnit implements IMeasureUnit {
    private final double len;

    protected abstractMeasureUnit(double len) {
        this.len = len;
    }

    public double getLen(){
        return this.len;
    }

    public abstract IMeasureUnit addUnits(IMeasureUnit anotherUnit);
}
