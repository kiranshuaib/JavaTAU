package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sacha = new Dog();
        sacha.makeSound();
        feed(sacha);

        sacha = new Cat();//change sacha intantiation
        sacha.makeSound();
        ((Cat) sacha).scratch(); //casting
        feed(sacha);
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here is your dog food");
        }
        else if (animal instanceof Cat){
            System.out.println("Here is your cat food");
        }

    }

}
