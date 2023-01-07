package test.day06;

import java.util.Locale;
import java.util.Scanner;

public class Q1_BirimDonusturucu {

    // saati saniyeye, mil i kiometreye, kilogramı gram a
    // ceviren method yazınız
    // bu methodu main methodun disinda olusturup main mehodun
    // icinden cagiriniz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Donusturmek istediginiz birimi giriniz:\n=>Saat\n=>Mil\n=>Kilogram");
        String birim = scan.nextLine().toLowerCase();   // toLowerCase yazılan inputu küçültmek için !!!

        System.out.println("Donusturmek istediginiz birinin miktarini giriniz : ");
        double miktar = scan.nextDouble();

        donusturucu(birim,miktar);
    }

    private static void donusturucu(String brm, double mktr) {

        switch (brm){
            case "saat":
                System.out.println( mktr + " saat " + mktr*60*60 + " saniyedir. ");
                break;
            case "mil":
                System.out.println( mktr + " mil " + mktr*1.6 + " kilometredir. ");
                break;
            case "kilogram":
                System.out.println( mktr + " kilogram " + mktr*1000 + " gramdir. ");
                break;
            default:
                System.out.println(" Saat-Mil-Kilogram dısında deger girdiniz !!!");
        }
    }
}
