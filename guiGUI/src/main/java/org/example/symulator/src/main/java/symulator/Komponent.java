package org.example.symulator;


public abstract class Komponent {
    private String nazwa;
    private double waga;
    private double cena;
    private String producent;
    private String model;

    public String getNazwa() {
        return nazwa;
    }

    public double getWaga()
    {
        return waga;
    }

    public double getCena()
    {
        return cena;
    }

    public String getProducent()
    {
        return producent;
    }

    public String getModel()
    {
        return model;
    }



}
