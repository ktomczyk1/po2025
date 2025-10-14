import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;


public class Symulacja_pelnego_trafienia {
    public static void main(String args[])
    {
        long start = System.currentTimeMillis();
        Random rand = new Random();
        // Podaj swoje typy (1,2,3,4,5,6)

        int h1;
        ArrayList<Integer> typy = new ArrayList<Integer>();
        ArrayList<Integer> kopia = new ArrayList<Integer>();
        for (int i =0; i<6; i++)
        {
            h1 = Integer.parseInt(args[i]);
            typy.add(h1);
        }


        // Teraz komputer losuje liczby....

        int losowanie = 0;
        for (int i=0; i<6; i++)
        {

            while  (kopia.size() < 6)
            {
                int n =  rand.nextInt(1,49);
                if (typy.contains(n) ==  true && kopia.contains(n) == false) {
                    kopia.add(n);
                }
            }

        }
        System.out.println(kopia);
        long koniec = System.currentTimeMillis();
        System.out.println(koniec - start);

    }
}
