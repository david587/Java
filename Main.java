package com.david;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS=12;
        final byte PERCENT= 100;

        Scanner sc = new Scanner(System.in);

        System.out.print("Principal:");
        int Principal = sc.nextInt();

        System.out.print("Annual Interest Rate:");
        float Rate = sc.nextFloat();
        float good = Rate/PERCENT/MONTHS;

        System.out.print("Period(Years):");
        byte Period = sc.nextByte();
        int numberofpay =Period *12;

        double Mortgage = (good*Math.pow(1+good,numberofpay))/ (Math.pow(1+good,numberofpay)-1);
        double Mortgage_final= Mortgage * Principal;
        String result= NumberFormat.getCurrencyInstance().format(Mortgage_final);
        System.out.println(result);


    }
}
