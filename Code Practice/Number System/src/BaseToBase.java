/*      Question:-
        1. You are given a number n.
        2. You are given a base b1. n is a number on base b.
        3. You are given another base b2.
        4. You are required to convert the number n of base b1 to a number in base b2.
        Input Format
        A number n
        A base b1
        A base b2
        Output Format
        A number of base b2 equal in value to n of base b1.
*/


import java.util.Scanner;

public class BaseToBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        int baseToDec = getBaseToDecimal(n, sourceBase);
        System.out.println(getDecimalToBase(baseToDec, destBase));
    }
    public static int getBaseToDecimal(int n, int sourceBase) {
        int rem = 0, count = 0, dec = 0, pow = 0;

        while (n != 0) {
            rem = n % 10;
            pow = (int) Math.pow(sourceBase, count) * rem;
            dec += pow;
            n /= 10;
            count++;
        }
        return dec;
    }
    public static int getDecimalToBase(int baseToDec, int destBase) {
        int rem = 0, count = 0, base = 0, pow = 0;

        while (baseToDec != 0) {
            rem = baseToDec % destBase;
            pow = (int) Math.pow(10, count) * rem;
            base += pow;
            baseToDec /= destBase;
            count++;
        }
        return base;
    }
}
