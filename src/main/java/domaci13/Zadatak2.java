package domaci13;

//Napraviti metodu koja ispisuje tekst i prihvata kao parametre dva String-a.
//        Ispis je u sledećem formatu: “Ime: “ text1 “i Prezime: “ text 2. text1 treba da budu sva velika slova,
//        dok text2 treba da budu sva mala slova. U main metodi ispisati sa println nekoliko primera kako bi ste testirali (2-3 poziva je dovoljno)

public class Zadatak2 {
    public static void main(String[] args) {

        ispisatiImeIPrezime("Aleksandar", "Popovic");
        ispisatiImeIPrezime("Petar", "Petrovic");
        ispisatiImeIPrezime("Marko", "Markovic");
        ispisatiImeIPrezime("Jovan", "Jovanovic");

    }
    public static void ispisatiImeIPrezime(String text1, String text2) {

        String ime = text1.toUpperCase();
        String prezime = text2.toLowerCase();
        System.out.println("Ime: " + ime + " Prezime: " + prezime);

    }

}
