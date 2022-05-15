import java.util.*;

public class GenericObject<E> {

    GenericObject<E> obj;

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        if (obj.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        if (obj.contains(o)) {
            return true;
        }
        return false;
    }

    public boolean add(Object e) {
        obj.add(e);
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }
}