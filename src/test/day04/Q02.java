package test.day04;

public class Q02 {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

    public static void main(String[] args) {
        for (char i = 0; i <=255 ; i++) {
            /*
            System.out.println(i);
            System.out.println((char) i);
             */
            if (i>64 && i<91)
                System.out.println((int)i +"="+ i);
        }
    }
}
