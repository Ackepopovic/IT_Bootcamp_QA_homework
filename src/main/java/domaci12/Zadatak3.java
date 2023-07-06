package domaci12;

public class Zadatak3 {
    public static void main(String[] args) {

       // Kreirati dva niza i prikazati koji niz ima vise clanova (Ne morate petlju koristiti vec mozete if statement).

        int [] nizA = {1,2,3,4,5,6};
        int [] nizB = {2,4,6,8,9};

        if ( nizA.length > nizB.length) {
            System.out.println("Niz A ima vise clanova!");
        } else if (nizA.length < nizB.length) {
            System.out.println("Niz B ima vise clanova!");
        } else {
            System.out.println("Oba niza imaju podjednako clanova!");
        }




    }
}
