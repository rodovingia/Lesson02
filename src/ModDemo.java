/**
 * Created by ronald on 14-2-2016.
 */
// Demonstrate the % operator.
class ModDemo {
    public static void main(String args[]) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.5;
        drem = 10.0 % 3.5;

        System.out.println("Result and remainder of 10 / 3: " +
                iresult + " " + irem);
        System.out.println("Result and remainder of 10.0 / 3.5: " +
                dresult + " " + drem);

    }
}