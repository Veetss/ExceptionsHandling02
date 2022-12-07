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
