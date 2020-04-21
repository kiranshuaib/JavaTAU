package chapter11;

public class farm {
    public static void main(String[] args) {
        Animal donald = new Duck();
        donald.makeSound();

        Duck dacky = new Duck();
        dacky.makeSound();

        Pig pork = new Pig();
        pork.makeSound();

    }
}
