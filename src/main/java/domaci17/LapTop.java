package domaci17;
/*
 Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana i enum za tastaturu (da li je internacionalna ili US).
  Isto implementirati toString, samo dodati još veličinu ekrana i tastaturu kao:  "Broj procesora: 4, ram: 16GB, memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
 */

public class LapTop extends Racunar{

    private String velicinaEkrana;
    private Tastatura tastatura;

    public LapTop(){

    }

    public LapTop(String brojProcesora, String ramMemorija, String memorija, String velicinaEkrana, Tastatura tastatura) {
        super(brojProcesora, ramMemorija, memorija);
        this.velicinaEkrana = velicinaEkrana;
        this.tastatura = tastatura;
    }

    public String getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(String velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }

    public Tastatura getTastatura() {
        return tastatura;
    }

    public void setTastatura(Tastatura tastatura) {
        this.tastatura = tastatura;
    }

    @Override
    public String toString() {
        return
               super.toString() + "}" +
                " ekran= " + velicinaEkrana +
                ", tastatura= " + tastatura;
    }
}
