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

    public void delete(T value){
        if( isEmpty()){
            System.out.println("No puede eliminar porque en la lista no hay nada");
            return;
        }

        //Si se desea eliminar la cabezera
        if(cabezera.data == value){
            cabezera = cabezera.nextNode;
            return;
        }

        //Para eliminar nodos que no sean la cabezera
        Node msj = cabezera;
        while(msj.nextNode != null){
            if(msj.nextNode.data == value){
                msj.nextNode = msj.nextNode.nextNode;
                return;
            }
            msj = msj.nextNode;
        }
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

    

    public boolean isEmpty(){
        return (this.cabezera == null) ? true : false;
    } 
}
