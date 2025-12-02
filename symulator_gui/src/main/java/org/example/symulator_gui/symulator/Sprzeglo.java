package org.example.symulator_gui.symulator;

import symulator.Komponent;

public class Sprzeglo extends Komponent {
    private boolean stanSprzegla;

    public void wcisnij()
    {
        stanSprzegla = true;
        System.out.println("Sprzeglo wcisniete");
    }

    public void zwolnij()
    {
        stanSprzegla = false;
        System.out.println("Sprzeglo zwolnione");
    }

    public boolean getStanSprzegla() {
        return stanSprzegla;
    }

}
