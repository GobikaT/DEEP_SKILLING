package slfj_practice;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLFJ4 {

    private static final Logger logger =
            LoggerFactory.getLogger(SLFJ4.class);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int a = sc.nextInt();

        if (a <= 18) {
            logger.warn("Under 18 are not eligible.");
        }

        try {
            int b = a / 0;
            System.out.println(b);
        } catch (ArithmeticException e) {
            logger.error("Arithmetic Exception occurred.", e);
        }

        sc.close();
    }
}