package pkg28_aralik_odev;

import java.util.Scanner;

public class ortadan_bol_ikisini_tersten_yazdir {

    public static void main(String[] args) {
        
        //Scanner sınıfını ekledik
        Scanner input = new Scanner(System.in);
        //kullanıcıdan kelime aldık
        System.out.println("Lutfen Bir Kelime Giriniz :");
        String kelime = input.nextLine();

        //kelime uzunluğunu n 'e atadık
        int n = kelime.length() / 2;
        //n 'e kadar ödndürdük
        for (int i = 0; i < n; i++) {

            //Ekrana Yazdırdık
            System.out.print(kelime.charAt(i + n));
            System.out.print(kelime.charAt(n - 1 - i));

        }

    }
}
