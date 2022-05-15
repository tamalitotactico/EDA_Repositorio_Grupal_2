public class Ejercicio4_parte1 {

    public static void main(String args[]) {
        GenericObject<String> obj1 = new GenericObject<>();

        String nombre = "César";

        obj1.add(3, nombre); // Se agrega elementos en la posición 3
        System.out.println("Objeto nombre (valor: 'César') agregado a la posición 3.");

        obj1.add("Fin"); // Se agrega elementos al final
        System.out.println("Objeto de valor 'Fin' agregado a la posición final.");

        if (obj1.contains(nombre)) {
            System.out.println("La lista contiene a " + nombre);
        } else {
            System.out.println("La lista NO contiene a " + nombre);
        }
    }
}
