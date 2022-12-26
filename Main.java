//TAŞ - KAĞIT - MAKAS OYUNU
package pkg28_aralik_odev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String player1;
        String bilgisayar;
        int temp;

        do {

            System.out.print("""
                         Lutfen Tas Icin 0 
                         Kagit icin 1
                         Makas icin 2 Tuslayiniz.
                         """);
            temp = input.nextInt();

        } while (temp != 0 && temp != 1 && temp != 2);

        String oyun[] = {"Tas", "Kagit", "Makas"};

        int rastgele = (int) (Math.random() * 3);

        player1 = oyun[temp];
        bilgisayar = oyun[rastgele];

        if (player1.equals("Tas") && bilgisayar.equals("Makas") || player1.equals("Kagit") && bilgisayar.equals("Tas")
                || player1.equals("Makas") && bilgisayar.equals("Kagit")) {

            System.out.println("\nTebrikler Kazandiniz ...\n");
        } else if (player1.equals("Tas") && bilgisayar.equals("Tas") || player1.equals("Kagit") && bilgisayar.equals("Kagit")
                || player1.equals("Makas") && bilgisayar.equals("Makas")) {

            System.out.println("\nOyun Berabere Bitti...\n");

        } else {
            System.out.println("\nKaybettiniz...\n");
        }

        System.out.print("***** Secimler *****\n");
        System.out.print("\nOyuncunun Sectigi Sekil :" + player1);
        System.out.print("\nBilgisayarin Sectigi Sekil :" + bilgisayar + "\n");
        
        //Write By UnSeen.
    }

}
