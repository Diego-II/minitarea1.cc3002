/**
 * @author: Diego Irarrazaval
 */
package cc3002.minitarea1.measure.units;

/**
 * IMeasureUnit.java
 * Interface class that contains the following methods:
 * getLen()
 * toMeter()
 * toInches()
 * addUnits(IMeasureUnit anotherUnit)
 *
 */

public interface IMeasureUnit {
    /**
     * Returns double
     * @return  the measure ammount.
     */
    double getLen();

    /**
     * Returns a double
     * @return  the current measure converted to Meters.
     * If the unit calling toMeter() is already a meter, returns
     * getLen().
     */
    double toMeter();

    /**
     * Returns a double
     * @return the current measure converted to Inches
     * Similar behaviour to toMeter()
     */
    double toInches();

    /**
     * Returns the sum of  the two Units taking the first unit as
     * base:
     * Meter + Inches = Meter
     * Inches + Meter = Inches
     * @param anotherUnit  IMeasureUnit to be added
     * @return  The sum of the units
     */
    IMeasureUnit addUnits(IMeasureUnit anotherUnit);
}
