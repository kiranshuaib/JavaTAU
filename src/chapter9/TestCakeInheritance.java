package chapter9;

public class TestCakeInheritance {
    public static void main(String[] args) {
        Cake cake = new Cake("Choclate");
        cake.setPrice(28);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("cake Price: " + cake.getPrice());


        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(45);
        System.out.println("Birthday Cake flavor is: "+birthdayCake.getFlavor());
        System.out.println("Birthday Cake price is: "+birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("PinaColada");
        System.out.println("Wedding Cake flavor is: "+weddingCake.getFlavor());
        System.out.println("Wedding Cake price is: "+weddingCake.getPrice());


    }
}
