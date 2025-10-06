package arrayListDemo;
import java.util.*;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Satwika");
        students.add("Srihitha");
        students.add("Ananya");
        students.add("Rahul");

        System.out.println("Initial Student List: " + students);

        students.add(2, "Tejas"); 
        System.out.println("After inserting 'Tejas' at index 2: " + students);

        students.remove("Rahul");
        System.out.println("After removing 'Rahul': " + students);

        String checkName = "Srihitha";
        if (students.contains(checkName)) {
            System.out.println(checkName + " is present in the list.");
        } else {
            System.out.println(checkName + " is not present.");
        }

        System.out.println("Total number of students: " + students.size());
    }
}
