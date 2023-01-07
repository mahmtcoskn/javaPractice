package test.team.P01_Practice;

import java.util.Scanner;

public class C02_Practice {
    public static void main(String[] args) {

        // Soru-6
        Scanner scan = new Scanner(System.in);
        System.out.println("Günlük kaç bardak çay iciyorsunuz? : ");
        int cay = scan.nextInt();
        System.out.println("Günlük kaç adet şeker tüketiyorsunuz? : ");
        int seker = scan.nextInt();

        int cayMiktari = cay*365;
        double sekerMiktari = seker*1.5*365/1000;

        System.out.println("Yıllık cay tüketimi : " + cayMiktari + " Bardak" +
                           "\nYıllık seker tüketimi : " + sekerMiktari + " Kg");

        System.out.println("*******************************************");

        // Soru-7
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Double sayi degeri giriniz : ");
        double doubleSayi = scan1.nextDouble();
        System.out.println("Float sayi degeri giriniz : ");
        float floatSayi = scan1.nextFloat();

        System.out.println("Yeni tam sayi degeri : " + (int)doubleSayi +
                           "\nYeni short sayi degeri : " + (short)floatSayi);

        System.out.println("*******************************************");

        // Soru-8
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz : ");
        int sayi = scan2.nextInt();

        int rakamlarToplami =0;
        int birlerBasamagi =0;

        birlerBasamagi = sayi % 10;
        sayi/=10;
        rakamlarToplami += birlerBasamagi;
        birlerBasamagi = sayi % 10;
        sayi/=10;
        rakamlarToplami += birlerBasamagi;
        birlerBasamagi = sayi % 10;
        sayi/=10;
        rakamlarToplami += birlerBasamagi;

        System.out.println("Sayinin basamaklari toplami : " + rakamlarToplami );

    }
}
