package domaci12;

public class Zadatak2 {
    public static void main(String[] args) {

        //Kreirati niz proizvoljne duzine celobrojnih vrednosti i pomnoziti poslednji clan sa ukupnim brojem clanova (Koristiti .length, ne fiksnu vrednost)

        int [] niz = {2,4,6,8,10};
//        int duzinaNiza = niz.length;
//       int poslednjiClan = niz[duzinaNiza - 1];
//       int mnozenje = niz.length * poslednjiClan;
            int mnozenje = niz.length * niz[niz.length - 1];
        System.out.println("Rezultat je: " + mnozenje);




    }
}
