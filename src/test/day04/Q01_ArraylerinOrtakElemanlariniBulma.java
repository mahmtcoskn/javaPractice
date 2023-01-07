package test.day04;

import java.util.ArrayList;
import java.util.Arrays;

public class Q01_ArraylerinOrtakElemanlariniBulma {
    /*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
    public static void main(String[] args) {

        String[] array1=new String[5];
        System.out.println("array1 referansi = " + array1);  // array1 referansi = [Ljava.lang.String;@372f7a8d
        System.out.println("array1 = " + Arrays.toString(array1));  // array1 = [null, null, null, null, null]


        array1[0]="Jhon";
        System.out.println("array1 = " + Arrays.toString(array1));  // [Jhon, null, null, null, null]
        array1[1]="Brad";
        array1[2]="Angel";
        array1[3]="Sofia";
        array1[4]="Emily";

        System.out.println("array1 = " + Arrays.toString(array1));  // [Jhon, Brad, Angel, Sofia, Emily]

        String [] array2 = {"sofia","brad","grace","emily","hazel"};

        System.out.println("array2 = " + Arrays.toString(array2));  // [sofia, brad, grace, emily, hazel]




        ortakElemanlar(array1,array2);

//      * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}


    }

    private static void ortakElemanlar(String[] arr1, String[] arr2) {

        ArrayList <String> arrList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i].equalsIgnoreCase(arr2[j])){

                    arrList.add(arr1[i]);
                }
            }
        }
        System.out.println(arrList);  // [Brad, Sofia, Emily]
    }
}
