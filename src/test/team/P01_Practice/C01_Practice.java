package test.team.P01_Practice;

import java.util.Scanner;

public class C01_Practice {
    public static void main(String[] args) {
        /*
        Soru-1 Dairenin alanini ve cevresini hesaplayın
        - r=7
        - Pi=3,14
         */
        double r=7;
        double Pi=3.14;

        System.out.println("Dairenin cevresi = " + 2*Pi*r);
        System.out.println("Dairenin alani = " + Pi*r*r);
        System.out.println("-------------------------------");

        /*
        Soru-2 Dikdortgenin alanini ve cevresini hesaplayın
         */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("uzun kenarı ve kısa giriniz : ");
        double uzunKenar = scan1.nextDouble();
        double kisaKenar = scan1.nextDouble();
        System.out.println("Dikdortgenin alani : " + uzunKenar*kisaKenar +
                "\nDikdortgenin cevresi : " + (uzunKenar+kisaKenar)*2);
        System.out.println("-------------------------------");

        /*
        Soru-3 Kullanıcıdan 5 say alip ortalamasini hesaplayın
         */
        Scanner scan2 = new Scanner(System.in);
        System.out.println("5 tane sayı giriniz ");
        double sayi1 = scan2.nextDouble();
        double sayi2 = scan2.nextDouble();
        double sayi3 = scan2.nextDouble();
        double sayi4 = scan2.nextDouble();
        double sayi5 = scan2.nextDouble();
        System.out.println("Sayıların ortalaması : " + (sayi1+sayi2+sayi3+sayi4+sayi5)/5);
        System.out.println("-------------------------------");

        /*
        Soru-4 Kullanıcıdan bir sayı alın ve bu sayının küpünün yarısını hesaplayın
         */
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        double sayiKup = scan3.nextDouble();
        System.out.println("Sayının küpünün yarısı : " + (sayiKup*sayiKup*sayiKup)/2);
        System.out.println("-------------------------------");

        /*
        Soru-5 Kullanıcıdan karenin kenar uzunlugunu alın. Bu uzunlukla karenin alanını ve
        cevresini hesaplayın
         */

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Karenin kenar uzunlugunu giriniz : ");
        double kareKenar = scan4.nextDouble();
        System.out.println("Karenin alanı : " + kareKenar*kareKenar +
                "\nKarenin cevresi : " + 4*kareKenar);

    }
}
