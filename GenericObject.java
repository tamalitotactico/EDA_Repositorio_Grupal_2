import java.util.*;

public class GenericObject<E> {

    public int dato;
    public GenericObject<E> siguiente;

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
        obj.remove(o);
        return true;
    }

    public boolean containsAll(Collection<E> c) {
        for (Object object : c) {
            if (obj.equals(object)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<E> c) {
        for (Object object : c) {
            obj.add(object);
        }
        return false;
    }

    public boolean addAll(int index, Collection<E> c) {
        return false;
    }

    public boolean removeAll(Collection<E> c) {
        for (Object object : c) {
            if (obj.contains(object)) {
                obj.remove(indexOf(object));
            }
        }
        return true;
    }

    public void clear() {
        for (Object object : obj) {

        }
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