public class GenericObject<T> {

    private T first;
    private T existe;

    public GenericObject() {
        first = null;
        existe = (T) "Si, existe!";
    }

    public void setFirst(T value) {
        first = value;
    }

    public T getFirst() {
        return first;
    }

    public T itExist() {
        return existe;
    }
}