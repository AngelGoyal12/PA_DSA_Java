import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Rahul");
        names.add("Aman");
        names.add("Neha");
        names.add("Riya");

        System.out.println("ArrayList: " + names);

        // Retrieving element
        System.out.println("Element at index 1: " + names.get(1));

        // Updating element
        names.set(1, "Arjun");
        System.out.println("After update: " + names);

        // Checking element
        System.out.println("Contains Neha: " + names.contains("Neha"));

        // Removing element
        names.remove("Riya");
        System.out.println("After removal: " + names);

        // Size
        System.out.println("Size: " + names.size());
    }
}