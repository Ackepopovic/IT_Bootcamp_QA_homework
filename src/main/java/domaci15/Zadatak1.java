package domaci15;

public class Zadatak1 {
    public static void main(String[] args) {

        Radnik radnik1 = new Radnik("Marko", "Markovic", 2010);
        Radnik radnik2 = new Radnik("Petar", "Petrovic", 2015);
        Radnik radnik3 = new Radnik("Aleksandar", "Popovic", 2018);

        if (radnik1.proveraGodinaZaposlenja()) {
            System.out.println(radnik1.ime + " " + radnik1.prezime + " radi preko 10 godina u firmi.");
        } else {
            System.out.println(radnik1.ime + " " + radnik1.prezime + " ne radi duze od 10 godina u firmi.");
        }
        if (radnik2.proveraGodinaZaposlenja()) {
            System.out.println(radnik2.ime + " " + radnik2.prezime + " radi preko 10 godina u firmi.");
        } else {
            System.out.println(radnik2.ime + " " + radnik2.prezime + " ne radi duze od 10 godina u firmi.");
        }
        if (radnik3.proveraGodinaZaposlenja()) {
            System.out.println(radnik3.ime + " " + radnik3.prezime + " radi preko 10 godina u firmi.");
        } else {
            System.out.println(radnik3.ime + " " + radnik3.prezime + " ne radi duze od 10 godina u firmi.");
        }

















    }
}
