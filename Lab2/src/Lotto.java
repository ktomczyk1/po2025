import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;
import java.util.List;

public class Lotto {
    public static void main(String[] args) {
        int h1;
        ArrayList<Integer> typy = new ArrayList<Integer>();

        for (int i = 0; i<6; i++) // wsadzanie typow do listy
        {
            h1 = Integer.parseInt(args[i]);
            typy.add(h1);
        }

        System.out.println(typy);


        Random rand = new Random();
        //ArrayList<Integer> liczby = new ArrayList<Integer>();
        HashSet<Integer> liczby_bez_powtorek = new HashSet<Integer>();

        System.out.println("Z maszyny losującej wyciagamy nastepujace liczby:");
        for (int i = 0; i<6; i++)
        {
            while (liczby_bez_powtorek.size() < 6)
            {
                int n = rand.nextInt(1,50);
                liczby_bez_powtorek.add(n);
            }

        }
        System.out.println(liczby_bez_powtorek);

        System.out.println("Ile razy trafiles? Juz licze...");
        typy.retainAll(liczby_bez_powtorek);

        System.out.println(typy.size());

    }
}
