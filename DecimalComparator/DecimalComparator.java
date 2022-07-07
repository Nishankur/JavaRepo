public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double real1, double real2) {
        int nondec1, nondec2;
        int dec1, dec2;
        nondec1 = (int) real1;
        nondec2 = (int) real2;
        dec1 = (int)(real1*1000) - nondec1*1000;
        dec2 = (int)(real2*1000) - nondec2*1000;

        if (nondec1 == nondec2 && dec1 == dec2) {
            return true;
        } else {
            return false;
        }
    }
}


