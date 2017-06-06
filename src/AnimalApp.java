import javax.sound.midi.Soundbank;

public class AnimalApp {

    public static void main(String[] args) {
        Animal myAnimal = new Animal(6, "foxi");
        Dog myDog = new Dog(4,"Berta");
        Animal myDog2 = new Dog(4,"Berta");

        System.out.println(myAnimal.say());
        System.out.println(myDog.say());

    }
}
