/**
 * Created by ronald on 14-2-2016.
 */
/*
   This program attempts to declared a variable
   in an inner scope with the same name as one
   defined in an outer scope.

   *** This program will not compile. ***
*/
class NestVar {
    public static void main(String args[]) {
        int count;

        for(count = 0; count < 10; count = count+1) {
            System.out.println("This is count: " + count);

            int count2; // illegal!!!
            for(count = 0; count < 2; count++)
                System.out.println("This program is in error!");
        }
    }
}