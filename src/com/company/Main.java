package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();

        //Catalan formula
        //C(n) = (2n)!/n!(n+1)!

        long catalan;

        catalan=(getFactorial(2*n)/(getFactorial(n)*getFactorial(n+1)));
        System.out.println(catalan);

    }
    //search for factorial
    public static long getFactorial(long n) {
        long factorial = 1;
        for (long i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
