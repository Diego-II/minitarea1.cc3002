package cc3002.minitarea1.measure.units;

public interface IMeasureUnit {
    IMeasureUnit addUnits(IMeasureUnit anotherUnit);

    double getLen();

    double toMeter();

    double toInches();
}
