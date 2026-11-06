import java.awt.*;

import static java.awt.Color.*;

public class CarTest {
    private static void reportResult(String testName, boolean success) {
        IO.println((success ? "SUCCESS: " : "FAILURE: ") + testName);
    }

    /** Tests whether a Saab95 with turbo enabled
     *  gains more speed than one without.
     */
    private static void testTurbo() {
        Saab95 slowSaab = new Saab95();
        Saab95 fastSaab = new Saab95();
        fastSaab.setTurboOn();
        slowSaab.setTurboOff();
        fastSaab.gas(0.5);
        slowSaab.gas(0.5);
        boolean result = slowSaab.getCurrentSpeed() < fastSaab.getCurrentSpeed();
        reportResult("Turbo yields more speed", result);
    }

    public static void testStartEngine() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        boolean result = volvo.getCurrentSpeed() == 0.1;
        reportResult("Speed at starting engine", result);
    }

    public static void testStopEngine() {
        Saab95 saab = new Saab95();
        saab.stopEngine();
        boolean results = saab.getCurrentSpeed() == 0;
        reportResult( "Speed at stopping engine", results);
    }

    private static void testnrDoorsSaab95() {
        Saab95 saab = new Saab95();
        boolean result = saab.getNrDoors() == 2;
        reportResult( "Number of doors on a saab95", result);
    }

    private static void testnrDoorsVolvo240() {
        Volvo240 volvo = new Volvo240();
        boolean result = volvo.getNrDoors() == 4;
        reportResult( "Number of doors on a volvo 240", result);
    }

    private static void testColorSaab95() {
        Saab95 saab = new Saab95();
        boolean result = saab.getColor().equals(Color.red);
        reportResult( "color on Saab95",result);

    }

    private static void testColorVolvo240() {
        Volvo240 volvo = new Volvo240();
        boolean result = volvo.getColor().equals(Color.black);
        reportResult( "color on Volvo240",result);

    }

    static void main() {
        testTurbo();
        testStartEngine();
        testStopEngine();
        testnrDoorsSaab95();
        testnrDoorsVolvo240();
        testColorVolvo240();
        testColorSaab95();

    }
}
