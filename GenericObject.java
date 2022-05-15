
public class GenericObject<E> {

    public int dato;
    public String nombre;

    public GenericObject(int d) {
        this.dato = d;
        nombre = "Anonimo";
    }

    public GenericObject(int d, String n) {
        dato = d;
        nombre = n;
    }

}