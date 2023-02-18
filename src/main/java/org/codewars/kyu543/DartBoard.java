package org.codewars.kyu543;

public class DartBoard {

    public String getScore(double x, double y)
    {
        double radius = Math.sqrt(x * x + y * y);
        if (radius < 12.7) {
            return "DB";
        }
        if (radius < 31.8) {
            return "SB";
        }
        if (radius >= 340) {
            return "X";
        }
        StringBuilder result = new StringBuilder();
        if (radius >= 198 && radius < 214) result.append("T");
        if (radius >= 324) result.append("D");
        double degs = Math.toDegrees(Math.atan(x / y));



//        The diameters of the circles on the dartboard are:
//    Bull's eye: `12.70 mm`
//        Bull: `31.8 mm`
//        Triple ring inner circle: `198 mm`
//        Triple ring outer circle: `214 mm`
//        Double ring inner circle: `324 mm`
//        Double ring outer circle: `340 mm`
        // Outside of the board: `"X"`
        //Bull's eye: `"DB"`
        //Bull: `"SB"`
        //A single number, example: `"10"`
        //A triple number: `"T10"`
        //A double number: `"D10"`
        return "";
    }
}
