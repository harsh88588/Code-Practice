/*      Question:-
        1. You are given a decimal number n.
        2.You are given a base b.
        3. You are required to convert the number n into its corresponding value in base b.
        Input Format
        A number n
        A base b
        Output Format
        A number representing corresponding value of n in number system of base b
*/


import java.util.Scanner;

public class DecimalAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        int rem = 0, bin = 0, count = 0;

        while (n != 0) {
            rem = n % b;
            int x = (int) Math.pow(10, count) * rem;
            bin += x;
            n = n / b;
            count++;
        }
        return bin;
    }
}
