package domaci11;

public class Zadatak1 {
    public static void main(String[] args) {

       // Napisati for petlju koja ide od 0 do 1000 i prikazuje sve brojeve deljive sa 3




        for (int i = 0; i <= 1000; i++){
            if (i % 3 == 0) {
                System.out.println("Prikaz svih brojeva koji su deljiva sa 3 su :" + i);
            }
        }


    }
}
