package test.team.P01_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C100123_OrtkElemn {


    public static void main(String[] args) {
        /*
        Kullanicidan deger alarak iki String liste olusturun.
        Kullanici deger girmeyi birakmak icin 0’a basmalidir.
        Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        liste1 : .......
        liste2 : .......
        ortak elementler : .......
         */


        ArrayList<String> liste1 = new ArrayList<>();
        System.out.println("Lütfen 1.liste için eleman giriniz. Sonlandırmak için 0 a basınız");
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 =list1Input(liste1,scan);

        ArrayList<String> liste2 = new ArrayList<>();
        System.out.println("Lütfen 2.liste için eleman giriniz. Sonlandırmak için 0 a basınız");
        ArrayList<String> list2 =list1Input(liste2,scan);
        System.out.println("liste1 : " + list1);
        list1.retainAll(list2);

        System.out.println("liste2 : " + list2);
        System.out.println("ortak elementler : " + list1);

    }
     static ArrayList<String> list1Input(ArrayList<String> list1, Scanner scan ){
       String i=scan.nextLine();
        if (!"0".equals(i)){
            list1.add(i);
            list1Input(list1,scan);
    }
        return list1;
}

}