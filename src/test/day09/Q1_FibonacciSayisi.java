package test.day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q1_FibonacciSayisi {

    static boolean fibo;
    static int x;
    static int y;

    public static void main(String[] args) {

        int input = 250;

        checkFibonacci (input);

        if (fibo) System.out.println("fibonacci sayiniz girin.");
        else System.out.println("fibonacci sayisi : " + x + " and "+ y);

    }

    private static boolean checkFibonacci(int input){

        if (input<0){
            System.out.println("fibonacci 0 dan kucuk olamaz");
            return false;
        }

        List<Integer>fibonacci = new ArrayList<>();

        // 0 1 1 2 3 5 8 13...

        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 2; i < input ; i++) {

            fibonacci.add(fibonacci.get(i-1)+ fibonacci.get(i-2));

            if (fibonacci.get(i)>= input){
                break;
            }
        }
        System.out.println(fibonacci);

        if (fibonacci.get(fibonacci.size()-1)==input)
            fibo = true;
        else fibo = false;

         x = fibonacci.get(fibonacci.size()-1);
         y = fibonacci.get(fibonacci.size()-2);

        return fibo;
   }
}
