package domaci16;
/*
Napraviti static metodu u main koje rade kao sql min, max, sum, avg i distinct u SQLu koristeci ArrayList<Integer>.
 Ne morate praviti drugu klasu sem main, a metode prihvataju ArrayList<Integer> kao parametar.
 Distinct vraća novi ArrayList<Integer> dok ostale metode imaju povratne tipove tipa int (za min, max i sum) i double (za avg)
 */

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> broj = new ArrayList<>();
        broj.add(2);
        broj.add(4);
        broj.add(6);
        broj.add(7);
        broj.add(6);
        broj.add(10);

        int min = minimalniBroj(broj);
        int max = maximalniBroj(broj);
        int sum = Suma(broj);
        double avg = avg(broj);
        ArrayList<Integer> distBroj = distinct(broj);
        System.out.println("Minimum je: " + min);
        System.out.println("Maximum je: " + max);
        System.out.println("Zbir je: " + sum);
        System.out.println("Prosek je: " + avg);
        System.out.println("Distinct je" + distBroj);


    }
    public static int minimalniBroj(ArrayList<Integer> broj) {
        int minBroj = Integer.MAX_VALUE;
        for (int i = 0; i < broj.size(); i++) {
            if (broj.get(i) < minBroj) {
                minBroj = broj.get(i);
            }
        }
        return minBroj;
    }
    public static int maximalniBroj(ArrayList<Integer> broj) {
        int maxBroj = 1;
        for (int i = 0; i < broj.size(); i++) {
            if (broj.get(i) > maxBroj) {
                maxBroj = broj.get(i);
            }
        }
        return maxBroj;

    }
    public static int Suma(ArrayList<Integer> broj) {
        int sum = 0;
        for (int brojevi : broj) {
            sum += brojevi;
        }
        return sum;
//        for (int i = 0; i < broj.size(); i++) {
//            sum += broj.get(i);
//        }
//        return sum;

        }
        public static double avg(ArrayList<Integer> broj) {
        int sum = Suma(broj);
        return (double)sum / broj.size();
        }
        public static ArrayList<Integer> distinct(ArrayList<Integer> broj) {
            ArrayList<Integer> distBroj = new ArrayList<>();
            for (int brojevi : broj) {
                if (!distBroj.contains(brojevi)) {
                    distBroj.add(brojevi);
                }
            }
            return distBroj;

        }

    }



