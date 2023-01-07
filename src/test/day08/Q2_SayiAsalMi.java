package test.day08;

import java.util.ArrayList;
import java.util.List;

public class Q2_SayiAsalMi {
    public static void main(String[] args) {

        int input = 5;
        int count = 0;

        List<Integer> asalSayi = new ArrayList<>();

        //isPrime(input);

        while (count<10){

            input++;

            if (isPrime(input)){
                asalSayi.add(input);
                count++;
            }
        }
        System.out.println(asalSayi);
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i < num ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
