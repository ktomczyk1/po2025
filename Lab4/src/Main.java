7import animals.Animal;
import animals.Dog;
import animals.Parrot;
import animals.Snake;
import zadania.*;

public class Main {
    public static void main(String[] args)
    {
        Animal parrot = new Parrot("papugga");
        Animal dog = new Dog("tokio");
        Animal snake = new Snake("dawid");


        System.out.println(parrot.getDescription());
        System.out.println(snake.getDescription());
        System.out.println(dog.getDescription());

        // Tworzymy nowe zoo
        Zoo zoo = new Zoo();

        // Losowe wypełnianie zoo zwierzętami

        zoo.fillZoo();

        // Wyświetlamy wszystkie zwierzęta w zoo
        zoo.showAnimals();

        zoo.countLegs();

    }
}