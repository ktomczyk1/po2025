package symulator;

public class Silnik extends Komponent {


    private double maxObroty = 7000;
    private double obroty = 0;
    private boolean uruchomiony = false;

    public void uruchom()
    {
        if (uruchomiony == false)
        {
            uruchomiony = true;
            obroty = 1000;
            System.out.println("Uruchomiony");
        }

    }

    public void zatrzymaj()
    {
        if (uruchomiony == true)
        {
            uruchomiony = false;
            obroty = 0;
            System.out.println("Silnik wylaczony");
        }
    }

    public double zwiekszObroty()
    {
        if (maxObroty >= obroty + 1000)
        {
            obroty += 1000;
            System.out.println("Obroty: " + obroty);
        }
        else {
            obroty = maxObroty;
            System.out.println(obroty);
        }
        return obroty;
    }

    public double zmniejszObroty()
    {
        if (obroty > 1000)
        {
            obroty -= 1000;
        }
        else {
            obroty = 1000;
        }
        return obroty;
    }
}
