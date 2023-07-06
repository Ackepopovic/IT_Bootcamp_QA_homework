package domaci14;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napraviti metodu koja ispisuje niz i kao parametre prihvata niz.
//        Unutar metode pronaći najveću vrednost u nizu, a zatim tu vrednost postaviti kao vrednost svakog elementa u nizu.
//        Koristiti scanner za popunjavanje početnog niza. (3-4 poziva dovoljno).

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj elemenata niza: ");
        int broj = s.nextInt();

        if (broj > 0) {
            int [] niz = new int[broj];

            for (int i = 0; i < broj; i++) {
                System.out.println("Unesite brojeve za niz: " + i);
                niz[i] = s.nextInt();
            }
            najveciBrojIStampa(niz);

        } else {
            System.out.println("broj mora da bude veci od 0!");
        }
        s.close();
    }
    public static void najveciBrojIStampa(int[] niz) {
        System.out.println(Arrays.toString(niz));

        int najveciBr = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > najveciBr) {
                najveciBr = niz[i];
            }
        }
        Arrays.fill(niz, najveciBr);
        System.out.println(Arrays.toString(niz));
    }
}
