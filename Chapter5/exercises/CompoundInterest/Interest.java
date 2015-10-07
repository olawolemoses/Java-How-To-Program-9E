/*
 *       Filename:  Interest.java
 *
 *    Description:  5.14 - Modify the compound interest application of Fig. 5.6
 *                  to repeat its steps for interest rates of 5% - 10 %. use a
 *                  for loop to vary the interest rate
 *
 *        Created:  06/10/15 14:34:43
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Interest{
    public static void main(String[] args){
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate = 0.0; // interest rate

        System.out.printf("%s%20s\n", "YEAR", "Amount on deposit");

        // set interest rate
        for(int r=5; r<=10; r++){
            rate = r;
            System.out.printf("Rate of interest %.2f%%\n", rate);
            // calculate for n years
            for(int year=0; year<=10; year++){
                amount = principal * Math.pow(1.0 + rate, year);

                System.out.printf("%4d%,20.2f\n", year, amount);
            }
        }

    }
}
