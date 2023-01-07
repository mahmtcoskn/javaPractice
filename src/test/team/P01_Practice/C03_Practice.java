package test.team.P01_Practice;

import java.util.Scanner;

public class C03_Practice {
    public static void main(String[] args) {
        /*
Soru 9-)
Girilen zamanı saniyeye çeviriniz.
Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
Ipucu:
Saati alıp saniyeye cevirebilirsiniz.  Kullanıcıdan ayrı ayrı alabilirsiniz veya
kullanıcıdan hepsini birlikte alabilirsiniz.
*/
        // Soru 9-)
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen saati giriniz : ");
        int saat = scan.nextInt();
        System.out.println("lutfen dakikayı giriniz : ");
        int dakika = scan.nextInt();
        System.out.println("lutfen saniyeyi giriniz : ");
        int saniye = scan.nextInt();
        int toplamSaniye = (saat*3600)+(dakika*60)+saniye;
        System.out.println("girilen degerlere göre toplam saniye : " + toplamSaniye);

        //-------------------------------------------------------------------
/*
Soru 10-)
Klasik Soru :slightly_smiling_face:
Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

**indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m)
// If konusunu hatırlayın!***
Kullanıcıya aşağıdaki gibi mesaj verin:

Eğer VKİ 18.5'ten az ise --> zayıfsınız
Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
VKİ 30'a eşit veya daha fazlaysa --> obez

ÖRNEK :

Ağırlık : 71
Yükseklik : 1,72

ÇIKTI :

VKİ değeriniz : 23.99945916711736 Kilonuz

 */
        //Soru 10-)
        Scanner scanEndeks = new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz : ");
        double kilo = scanEndeks.nextDouble();
        System.out.println("lutfen boyunuzu giriniz : ");
        double boy = scanEndeks.nextDouble();
        double endeks = kilo / (boy*boy);

        if (endeks<=18.5){
            System.out.println("VKİ : " + endeks + " zayıfsınız");
        }else if (endeks>18.5 && endeks<=25){
            System.out.println("VKİ : " + endeks + " ideal kilo");
        }else if (endeks>25 && endeks<=30){
            System.out.println("VKİ : " + endeks + " şişmansınız");
        }else if (endeks>30){
            System.out.println("VKİ : " + endeks + " obez");
        }
        //------------------------------------------------------------

/*
Soru 11-)
Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
Ad ve soyadın baş harfleri büyük olmalıdır
Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
Giriş :
		 > Gandalf Grey 563245879632
Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632 (edited)
 */
        // Soru 11-)
        Scanner scan2 = new Scanner(System.in);
        System.out.println("lutfen adınızı giriniz : ");
        String ad = scan2.nextLine();
        System.out.println("lutfen soyadınızı giriniz : ");
        String soyad = scan2.nextLine();
        System.out.println("lutfen kredi kartı numaranızı giriniz : ");
        String kartNo = scan2.nextLine();

        if (kartNo.length()<16 && kartNo.length()>16){
            System.out.println("Geçersiz kredi kartı numarası");
        }else {
            System.out.println("bilgileriniz kaydedildi");
        }
        System.out.println("İsim : " + ad.toUpperCase().charAt(0) + "**** " + soyad.toUpperCase().charAt(0)+ "****");
        System.out.println("CCN : " + " **** " + " **** " + " **** " + kartNo.substring(12,16));

        //---------------------------------------------------------------




/*
Soru 12-)
Verilen iki sayının toplamını
-sıfırdan büyük veya eşit olabilir
-hesaplamak ve yazdırmak için bir program oluşturalım
Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

Ipucu:  IF/Else kullanabilirsiniz.
Örnek:
İki tamsayı girin:
25  veya  4567986321453
46   veya 123456
Konsolda Çıktı :
Sayıların toplamı: 71  veya  Fazla Yüklenme (edited)
 */
        // Soru 12-)
        int sayı1=5;
        long sayı2=6;

        String toplam= " "+sayı1+sayı2;

        int basamakSayısı=10;

        if (toplam.length()>=basamakSayısı){
            System.out.println("Fazla yüklenme");
        }else {

            System.out.println("Sayıların toplamı :" +(sayı1+sayı2));
        }

        //-------------------------------------------------------------
/*
Soru 13-)
Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
Ipucu:
Switch konusunu hatırlayalım!
*/
        // Soru 13-)
        String cvp1 = "a";
        String cvp2 = "b";
        String cvp3 = "c";
        char cevap = '1';
        switch (cevap){
            case 'a' :
                System.out.println("İsteğiniz işleniyor");
                break;
            case 'b' :
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
                break;
            case 'c' :
                System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
        }

        //-------------------------------------------------------------------
/*
Soru 14-)
Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise
konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
Ipucu:
IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
*/
        // Soru 14-)
        String isim = "ada";
        if (isim.charAt(0) == isim.charAt(1) ||
                isim.charAt(0) == isim.charAt(2) ||
                    isim.charAt(1) == isim.charAt(2)){
            System.out.println("Dize yinelenen karakterlere sahip");
        }else {
            System.out.println("Dize benzersiz karakterlere sahip");
        }
        //----------------------------------------------------------

/*
Soru 15-)
Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
-> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
-> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
Örn:
	 isim1= masa
         isim2= ali
	 Konsol => maalisa
*/
        // Soru 15-)
        Scanner scan4 = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz : ");
        String isim1 = scan4.nextLine();
        System.out.println("lutfen bir isim daha giriniz : ");
        String isim2 = scan4.nextLine();

        if (isim1.length()%2==0){
            System.out.println((isim1.substring(0,isim1.length()/2) +
                                isim2 + isim1.substring(isim1.length()/2)));
        }else {
            System.out.println("isim2, isim1'e eklenemez");
        }
        //---------------------------------------------------------
/*
Soru 16-)
Kullanıcıdan en az 5 harfli bir kelime alın.
Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
Loopun içerisinde StringM methodlarından  yararlanalım!

Soru 17-)
Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
Örnek:
char ch1=            'a'
String name =     "Ali bakkala geç gitti."
Beklenen Çıktı=    a sayısı = 3
Ipucu:
Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!
         */
    }
}
