package chapter9;

public class Person {
    private String name;
    private String  age;
    private String gender;

//    public Person(){
//        System.out.println("In person default constructor");
//    }
//    public Person(String name){
//        System.out.println("In person 2nd constructor. Name is set");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
