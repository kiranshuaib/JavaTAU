package chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
          setmap();
    }
//    public static void setDemo(){
//        Set<String> fruit = new HashSet();
//        fruit.add("apple");
//        fruit.add("lemon");
//        fruit.add("banana");
//        fruit.add("orange");
//        fruit.add("lemon");
//
////        System.out.println(fruit.size());
////        System.out.println(fruit);
//
//        var i = fruit.iterator(); //first way to loop through
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//
//        for(String item :fruit){ //2nd way to loop through
//            System.out.println(item);
//        }
//
//        fruit.forEach(System.out::println);//3rd way to loop through
////      fruit.forEach(x -> System.out.println(x));//can be written as this
//
//
//    }
    public static void setmap(){
        Map<String,Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple",95);
        fruitCalories.put("banana", 20);
        fruitCalories.put("lemon", 105);
        fruitCalories.put("orange",45);
        fruitCalories.put("lemon",17);

//        System.out.println(fruitCalories.size());
//        System.out.println(fruitCalories);
//        System.out.println(fruitCalories.get("lemon"));
//        System.out.println(fruitCalories.entrySet());

        for(var entry: fruitCalories.entrySet()){ //
            System.out.println(entry.getValue());
        }
        fruitCalories.forEach((k,v) -> System.out.println("fruit : "+ k + " value: "+ v));
    }
}
