import java.util.HashMap;
import java.util.Collection;

public class HashSet<T> {
    private HashMap<T, Boolean> map;

    public HashSet() {
        map = new HashMap<>();
    }
    public void add(T element) {
        if (!map.containsKey(element)) {
            map.put(element, null);
        }
    }
    // ... (other methods)

    // Add all elements from another collection to the set
    public void addAll(Collection<T> elements) {
        for (T element : elements) {
            map.put(element, true);
        }
    }
    public Collection<String> getAllElements() {
        return (Collection<String>) map.keySet();
    }

    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("orange");

        // Add all elements from another collection to the set
        HashSet<String> otherSet = new HashSet<>();
        otherSet.add("grape");
        otherSet.add("kiwi");

        System.out.println("Set before adding elements from the other set: " + stringSet.getAllElements());
        stringSet.addAll(otherSet.getAllElements());
        System.out.println("Set after adding elements from the other set: " + stringSet.getAllElements());
    }
}
