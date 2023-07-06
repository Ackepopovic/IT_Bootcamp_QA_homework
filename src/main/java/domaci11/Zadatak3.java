package domaci11;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Sa do while petljom uraditi sumu brojeva koje korisnik unese.
//                Minimum jedan broj mora da se unese (to do while svakako obezbedjuje).
//        Program ispisuje koja je suma kada upisete 0 ili negativan broj

        Scanner s = new Scanner(System.in);

        int broj = 1;
        int sum = 0;

                do {
                    System.out.println("Unesite neki broj: ");
                    broj = s.nextInt();
                    if (broj <= 0) {
                        break;
                    }
                    sum += broj;
                } while (broj > 0);
        System.out.println("Zbir svih brojeva je: " + sum);
        System.out.println("Program se zavrsava!");

    }
}
