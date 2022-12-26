package pkg28_aralik_odev;

import java.util.Scanner;

public class buyukse_kucuk_kucukse_buyuk {

    public static void main(String[] args) {
        
        //Scanner Sınıfını Oluşturduk
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan Bir Cümle Aldık
        System.out.println("Lutfen Bir Cumle Giriniz :");
        String cumle = input.nextLine();

        //Cümle uzunluğu Kadar Döndürdük.
        for (int i = 0; i <= cumle.length() - 1; i++) {
            //Eğer Gelen harf , o harfin büyük değerine eşitse if 'e Girdirdik
            if (cumle.charAt(i) == Character.toLowerCase(cumle.charAt(i))) {
                //O harfi Küçülttük.
                System.out.print(Character.toUpperCase(cumle.charAt(i)));

            }
            //Eğer Gelen Harf , o harfin küçük değerine eşitse if 'e Girdirdik.
            if (cumle.charAt(i) == Character.toUpperCase(cumle.charAt(i))) {
                //O Harfi Büyüttük.
                System.out.print(Character.toLowerCase(cumle.charAt(i)));
            }
        }
    }
}
