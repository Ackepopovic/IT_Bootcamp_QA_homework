package domaci16;

import java.text.DecimalFormat;

public class KonverterZadatak2 {
    public static void main(String[] args) {

        Konverter konverter = new Konverter(200, Valuta.EUR);
        konverter.konvertuj();

        Konverter konverter1 = new Konverter(200, Valuta.GBP);
        konverter1.konvertuj();

        Konverter konverter2 = new Konverter(200, Valuta.CAD);
        konverter2.konvertuj();

        Konverter konverter3 = new Konverter(200, Valuta.AUD);
        konverter3.konvertuj();

        Konverter konverter4 = new Konverter(200, Valuta.RUB);
        konverter4.konvertuj();

        Konverter konverter5 = new Konverter(200, Valuta.USD);
        konverter5.konvertuj();




    }
}
