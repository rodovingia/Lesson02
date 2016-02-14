/**
 * Created by ronald on 14-2-2016.
 */
// *** This program will not compile. ***
class DtoL {
    public static void main(String args[]) {
        long L;
        double D;

        D = 100123285.0;
        //L = D; // Illegal!!!
        L = 0L;

        System.out.println("L and D: " + L + " " + D);

    }
}