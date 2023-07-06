package domaci17;
/*
Napraviti klasu koja predstavlja računar. Računar ima broj procesora, količinu ram memorije i količinu memorije.
 Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB".
 Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana i enum za tastaturu (da li je internacionalna ili US).
  Isto implementirati toString, samo dodati još veličinu ekrana i tastaturu kao:  "Broj procesora: 4, ram: 16GB, memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
   Napraviti klasu mobilni telefon koji nasleđuje računar i ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G).
   Implementirati toString metodu da ispisuje "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G".
    U main metodi napraviti listu računara, provući kroz jednu petlju i ispisati klasu kojoj objekat pripada (Da li je laptop ili mobilni)
 */

public class Racunar {

    protected String brojProcesora;
    protected String ramMemorija;
    protected String memorija;

    public Racunar(){

    }

    public Racunar(String brojProcesora, String ramMemorija, String memorija) {
        this.brojProcesora = brojProcesora;
        this.ramMemorija = ramMemorija;
        this.memorija = memorija;
    }

    public String getBrojProcesora() {
        return brojProcesora;
    }

    public void setBrojProcesora(String brojProcesora) {
        this.brojProcesora = brojProcesora;
    }

    public String getRamMemorija() {
        return ramMemorija;
    }

    public void setRamMemorija(String ramMemorija) {
        this.ramMemorija = ramMemorija;
    }

    public String getMemorija() {
        return memorija;
    }

    public void setMemorija(String memorija) {
        this.memorija = memorija;
    }

    @Override
    public String toString() {
        return
                " Broj procesora= " + brojProcesora +
                ", ram= " + ramMemorija +
                ", memorija= " + memorija;
    }
}
