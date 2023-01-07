package test.day07;

import java.util.Random;
import java.util.Scanner;

public class Q2_TasKagitMakas {
    // Bilgisayara karsi tas kagit makas oynayın
    // 5 puana ilk ulasan kazansın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoise = 0;
        int compChoise = 0;
        int user = 0;
        int comp = 0;

        do {
            System.out.println("""
                    Asagidakilerden biriniz seciniz\s
                    1 - Tas
                    2 - Kagit
                    3 - Makas""");
            userChoise = scan.nextInt();

            // Bilgisayarin secimini aliyoruz

            compChoise = random.nextInt(3) + 1;

            switch (compChoise) {
                case 1 -> System.out.println("===== Bilgisayar = Tas =====");
                case 2 -> System.out.println("===== Bilgisayar = Kagit =====");
                case 3 -> System.out.println("===== Bilgisayar = Makas =====");
            }
            switch (userChoise) {
                case 1 -> System.out.println("===== Oyuncu = Tas =====");
                case 2 -> System.out.println("===== Oyuncu = Kagit =====");
                case 3 -> System.out.println("===== Oyuncu = Makas =====");

            }

            // Karsilastirmasi ve puanlamasi

            if (userChoise == 1 && compChoise == 2) {
                System.out.println("kagit tasi sarar! -- Bilgisayar +1 -- ");
                comp++;
                System.out.println("Oyuncu = " + user + "  >> Bilgisayar = " + comp);

            } else if (userChoise == 1 && compChoise == 3) {
                System.out.println("tas makasi kirar! -- Oyuncu +1 -- ");
                user++;
                System.out.println("Oyuncu = " + user + "  >> Bilgisayar = " + comp);

            } else if (userChoise == 2 && compChoise == 1) {
                System.out.println("kagit tasi sarar! -- Oyuncu +1 -- ");
                user++;
                System.out.println("Oyuncu = " + user + "  >> Bilgisayar = " + comp);

            } else if (userChoise == 2 && compChoise == 3) {
                System.out.println("makas kagidi keser! -- Bilgisayar +1 -- ");
                comp++;
                System.out.println("Oyuncu = " + user + "  >> Bilgisayar = " + comp);

            } else if (userChoise == 3 && compChoise == 2) {
                System.out.println("makas kagidi keser! -- Oyuncu +1 -- ");
                user++;
                System.out.println("Oyuncu = " + user + "  >> Bilgisayar = " + comp);

            } else if (userChoise == 3 && compChoise == 1) {
                System.out.println("tas makasi kirar! -- Bilgisayar +1 -- ");
                comp++;
                System.out.println("Oyuncu = " + user + "  >> Bilgisayar = " + comp);

            } else {
                System.out.println("Berabere!");
                System.out.println("Oyuncu = " + user + "  >> Bilgisayar = " + comp);
            }

        } while (user != 5 && comp != 5);{

        if (user > comp)
            System.out.println("===========================" +
                    " Sen kazandin!!!" +
                    "===========================");
        else
            System.out.println("===========================" +
                    " Malesef kaybettin!!!" +
                    "===========================");
    };
    scan.close();
    }
}
