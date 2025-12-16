package symulator.src.main.java.symulator;

public class Samochod {

    private boolean stanWlaczenia;
    private int nrRejest;
    private String model;
    private double predkoscMax;
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Sprzeglo sprzeglo;
    private Pozycja aktualnaPozycja;

    public Samochod() {
        this.silnik = new Silnik();
        this.skrzynia = new SkrzyniaBiegow(6);
        this.sprzeglo = new Sprzeglo();
        this.aktualnaPozycja = new Pozycja(0, 0);
        this.predkoscMax = 200;
        this.stanWlaczenia = false;
    }

    public void wlacz()
    {
        if (!stanWlaczenia) {
            stanWlaczenia = true;
            silnik.uruchom();
            System.out.println("Samochod wlaczony");
        }
    }

    public void wylacz(){
        if (stanWlaczenia) {
            stanWlaczenia = false;
            silnik.zatrzymaj();
            System.out.println("Samochod wylaczony");
        }
    }

    public void jedzDo(Pozycja cel)
    {
        double deltaX = cel.getX() - aktualnaPozycja.getX();
        double deltaY = cel.getY() - aktualnaPozycja.getY();
        aktualnaPozycja.aktualizujPozycje(deltaX, deltaY);
        System.out.println("Samochod dojechal do: " + aktualnaPozycja.getPozycja());
    }

    public double getWaga()
    {
        return 0;
    }

    public double getAktPredkosci()
    {
        return skrzynia.getAktBieg() * 20;
    }

    public Pozycja getAktPozycja()
    {
        return aktualnaPozycja;
    }

    public String getStanSamochodu() {
        return "Silnik obroty: " + silnik.getObroty()
                + ", bieg: " + skrzynia.getAktBieg()
                + ", sprzegloWcisniete: " + sprzeglo.getStanSprzegla()
                + ", pozycja: " + aktualnaPozycja.getPozycja();
    }

    public void zwiekszBieg() {
        if (skrzynia != null) {
            skrzynia.zwiekszBieg();
        }
    }

    public void zmniejszBieg() {
        if (skrzynia != null) {
            skrzynia.zmniejszBieg();
        }
    }

}
