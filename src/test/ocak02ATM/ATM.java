package test.ocak02ATM;

import java.util.Scanner;

public class ATM {
    /*
    ATM

    Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
    Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

    Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

    Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

    Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekrani geri donsun.

    Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */

    static Scanner scan = new Scanner(System.in);

    static String kartNo = "1234123412341234";

    static String sifre = "1234";

    static double bakiye = 50000;

    public static void main(String[] args) {
        giris();

    }

    private static void giris() {
        System.out.println("Kart numarası giriniz : ");
        String kKartNo= scan.nextLine().replace(" ","");   // boslukları silme
        System.out.println("Şifre giriniz : ");
        String kSifre = scan.next();

        if (kSifre.equals(sifre) && kKartNo.equals(kartNo)){
            menu();
        }else {
            System.out.println("Kart no veya şifre hatalı !!! ");
            scan.nextLine();  // dummy(kukla-boş satır) ----> ard arda kullanılan scaner objelerinde olusan hatayı önlemek için kullanılır !!!
            giris();
        }


    }

    private static void menu() {
        System.out.println("********* WISEQUARTER BANK *********\n" +
                "1. BAKİYE SORGULA\n" +
                "2. PARA YATIR\n" +
                "3. PARA ÇEKME\n" +
                "4. PARA GÖNDERME\n" +
                "5. ŞİFRE DEĞİŞTİRME\n" +
                "6. ÇIKIŞ\n" +
                "SEÇİMİNİZ : ");
        int secim = scan.nextInt();

        switch (secim){
            case 1:{
                //bakiyeSorgula();
                //BakiyeSorgula bakiyeSorgula = new BakiyeSorgula();  oop konsept çözümü
                //bakiyeSorgula.bakiyeGoster();
                break;
            }
            case 2:{
                System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                double miktar = scan.nextDouble();
                paraYatırma(miktar);
                break;
            }
            case 3:{
                paraCekme();
                break;
            }
            case 4:{
                paraGonderme();
                break;
            }
            case 5:{
                sifreDegistir();
                break;
            }
            case 6:{
                System.out.println("***** Yine Bekleriz *****");
                System.exit(0);   // bu satırda kodu sonlandırır
            }
            default:{
                System.out.println("Yanlış değer girdiniz !!!");
                menu();
            }

        }
    }

    private static void sifreDegistir() {
        System.out.println("Eski şifreyi giriniz : ");
        String eSifre = scan.next();
        if (eSifre.equals(sifre)) {
            System.out.println("Yeni şifreyi giriniz : ");
            sifre = scan.next();
            scan.nextLine();  // dummy
            giris();
        }else {
            System.out.println("Eski şifreyi yanlış girdiniz !!!");
            sifreDegistir();
        }
    }

    private static void paraGonderme() {
        scan.nextLine();  // dummy
        System.out.println("IBAN no giriniz (IBAN no TR ile başlamalı) : ");
        String iban = scan.nextLine().toUpperCase().replace(" ","");

        if (iban.length() == 26 && iban.startsWith("TR")){
            System.out.println("Gönderilecek miktarı giriniz : ");
            double miktar = scan.nextDouble();
            if (miktar <= bakiye){
                bakiye -= miktar;
                bakiyeSorgula();
            }else {
                System.out.println("Göndermek istediğiniz tutar bakiyeden büyük !!!");
                paraGonderme();
            }

        }
    }

    private static void paraCekme() {
        System.out.println("Çekmek istediğiniz tutarı giriniz : ");
        double miktar = scan.nextDouble();

        if (miktar <= bakiye){
            bakiye -= miktar;
            bakiyeSorgula();
        }else {
            System.out.println("Çekmek istediğiniz miktar bakiyeden fazla !!!");
            paraCekme();
        }
    }

    private static void paraYatırma(double miktar) {
        bakiye += miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("Bakiyeniz : " + bakiye + " TL");
        menu();
    }
}
