package chapter10;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.makeJuice();
        squeeze(apple);

        apple = new Banana();
        apple.makeJuice();
        ((Banana) apple).peel();
        squeeze(apple);
    }

    public static void squeeze(Fruit fruit){
        System.out.println("squeezing");
        fruit.makeJuice();
    }
}
