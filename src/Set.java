import java.util.HashMap;
import java.util.Collection;
import java.util.Objects;

public class Set<T> {
    private final HashMap<T, Objects> map;
    public Set(){
        this.map = new HashMap<>();
    }
    public boolean contains(T element) {
        return map.containsKey(element);
    }
    public void add(T element) {
        if (!map.containsKey(element)) {
            map.put(element, null);
        }
    }
    public void remove(T element) {
        map.remove(element);
    }
    public boolean containsAll(Collection<T> elements) {
        for (T element : elements) {
            if (!map.containsKey(element)) {
                return false;
            }
        }
        return true;
    }
    //don't duplicate
    public void addAll(Collection<T> element){
        for(T elem : element){
            if(!containsAll(element)){
                map.put(elem,null);
            }
        }
    }
    public void removeAll(Collection<T> element){
        for (T elem : element) {
            map.remove(elem);
        }
    }
    public void retainAll(Collection<T> element){
        Set<T> copySet = new Set<>();
        copySet.addAll(map.keySet());
        for (T elem : copySet.getAllElements()) {
            if (!element.contains(elem)) {
                map.remove(elem);
            }
        }
    }
    public Collection<T> getAllElements() {
        return map.keySet();
    }
    public void printAll() {
        System.out.print("elements: ");
        for (T element : map.keySet()) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public int size(){
        return map.size();
    }
}
