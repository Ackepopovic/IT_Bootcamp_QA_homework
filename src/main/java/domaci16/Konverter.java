package domaci16;

/*
Napraviti klasu Konverter koja kao atribute ima rsd i valutu. Valuta je enum, dok je rsd celi broj. Valuta treba da bude jedna od:
EUR, USD, AUD, CAD, RUB i GBP.
 Kroz konstruktor se unose vrednosti za dinare (rsd) i valutu, i postoje seteri, ali ne postoje geteri.
 Napraviti metodu koja služi za konvertovanje valute u onu koja je prosleđena kroz konstruktor ili seter.
  Znači rsd pretvara u tu neku valutu. U metodi koristiti iif else ili switch za poređenje.
  Pogledati kako se porede enum-i u javi najpravilnije. U main-u testirati tako što će te napraviti jedan objekat tipa Konverter i isprobati za sve valute.

 */

import java.text.DecimalFormat;

public class Konverter {

    private int rsd;
    private Valuta valuta;

    public Konverter(){

    }

    public Konverter(int rsd, Valuta valuta) {
        this.rsd = rsd;
        this.valuta = valuta;
    }

    public int getRsd() {
        return rsd;
    }

    public void setRsd(int rsd) {
        this.rsd = rsd;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }
    public void konvertuj(){
        double konvertovanIznos = 0;
        switch (valuta) {
            case EUR:
                konvertovanIznos = rsd / 117.5;
                System.out.printf("Iznos u EUR je: %.2f  \n", konvertovanIznos);
                break;
            case USD:
                konvertovanIznos = rsd / 105.0;
                System.out.printf("Iznos u USD je: %.2f  \n", konvertovanIznos);
                break;
            case AUD:
                konvertovanIznos = rsd / 78.5;
                System.out.printf("Iznos u AUD je: %.2f  \n" , konvertovanIznos);
                break;
            case CAD:
                konvertovanIznos = rsd / 82.0;
                System.out.printf("Iznos u CAD je: %.2f  \n " , konvertovanIznos);
                break;
            case GBP:
                konvertovanIznos = rsd / 145.00;
                System.out.printf("Iznos u GBR je: %.2f  \n " , konvertovanIznos);
                break;
            case RUB:
                konvertovanIznos = rsd / 1.5;
                System.out.printf("Iznos u RUB je: %.2f  \n " , konvertovanIznos);
                break;
            default:
                System.out.println("Pogresna valuta.");
                break;
        }
//        DecimalFormat zaokruzitiNa2Decimale = new DecimalFormat("#.00");
//        String dveDecimale = zaokruzitiNa2Decimale.format(konvertovanIznos);
//        System.out.println("Konvertovani iznos " + dveDecimale + " " + valuta);
    }


    @Override
    public String toString() {
        return "Konverter{" +
                "rsd=" + rsd +
                ", valuta=" + valuta +
                '}';
    }
}
