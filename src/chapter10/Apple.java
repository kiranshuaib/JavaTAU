package chapter10;

public class Apple extends Fruit {

    public Apple(){
        setCalories(95);
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple Juice is my favorite");
    }

    public void removeSeeds(){
        System.out.println("Remove seeds from apple.");
    }
}
