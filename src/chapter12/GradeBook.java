package chapter12;

import java.util.Map;

public class GradeBook {
    public static void main(String[] args) {
        Map<String,Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String,Integer> test2 = TestResults.getMakeUpGrades();

          System.out.println(gradeBook);
          System.out.println(test2);


        for (var student : test2.entrySet()) {

//            System.out.println(gradeBook.get(student.getKey()));
//            System.out.println(test2.get(student.getKey()));
//             System.out.println(student.getKey());
//             System.out.println(student.getValue());
//
            int initialGrades = gradeBook.get(student.getKey());
            int improvedGrades = test2.get(student.getKey());


            if(improvedGrades > initialGrades){
                gradeBook.put(student.getKey(),improvedGrades);

            }
            System.out.println("Student: " + student.getKey() + ", Grade:" + gradeBook.get(student.getKey()));
        }
////        System.out.println("Final Grades: ");
////        gradeBook.forEach((k,v)-> System.out.println("Student:" +k + "  Grades: " + v));
    }
}
