package zadania;

import animals.*;
import java.util.Random;

public class Zoo {
    // Tablica przechowująca zwierzęta
    Animal[] animals = new Animal[100];
    private Random random = new Random();

    // Losowe wypełnianie tablicy zwierzętami
    public void fillZoo() {
        for (int i = 0; i < animals.length; i++) {
            animals[i] = getRandomAnimal();
        }
    }

    // Losowa metoda do wybierania zwierząt
    private Animal getRandomAnimal() {
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return new Parrot("Polly");
            case 1:
                return new Dog("Reksio");
            case 2:
                return new Snake("Stefan");
            default:
                return null;
        }
    }

    // Dodanie zwierzęcia do zoo (zamiast w tej metodzie, używamy fillZoo)
    public void addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println("Dodano zwierzę: " + animal.getDescription());
                return;
            }
        }
        System.out.println("Brak miejsca w zoo!");
    }

    // Wyświetlenie wszystkich zwierząt w zoo
    public void showAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.getDescription());
            }
        }
    }

    public void countLegs() {
        int nogi = 0;
        for (Animal animal : animals) {
            if  (animal != null) {
                nogi += animal.getLegs();
            }
        }
        System.out.println(nogi);
    }

}
