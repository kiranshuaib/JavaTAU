package chapter10;

public class Banana extends Fruit {

    public Banana(){
        setCalories(88);
    }

    public void peel(){
        System.out.println("Peel the banana!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana is better in shake than in a juice");
    }
}
