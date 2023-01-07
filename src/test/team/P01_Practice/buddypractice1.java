package test.team.P01_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class buddypractice1 {
    public static void main(String[] args) {

        // dizinin max ve min degerlerini bulma

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 adet sayı giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        int sayi4 = scan.nextInt();
        int sayi5 = scan.nextInt();

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(sayi1);
        sayilar.add(sayi2);
        sayilar.add(sayi3);
        sayilar.add(sayi4);
        sayilar.add(sayi5);
        System.out.println(sayilar);

        int min = 0;
        int max = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i) < sayi1)
                min = sayilar.get(i);

        }
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i) > sayi1)
                max = sayilar.get(i);

        }
        System.out.println(sayilar);
        System.out.println("Girdiginiz en kücük sayı : " + min);
        System.out.println("Girdiginiz en büyük sayı : " + max);

    }
}