package pkg28_aralik_odev;

import java.util.Scanner;

public class rastgele_buyuklukte_yazdirma {

    public static void main(String[] args) {

        //Scanner Sınıfını Oluşturduk
        Scanner input = new Scanner(System.in);
        //Kullanıcıya Bilgi Verdik
        System.out.println("Lutfen Kucuk Harflerle Bir Cumle Giriniz :");
        String cumle = input.nextLine();
        //Cümle Uzunluğuna Kadar for 'u dönderdik
        for (int i = 0; i <= cumle.length() - 1; i++) {
            //0 ve 1 arası rastgele Sayı oluşturduk
            int rastgele = (int) (Math.random() * 2);
            //Eğer 0 gelirse harfi büyüttük.
            if (rastgele == 0) {
                System.out.print(Character.toUpperCase(cumle.charAt(i)));
            } //Gelmezse harfi Küçülttük. (Bu kısmı sadece cumle.charAt(i); şeklinde de yazabiliriz.
            else {
                System.out.print(Character.toLowerCase(cumle.charAt(i)));
            }
        }
    }
}
