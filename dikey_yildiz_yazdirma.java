package pkg28_aralik_odev;

import java.util.Scanner;

public class dikey_yildiz_yazdirma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Kelime Giriniz :");
        String kelime = input.nextLine();

        System.out.println();

        char alfabe[] = {'A', 'B', 'C', ' ', 'D', 'E', 'F', 'G', ' ', 'H', ' ', 'I', 'J', 'K', 'L', 'M', 'N', 'O', ' ', 'P', 'R', 'S', ' ', 'T', 'U', ' ', 'V', 'Y', 'Z'};

        for (int i = 0; i <= kelime.length() - 1; i++) {

            for (int j = 0; j <= alfabe.length - 1; j++) {

                if (Character.toUpperCase(kelime.charAt(i)) == alfabe[j]) {
                    
                    //int sayac = 0; 
                    System.out.print(Character.toUpperCase(kelime.charAt(i)) + " --> ");

                    for (int k = 0; k <= j; k++) {

                        System.out.print("*");
                        // sayac++;

                    }
                    //Sayac eklersek son kısmına kaç tane yıldız attığımızı görürüz.
                    //System.out.print(" "+sayac);
                }
            }
            System.out.println();
        }
    }
}
