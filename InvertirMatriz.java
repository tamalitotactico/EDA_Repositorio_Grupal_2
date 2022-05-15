public class InvertirMatriz {

    public static void main(String[]args) {
        
    }

    static int[] invertirArray(int[] A) {
        int[] Ain = new int[A.length];
        for(int i=0, j=A.length-1; i<A.length; i++, j--) 
            Ain[i] = A[j];
        return Ain;
    }

}