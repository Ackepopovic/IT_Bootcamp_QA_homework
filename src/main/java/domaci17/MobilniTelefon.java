package domaci17;
/*
 Napraviti klasu mobilni telefon koji nasleđuje računar i ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G).
   Implementirati toString metodu da ispisuje "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
 */

public class MobilniTelefon extends Racunar{

    private String kamera;
    private Mreza mreza;

    public MobilniTelefon(){

    }

    public MobilniTelefon(String brojProcesora, String ramMemorija, String memorija, String kamera, Mreza mreza) {
        super(brojProcesora, ramMemorija, memorija);
        this.kamera = kamera;
        this.mreza = mreza;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public Mreza getMreza() {
        return mreza;
    }

    public void setMreza(Mreza mreza) {
        this.mreza = mreza;
    }

    @Override
    public String toString() {
        return
                super.toString() + "} " +
                " kamera= " + kamera + '\'' +
                ", mreza= " + mreza.toString().replaceAll("_", "");
    }
}
