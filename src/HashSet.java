import java.util.*;
import java.util.Set;
import java.util.HashMap;
public class HashSet<T> implements Set {
    private final HashMap<Object, Boolean> map;
    public HashSet(){
        this.map = new HashMap<>();
    }
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (!map.containsKey(o)) {
            map.put(o, true);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) != null;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean checked = false;
        for (Object o : c) {
            if (map.put(o, true) == null) {
                checked = true;
            }
        }
        return checked;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        boolean checked = false;
        for (Object o : c) {
            if (map.remove(o) != null) {
                checked = true;
            }
        }
        return checked;
    }

    @Override
    public boolean retainAll(Collection c) {
        boolean checked = false;
        HashSet<T> copySet = new HashSet<>();
        copySet.addAll(map.keySet());
        for (Object element : copySet) {
            if (!c.contains(element)) {
                map.remove(element);
                checked = true;
            }
        }
        return checked;
    }

    @Override
    public boolean containsAll(Collection c) {
        for (Object o : c) {
            if (!map.containsKey(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public void printAll() {
        System.out.print("elements: ");
        for (Object element : map.keySet()) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
