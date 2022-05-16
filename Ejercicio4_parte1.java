import java.util.*;

public class Ejercicio4_parte1 {

    public static void main(String args[]) {
        GenericObject<String> obj1 = new GenericObject<>(10);
        GenericObject<String> obj2 = new GenericObject<>(5, "César");
        GenericObject<String> obj3 = new GenericObject<>(10, "Alejandro");
        GenericObject<String> obj4 = new GenericObject<>(10, "Pepe");
        List<GenericObject<String>> lst1 = new ArrayList<>();
        List<GenericObject<String>> lst2 = new ArrayList<>();

        lst1.add(obj1); // Se agrega el objeto 1 al final (Posición 0 por que es el primer objeto
                        // genérico)
        lst1.add(1, obj2); // Se agrega el objeto genérico a la posición 1
        lst1.add(2, obj3);
        lst1.add(3, obj4);

        if (lst1.contains(obj1)) { // Se usa el método contains ver si la lista contiene un objeto específico
            System.out.println("La lista contiene el objeto genérico 1");
        } else {
            System.out.println("La lista NO contiene el objeto genérico 1");
        }

        if (lst1.equals(lst2)) { // Se usa el método equals de la lista para comparar dos listas existentes
            System.out.println("La lista 1 es igual a la lista 2");
        } else {
            System.out.println("Las listas son diferentes");
        }

        System.out.println("Se obtuvo de la lista 1 el objeto en la posición 1: " +
                lst1.get(1).nombre); // Se usa get en la lista para obtener el objeto, además obtenemos el nombre
                                     // para mostrarlo en la consola
        System.out.println("Buscamos la posición del objeto 1 y 2: " + lst1.indexOf(obj1) + " ; " +
                lst1.indexOf(obj2)); // Se usa indexOf()

        if (lst1.isEmpty()) {
            System.out.println("La lista 1 esta con objetos");
        } else {
            System.out.println("La lista 1 esta vacía");
        }
        if (lst2.isEmpty()) {
            System.out.println("La lista 2 esta con objetos");
        } else {
            System.out.println("La lista 2 esta vacía");
        }

        lst1.remove(obj1); // Se elimina el obj1 de la lista
        lst1.remove(3); // Se elimina el objeto generico en la posición 3 sin importar cual sea
        lst1.set(2, obj3); // Se setea la posición 1 para contener el objeto 3

        System.out.println("El tamaño de la lista 1 es: " + lst1.size());
    }
}
