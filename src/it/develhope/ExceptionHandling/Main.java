//continue to ask the user to input two integers:
//dividend
//divisor
//execute the division and print the quotient
//if the user inputs divisor==0, alert the user that is not possible to divide by zero

package it.develhope.ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input two integer: dividend and divisor.");

        int dividend = Integer.parseInt(s.nextLine());
        int divisor = Integer.parseInt(s.nextLine());

        try{
            System.out.println("Quotient = " + dividend / divisor);
        } catch (Exception e){
                e.printStackTrace();
                System.out.println("Error 404, not possible to divided by 0.");
            }
    }
}
