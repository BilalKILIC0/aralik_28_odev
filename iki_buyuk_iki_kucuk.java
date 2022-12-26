package pkg28_aralik_odev;

import java.util.Scanner;

public class iki_buyuk_iki_kucuk {

    public static void main(String[] args) {

        //Scanner Sınıfını Oluşturduk.
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan Kelime Girmesini İstedik.
        System.out.println("Lutfen Bir Kelime Giriniz :");
        String kelime = input.nextLine();

        //Kelime uzunluğunua kadar döndürdük
        for (int i = 0; i <= kelime.length() - 1; i++) {
            //b diye bir değişken tanımladık. i 'nin kalanını b 'ye atadık
            int b = i % 4;
            //Eğer kalan 0 ve 1 ise büyük yazdırdık
            if (b < 2) {

                System.out.print(Character.toUpperCase(kelime.charAt(i)));

            }
            //Eğer kalan 2 ve 3 ise küçük yazdırdık.
            if (b >= 2) {

                System.out.print(Character.toLowerCase(kelime.charAt(i)));
            }

        }
    }
}
