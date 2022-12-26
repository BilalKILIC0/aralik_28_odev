package pkg28_aralik_odev;

import java.util.Scanner;

public class sesli_sessiz_harf {

    public static void main(String[] args) {

        //Scanner sınıfını oluşturduk
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan kelime Girmesini istedik
        System.out.println("Lutfen Kucuk Harflerle Bir Kelime Giriniz :");
        String kelime = input.nextLine();

        //a, e, ı, i, o, ö, u, ü 
        //Sesli harfleri bir dizide tanımladık
        char sesli[] = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};

        //Değişkenlerimizi Tanımladık
        String k1 = "";
        String k2 = "";

        //Kelime Uzunluğuna kadar dönderdik
        for (int i = 0; i <= kelime.length() - 1.; i++) {

            //Sayac tanımladık 
            int sayac = 0;
            //Dizi uzunuluğuna kadar dönderdik
            for (int j = 0; j <= sesli.length - 1; j++) {

                //Eğer gelen eleman sesli dizisinin içinde var ise k1 ile topladık
                if (kelime.charAt(i) == sesli[j]) {

                    k1 += kelime.charAt(i);
                    sayac++;
                    //Döngünün boş yere dönmesini engelledik
                    break;
                }
            }
            //Dizi dışındaki for 'un içine if ekleyip sayacın arttığını veya artmadığını kontrol ettik
            if (sayac == 0) {
                //sayac 0 ise kelimenin o harfini k2 ile topladık
                k2 += kelime.charAt(i);
            }
        }
        //K1 VE K2 'yi Ekrana Yazdırdık.
        System.out.print("Sesli Harflerden Olusturulmus Kelime :" + k1);
        System.out.print("\nSessiz Harflerden Olusturulmus Kelime :" + k2 + "\n");
    }
}
