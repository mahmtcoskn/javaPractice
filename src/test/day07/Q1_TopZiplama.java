package test.day07;

public class Q1_TopZiplama {

    // Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 ü kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldığı toplam yolu ve yere vurma sayısını bulan do
    // while code blogu create ediniz.

    public static void main(String[] args) {

        double yukseklik = 2.00;
        double topunToplamYolu = 0;
        int yereVurmaSayisi = 0;

        do {
            topunToplamYolu += yukseklik;
            yereVurmaSayisi++;
            yukseklik *= 0.75;
            topunToplamYolu += yukseklik;

        }while (yukseklik>=1);   // yükseklil 1 den büyük olduğu sürece başa döner

        System.out.println("Topun aldigi toplam yol = " + topunToplamYolu +
                           "\nTopun yere vurma sayisi = " + yereVurmaSayisi);





    }

}
