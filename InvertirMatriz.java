import java.util.Scanner;

public class InvertirMatriz {

    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = s.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++) {
	        System.out.print("Ingrese el " + (i+1) + "º valor : ");
	        array[i] = s.nextInt();
        }
        array = invertirArray(array);
        System.out.println("Matriz invertida:");
        for(int i=0; i<array.length; i++)
	        System.out.print(array[i] + "\t");
    }

    static int[] invertirArray(int[] A) {
        int[] Ain = new int[A.length];
        for(int i=0, j=A.length-1; i<A.length; i++, j--) 
            Ain[i] = A[j];
        return Ain;
    }

}