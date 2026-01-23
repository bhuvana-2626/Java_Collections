import java.util.ArrayList;
import java.util.Collections; // Used for sorting

public class MyArrayList {
    public static void main(String[] args) {

        // 1. INITIALIZATION
        // Using Integer (Wrapper Class) because Collections don't support primitives
        // (int)
        ArrayList<Integer> arr = new ArrayList<>();

        // 2. ADDING ELEMENTS (Time Complexity: O(1))
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        // 3. INDEXED ADD (Time Complexity: O(n))
        // Inserts 15 at index 1, shifting others to the right
        arr.add(1, 15);

        // 4. ACCESSING & MODIFYING
        System.out.println("Element at index 2: " + arr.get(2)); // Use .get() not []
        arr.set(0, 5); // Replaces element at index 0 with 5

        // 5. SEARCHING
        System.out.println("Does list have 20? " + arr.contains(20));
        System.out.println("Index of 40: " + arr.indexOf(40));

        // 6. REMOVING (The Integer Trap!)
        // Important: .remove(30) would look for INDEX 30 and crash.
        // We use Integer.valueOf() to remove the VALUE 30.
        arr.remove(Integer.valueOf(30));
        arr.remove(2); // Removes element at index 2 (Time Complexity: O(n))

        // 7. SIZE & UTILITY
        System.out.println("Current Size: " + arr.size());
        System.out.println("Is empty? " + arr.isEmpty());

        // 8. SORTING (Using the Collections Utility Class)
        Collections.sort(arr);

        // 9. ITERATION (The "For-Each" Loop)
        // This is the cleanest way to traverse a collection
        System.out.print("Final List: ");
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
    }
}