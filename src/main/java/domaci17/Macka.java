package domaci17;

public class Macka extends Zivotinja {

    private double tezina;

    public Macka(String ime, String nadimak, double tezina) {
        super(ime, nadimak);
        this.tezina = tezina;
    }

    public String ispisZaMacku() {
        if (tezina > 5) {
            return " I am a chonk ";
        } else {
            return " I am not a chonk ";
        }

    }


    public String toString() {
        return "Macka{" +
                "tezina=" + tezina +
                ispisZaMacku() +
                super.toString();
    }

    @Override
    public String zvukKojiZivotinjaPravi() {
        return "meow";

    }
}
