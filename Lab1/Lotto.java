import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> liczby = new ArrayList<Integer>();

        System.out.println("Z maszyny losującej wyciagamy nastepujace liczby:");

        for (int i = 0; i<6; i++)
        {
            int n = rand.nextInt(50);
            liczby.add(n);
        }
        System.out.println(liczby);
    }
}

