import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;

public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        //ArrayList<Integer> liczby = new ArrayList<Integer>();
        HashSet<Integer> liczby_bez_powtorek = new HashSet<Integer>();

        System.out.println("Z maszyny losującej wyciagamy nastepujace liczby:");
        while (liczby_bez_powtorek.size() < 5) {
            for (int i = 0; i<6; i++)
            {
                int n = rand.nextInt(50);
                liczby_bez_powtorek.add(n);
            }

        }
        System.out.println(liczby_bez_powtorek);

    }
}

