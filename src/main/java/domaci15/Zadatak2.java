package domaci15;

public class Zadatak2 {
    public static void main(String[] args) {

        Film film1 = new Film("Petparacke price", "Kventin Tarantino", 1994);
        Film film2 = new Film("Memento", "Kristofer Nolan", 2000);

        if (film1.godinaObjave < film2.godinaObjave) {
            System.out.println("Film " + film2.ime + " iz " + film2.godinaObjave + "-te godine je noviji.");
        } else if (film1.godinaObjave > film2.godinaObjave) {
            System.out.println("Film " + film1.ime + " iz " + film1.godinaObjave + "-te godine je noviji.");
        } else {
            System.out.println("Oba filma su objavljena iste godine.");
        }

    }
}
