package cc3002.minitarea1.measure.units;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasureTest {
    //Meters
    private IMeasureUnit x1;
    private IMeasureUnit x2;
    //Inches
    private IMeasureUnit y1;
    private IMeasureUnit y2;

    @BeforeEach
    public void setUp(){
        x1 = new Meters(1);
        x2 = new Meters(2);
        y1 = new Inches(39);
        y2 = new Inches(10);
    }

    public IMeasureUnit getMeter(double len){
        return new Meters(len);
    }

    private IMeasureUnit getInches(double len) {
        return new Inches(len);
    }


    @Test
    public void sameClassAddTest() {
        //Meters + Meters
        IMeasureUnit res1;
        res1 = x1.addUnits(x2);
        assertEquals(getMeter(3).getLen(),res1.getLen(),
                "Fail sum Meter + Meter");
        //Inches + Inches
        IMeasureUnit res2;
        res2 = y1.addUnits(y2);
        assertEquals(getInches(49).getLen(), res2.getLen(),
                "Fail sum Inches + Inches");
    }

    /**
     * Transform inches to meters
     */
    @Test
    public void inchToMeterTest(){
        double res1 = 0.3429;
        assertEquals(res1, getInches(13.5).toMeter(),
                "Error conversion Inches to Meters");
        double res2 = 0;
        assertEquals(res2, getInches(0).toMeter(),
                "Error conversion Inches to Meters");
        double res3 = 0.0127;
        assertEquals(res3, getInches(0.5).toMeter(),
                "Error conversion Inches to Meters");
    }

    /**
     * Add inches to meters:
     * Meters + Inches = Meters
     */
    @Test
    public void addInchToMeterTest(){
        //0[mt] + 1[in] = 0.0254[mt]
        IMeasureUnit res0;
        res0 = getMeter(0).addUnits(getInches(1));
        assertEquals(getMeter(0.0254).getLen(), res0.getLen());
        //1[mt] + 39[in] = 1.9906 [mt]
        IMeasureUnit res1;
        res1 = x1.addUnits(y1);
        assertEquals(getMeter(1.9906).getLen(),res1.getLen());
        //2[mt] + 10[in] = 2.254[mt]
        IMeasureUnit res2;
        res2 = x2.addUnits(y2);
        assertEquals(getMeter(2.254).getLen(),res2.getLen());
    }

    /**
     * Meter to inches
     */
    @Test
    public void meterToInchesTest(){
        double res0 = 0;
        assertEquals(res0,getMeter(0).toInches(),
                "Error conversion meters to inches");
        double res1 = 39.3701;
        assertEquals(res1,getMeter(1).toInches(),
                "Error conversion meters to inches");
        double res2 = 12.992133;
        assertEquals(res2,getMeter(0.33).toInches(),
                "Error conversion meters to inches");
        double res3 = 52.362233;
        assertEquals(res3,getMeter(1.33).toInches(),
                "Error conversion meters to inches");
    }

    /**
     * Add meters to inches:
     * Inches + Meters = Inches
     */
    @Test
    public void addMeterToInchesTest(){
        //0[in] + 1[mt] = 39.3701
        IMeasureUnit res0;
        res0 = getInches(0).addUnits(getMeter(1));
        assertEquals(getInches(39.3701).getLen(), res0.getLen());
        //39[in] + 1[mt] =  [in]
        IMeasureUnit res1;
        res1 = y1.addUnits(x1);
        assertEquals(getInches(78.37010000000001).getLen(),res1.getLen());
        //10[in] + 2[mt] = 2.254[mt]
        IMeasureUnit res2;
        res2 = y2.addUnits(x2);
        assertEquals(getInches(88.7402).getLen(),res2.getLen());
    }
}
