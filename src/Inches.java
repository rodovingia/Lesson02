/**
 * Created by ronald on 14-2-2016.
 */
/*
   Compute the number of cubic inches
   in 1 cubic mile.
*/
class Inches {
    public static void main(String args[]) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci +
                " cubic inches in cubic mile.");

    }
}