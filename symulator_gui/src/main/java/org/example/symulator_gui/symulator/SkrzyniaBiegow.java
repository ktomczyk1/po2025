package org.example.symulator_gui.symulator;

public class SkrzyniaBiegow extends Komponent {

    private int aktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;

    public SkrzyniaBiegow(int iloscBiegow) {
        this.iloscBiegow = iloscBiegow;
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0.0;
    }

    public void zwiekszBieg()
    {
        if (aktualnyBieg < iloscBiegow)
        {
            aktualnyBieg++;
            System.out.println("zwiekszono bieg na " + aktualnyBieg);
        }
        else {
            System.out.println("n mozna zwiekszyc biegu :(");
        }
    }

    public int zmniejszBieg()
    {
        if (aktualnyBieg > 0)
        {
            aktualnyBieg--;
            System.out.println("Zmniejszono bieg na " + aktualnyBieg);
        }
        else if (aktualnyBieg == 0){
            aktualnyBieg = 0;
            System.out.println("Twoj aktualny bieg to R");

        }
        else
        {
            System.out.println("juz bardziej nie da sie zejsc bratku");
        }
        return 0;
    }

    public int getAktBieg()
    {
        return aktualnyBieg;
    }

    public double getAktPrzelozenie()
    {
        return aktualnePrzelozenie;
    }


}
