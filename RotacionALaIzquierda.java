package EDA_Repositorio_Grupal_2;
import java.util.Scanner;

public class RotacionALaIzquierda{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño que tendra la matriz: ");
        int tamaño = sc.nextInt();

        int[] matriz = new int[tamaño];

        for(int i=0;i<tamaño;i++){
            System.out.print("Ingrese el valor "+(i+1)+": ");
            matriz[i] = sc.nextInt();
        }

        System.out.print("Ingrese cuantos elementos desea rotar a la izquierda: ");
        int d = sc.nextInt();

        if(d>tamaño){
            System.out.println("No puede ingresar un valor mayor al tamaño");
        }
        else{
            matriz = rotarIzquierdaArray(matriz,d);
            for(int i=0;i<tamaño;i++){
                System.out.println(matriz[i]);
            }
        }
    }

    public static int[] rotarIzquierdaArray(int[] A, int num){
        int[] Aiz = new int[A.length];
        System.arraycopy(A, 0, Aiz, A.length-num, num);
        System.arraycopy(A, num, Aiz, 0, A.length-num);
        return Aiz;
    }
}