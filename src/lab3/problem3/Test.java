package lab3.problem3;

public class Test {
    public static void main(String[] args) {

        MyOwnArrayList<String> products = new MyOwnArrayList<>();

        System.out.println("=== Testing MyOwnArrayList ===");

        // 1 TESTING FOR EMPTY
        System.out.println("Is collection empty? " + products.isEmpty());
        System.out.println("Size: " + products.size());

        // 2 ADDING ELEMENTS
        System.out.println("\n=== Adding products ===");
        products.add("Laptop");
        products.add("Phone");
        products.add("Headphones");
        products.add("Mouse");

        System.out.println("Size after adding elements: " + products.size());
        System.out.println("Is collection empty now? " + products.isEmpty());

        // 3 CHECKING CONTAIN
        System.out.println("\n=== Checking contains ===");
        System.out.println("Contains Laptop? " + products.contains("Laptop"));
        System.out.println("Contains Phone? " + products.contains("Phone"));
        System.out.println("Contains Keyboard? " + products.contains("Keyboard"));

        // 4 REMOVE ELEMENTS
        System.out.println("\n=== Removing element ===");
        products.remove("Phone");
        System.out.println("Size after removing Phone: " + products.size());
        System.out.println("Contains Phone now? " + products.contains("Phone"));

        // 5 ADDING ONE MORE ELEMENT
        System.out.println("\n=== Adding one more element ===");
        products.add("Keyboard");
        System.out.println("Size after adding Keyboard: " + products.size());
        System.out.println("Contains Keyboard? " + products.contains("Keyboard"));

        // 6 CLEAR
        System.out.println("\n=== Clearing collection ===");
        products.clear();
        System.out.println("Size after clear: " + products.size());
        System.out.println("Is collection empty after clear? " + products.isEmpty());
    }
}
