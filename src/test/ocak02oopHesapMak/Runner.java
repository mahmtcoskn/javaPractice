package test.ocak02oopHesapMak;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println("Yapılacak işlermi giriniz (+,-,*,/)");
        char islem = scan.next().charAt(0);
        Islemler islemler = new Islemler();  // işlemler classından obje oluşturduk
        switch (islem){
            case '+':{
                System.out.println("Toplam = " + islemler.toplama(sayi1, sayi2));
                break;
            }
            case '-':{
                System.out.println("Fark = " + islemler.cıkarma(sayi1, sayi2));
                break;
            }
            case '*':{
                System.out.println("Çarpım = " + islemler.carpma(sayi1, sayi2));
                break;
            }
            case '/':{
                System.out.println("Bölüm = " + islemler.bolme(sayi1, sayi2));
                break;
            }
        }
    }
}
