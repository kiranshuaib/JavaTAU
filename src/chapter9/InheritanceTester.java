package chapter9;

import chapter6.Month;

public class InheritanceTester {
    public static void main(String[] args) {

//        Employee employee =new Employee(); //go inside the parent constructor first
//        Rectangle rectangle = new Rectangle();
//        rectangle.print();
//
//        Square square = new Square();
//        square.print("square");

        Mother mom = new Mother();
        mom.setName("Kausar");

        System.out.println(mom.getName() + " is a "+mom.getGender());

    }


}
