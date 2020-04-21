package chapter9;

public class Square extends Rectangle {

    @Override
    public double CalcParimeter() {
        return sides*length ;
    }


    public void print(String what) {
        System.out.println("I am a " +what);    }
}