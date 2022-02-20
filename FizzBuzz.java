package com.david;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //FizzBuzz
        Scanner sc=new Scanner(System.in);

        System.out.print("Number:");
        int num= sc.nextInt();// %5 --> fizz , %3 --> buzz ,  both--> fizzbuzz, semmivel se-->megkapjuk a bekért számot

        if (num%5==0 && num%3==0){
            System.out.println("FizzBuzz");
        }

        else if(num%5==0){
            System.out.println("Fizz");

        }
        else if(num%3==0){
            System.out.println("Buzz");

        }

        else{
            System.out.println(num);
        }
    }
}
