import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // ARRAYLISTS
        // Create Null Array
        ArrayList<String> arrayList = new ArrayList<>();
        // Note Can not use primitive data types in array list, only instantiated classes
        // i.e. ArrayList<int>, will throw "convert int to Java.lang.Integer"
        ArrayList<Integer> intArrayList = new ArrayList<>();

        // Add Items
        arrayList.add("Brandon");
        arrayList.add("Steve");

        // Remove Items
//        arrayList.clear();
        arrayList.remove("Steve");

        // Contains Item
        boolean hasBrandon = arrayList.contains("Brandon"); // true
        arrayList.isEmpty(); // false

        // Basic Ops
        arrayList.size(); // 1
        arrayList.get(0); // Brandon
        arrayList.indexOf("Brandon"); // 0
        arrayList.indexOf("Steve"); // -1
//        arrayList.sort(++Comparitor++);

        // Iterators
        for (int i=0; i<10; i++){
            // This Use case can also use Range.between(0, 10)
            intArrayList.add(i);
        }


        // MAPS <K, V>
        // Map is a subclass of Interface; no context, learn next time
        // new Maps<>(), will make you define a bunch of methods along with it, instead
        Map<String, String> contacts = new HashMap<>();
        // As Before, Can not use primitive data types in array list
        Map<String, Integer> localNumbers = new HashMap<>();

        // Add Items
        contacts.put("Brandon", "Colorado");
        contacts.put("Steve", "Texas");

        // Remove Item
//        contacts.clear();
        contacts.remove("Steve");

        // Contains Item
        contacts.containsKey("Brandon"); // true
        contacts.containsValue("Texas"); // false
        contacts.isEmpty(); // false

        // Basic Ops
        contacts.size(); // 1
        contacts.get("Brandon"); // Colorado
        contacts.keySet(); // [Brandon]
        contacts.values(); // [Colorado]


        // Can also do a list of classes (similar to list of tuples)
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student("Brandon", 12));

        // Iterating over this (since map-keys can't be iterated over?)
        // This data type is similar to a [{},{}] in Python
        for (Student s: students) {
            System.out.println(s.getName());
        }

        // Debug
        System.out.print("L");
    }
}