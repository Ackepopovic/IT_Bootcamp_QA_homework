package domaci17;


public class Pas extends Zivotinja {

    private boolean goodBoy;



    public Pas(String ime, String nadimak, boolean goodBoy) {
        super(ime, nadimak);
        this.goodBoy = goodBoy;
    }

    public String ispisZaPsa() {
        if (goodBoy == true) {
            return " I am a good boy ";
        } else {
            return " I am a bad boy ";
        }
    }
    @Override
    public String zvukKojiZivotinjaPravi() {
        return "woof";

    }

    @Override
    public String toString() {
        return "Pas{" +
                "goodBoy=" + goodBoy +
                ispisZaPsa() +
                super.toString();
    }
}
