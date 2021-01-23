/*      Question:-
        1. You are given a number n.
        2. You are given a base b. n is a number on base b.
        3. You are required to convert the number n into its corresponding value in decimal number system.
        Input Format
        A number n
        A base b
        Output Format
        A decimal number representing corresponding value of n in base b.
*/


import java.util.Scanner;

public class AnyBaseDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int rem = 0, conv = 0, pow = 0, count = 0;

        while (n != 0) {
            rem = n % 10;
            pow = (int) Math.pow(b, count);
            conv += rem * pow;
            n = n / 10;
            count++;
        }
        return conv;
    }
}
