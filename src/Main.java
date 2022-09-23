import org.w3c.dom.ranges.Range;

import java.util.Scanner;

public class Main {
    private static long principle;
    private static long principle1;

    public static void main(String[] args) {
        //Principle
        Scanner principle = new Scanner(System.in);
        long principle1=0;
        while (true){
            System.out.print("principle(100k-1M):");
             principle1 = principle.nextLong();

           //Error handling
            if (principle1>=10000 && principle1<=1000000) {
                break;
            }
            else {
                System.out.println("Enter value btw 100k-1M");
            }


        }
        //annual interest

        Scanner Rate = new Scanner(System.in);
        double rate=0;

         while (true){
             System.out.print("Annual Rate:");
              rate=Rate.nextShort();
             //Error handling
             if (rate>0 && rate<=30)
                 break;
             else System.out.println("Enter value btw 0-30");
         }
    rate= (double) ((rate/100)/12);
         //paymentNumbers
        Scanner payments= new Scanner(System.in);
        double period=0;
        while (true){
            System.out.print("Periods(Years):");
            period=payments.nextDouble();
            //Error handling
            if (period>0 && period<=30)
                break;
            else System.out.println("Enter value btw 1-30");
        }
    period=period*12;
        //mortgage calculator
        double mortgage = (principle1 * rate* Math.pow((rate+1),period))/Math.pow((rate+1),period)-1;
        System.out.println("Mortgage:"+mortgage);

     }

}


