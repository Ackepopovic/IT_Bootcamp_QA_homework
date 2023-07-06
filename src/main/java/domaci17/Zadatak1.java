package domaci17;

import javax.crypto.Mac;
import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Zivotinja> zivotinje = new ArrayList<>();

        zivotinje.add(new Pas("Pako", "Pakito", true));
        zivotinje.add(new Pas("Lisa", "Lu", false));
        zivotinje.add(new Macka("Romeo", "Ro", 6.2));
        zivotinje.add(new Macka("Moka", "Mo", 4.5));
        System.out.println(zivotinje);



        for (Zivotinja zivotinja : zivotinje) {
            if (zivotinja instanceof Pas) {
                System.out.println("Dog: " + zivotinja.toString());
            } else if (zivotinja instanceof Macka) {
                System.out.println("Cat: " + zivotinja.toString());

            }
        }
    }

}
