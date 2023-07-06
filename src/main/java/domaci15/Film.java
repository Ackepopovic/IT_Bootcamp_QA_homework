package domaci15;

//Napraviti klasu film koja ima atribute ime, režiser i godina objave. U main metodu napraviti dva različita filma i proveriti koji film je noviji.

public class Film {

    String ime;
    String reziser;
    int godinaObjave;

    public Film(){

    }

    public Film(String ime, String reziser, int godinaObjave){
        this.ime = ime;
        this.reziser = reziser;
        this.godinaObjave = godinaObjave;
    }

}
