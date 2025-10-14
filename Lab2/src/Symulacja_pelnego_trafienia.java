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
        int n;

        kopia.add(0);

        while (typy.containsAll(kopia) == false)
        {
            losowanie += 1;
            kopia.clear();
            for (int i=0;i<6;i++)
            {
                n = rand.nextInt(1,50);
                kopia.add(n);
            }
        }



        System.out.println(kopia);
        long koniec = System.currentTimeMillis();
        System.out.println(koniec - start + "ms");
        System.out.println(losowanie + " prob");

    }
}
