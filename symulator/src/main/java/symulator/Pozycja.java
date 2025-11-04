package symulator;

public class Pozycja {
    private double x;
    private double y;


    // konstruktor
    public Pozycja(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter
    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    public void aktualizujPozycje(double deltaX, double deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }

    public String getPozycja()
    {
        return "(" + x + "," + y + ")";
    }
}
