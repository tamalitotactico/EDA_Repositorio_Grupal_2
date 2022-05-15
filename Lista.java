public class Lista <T>{
    Node <T> cabezera; 

    //Para añadir nodos
    public void add ( T value ){
        // Verificamos si esta vacio
        if ( isEmpty()){
            cabezera = new Node(value);
            return; //Finalizara la ejecucion del codigo
        }

        //Este nodo verificara si existen nodos que referencias a otro nodo
        Node msj = cabezera;
        
        //Recorrera el siguiente nodo de la lista hasta que no exista
        while(msj.nextNode != null){
            msj = msj.nextNode;
        }
        msj.nextNode = new Node<T>(value);
    }

    public boolean isEmpty(){
        return this.cabezera == null ? true : false;
    } 

    public void mostrar(){
        Node msj = cabezera ;
        //Si no hay nada para mostrar
        if(isEmpty()){
            System.out.println("¡¡¡La lista esta Vacia!!!");
            return;
        }
        //Recorrera la lista e imprimira el valor
        while (msj != null){
            System.out.println(msj.data);
            msj = msj.nextNode;
        }
    }
}
