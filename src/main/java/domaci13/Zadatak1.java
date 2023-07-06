package domaci13;

//Napraviti metodu koja vraca boolean tip i prihvata kao parametre 2 integer-a.
// Metoda vraća true samo ako su ta dva integer-a jedan za drugim, na primer 16 17 ili 24 25.
// U main metodi ispisati sa println nekoliko primera kako bi ste testirali (4-5 poziva je dovoljno)


public class Zadatak1 {
    public static void main(String[] args) {
        System.out.println(sledeciBroj(20,21));
        System.out.println(sledeciBroj(21, 24));
        System.out.println(sledeciBroj(20, 19));
        System.out.println(sledeciBroj(15,17));
        System.out.println(sledeciBroj(30, 31));


    }
    public static boolean sledeciBroj(int a, int b) {
//        if (a +1 ==b || b +1 == a) {
//            return true;
//        } else {
//            return false;
//        }
         return (a +1 ==b || b +1 == a);
    }

}