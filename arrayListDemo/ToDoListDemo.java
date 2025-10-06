  package arrayListDemo;
import java.util.ArrayList;
import java.util.Collections;

public class ToDoListDemo {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Complete Java assignment");
        tasks.add("Watch movie");
        tasks.add("Go for a walk");
        tasks.add("Buy groceries");

        System.out.println("To-Do List: " + tasks);

        System.out.println("Task at index 2: " + tasks.get(2));

        tasks.remove("Watch movie");
        System.out.println("After removing completed task: " + tasks);

        Collections.sort(tasks);
        System.out.println("Sorted To-Do List: " + tasks);

        if (tasks.isEmpty()) {
            System.out.println("All tasks are completed!");
        } else {
            System.out.println("Tasks still pending.");
        }
    }
}
