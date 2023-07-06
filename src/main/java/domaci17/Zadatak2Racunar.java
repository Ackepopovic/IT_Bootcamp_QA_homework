package domaci17;
/*
Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".
Napraviti klasu mobilni telefon koji nasleđuje računar i ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G).
   Implementirati toString metodu da ispisuje "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
    U main metodi napraviti listu računara, provući kroz jednu petlju i ispisati klasu kojoj objekat pripada (Da li je laptop ili mobilni)
 */

import java.util.ArrayList;

public class Zadatak2Racunar {
    public static void main(String[] args) {


        Racunar racunar = new Racunar("4", "16GB", "512GB");
        System.out.println(racunar);

        LapTop lapTop = new LapTop("4", "16GB", "512GB", "15.6", Tastatura.INTERNACIONALNA);
        System.out.println(lapTop);

        MobilniTelefon mobilniTelefon = new MobilniTelefon("8", "6", "128GB", "32Megapixela", Mreza._5G);
        System.out.println(mobilniTelefon);

        ArrayList<Racunar> racunari = new ArrayList<>();
        racunari.add(racunar);
        racunari.add(lapTop);
        racunari.add(mobilniTelefon);


        for (Racunar racunar1 : racunari) {
            if (racunar1 instanceof MobilniTelefon) {
                System.out.println(" Ovo je mobilni telefon: " + mobilniTelefon);
            } else if (racunar1 instanceof LapTop) {
                System.out.println("Ovo je LapTop: " + lapTop);
            } else {
                System.out.println();
            }
        }
    }
}



