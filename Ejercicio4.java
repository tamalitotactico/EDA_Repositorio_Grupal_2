public class Ejercicio4{
    public static void main(String[] args) {
        Lista <Integer> list = new Lista<>();
        list.add(3);
        list.add(5);
        list.add(9);
        //list.mostrar();
        list.delete(5);
        list.mostrar();
    }
}