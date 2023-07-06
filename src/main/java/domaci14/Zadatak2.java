package domaci14;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napraviti metodu koja radi konverziju valuta. Valute koje se koriste su EUR, USD, GBP.
//        Napisati konverzije preko switch-a, tako sto proveravate koju je valutu korisnik uneo kao parametar, a vracate (return) u toj nekoj novoj valuti izracunatu vrednost.
//                U main-u preko skenera korisnik unosi broj dinara koji zeli da konvertuje u neku valutu, i samu valutu kao string.
//        Ispisati nekoliko primera poziva u main-u. Valute su vrednosti double i njih mozete uzeti sa sajta NBS. (3-4 poziva dovoljno).
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite valutu u (EUR, USD, GBR): ");
        String valuta = s.nextLine().toUpperCase();

        System.out.println("Unesite iznos u dinarima: ");
        double iznos = s.nextDouble();

        double konvertovaniIznos = konverzija(iznos, valuta);


        System.out.printf("%.2f RSD = %.2f %s", iznos, konvertovaniIznos, valuta);


    }
    public static double konverzija(double iznos, String valuta) {
        double konvertovaniIznos = 0.0;
        switch (valuta) {
            case "EUR":
                konvertovaniIznos = iznos /  117.72;
                break;
            case "USD":
                konvertovaniIznos = iznos /  104.44;
                break;
            case "GBP":
                konvertovaniIznos = iznos / 145.17;
                break;
            default:
                System.out.println("Nevalidan unos!");
                break;
        }
        return konvertovaniIznos ;
    }
}
