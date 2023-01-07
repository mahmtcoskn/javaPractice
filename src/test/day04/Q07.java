package test.day04;

public class Q07 {

    //1-100 ARASINDAKİ MÜKEMMEL SAYILARI BULAN METODU YAZINIZ

    public static void main(String[] args) {
        mukemmelSayi();

    }
    static void mukemmelSayi(){
        int toplam=0;
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i%j==0){
                    toplam+=j;
                }

            }
            if (toplam==i){
                System.out.println(i + " mükemmel sayıdır");
            }else
                System.out.println(i + " mükemmel sayı değildir");
            toplam=0;

        }

            

    }
}
