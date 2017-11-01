package com.company;

/**
 * Created by Diego Sánchez on 23/10/2017.
 */
public class Lista {

    Nodo cabeza;
    int size;

    public Lista(){
        cabeza = null;
        size=0;
    }

    public boolean Vacia(){

        if (cabeza == null) {
            System.out.println("La lista esta vacía");
        }
        return Boolean.parseBoolean("");
    }

    public void Añadir(Object obj){

        if(cabeza == null){
            cabeza = new Nodo(obj);
        }else{
            Nodo temporal = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temporal);
            cabeza = nuevo;
        }
        size++;
    }

    public int size(){
        return  size;
    }

   public Object ShowList(int index){
        int contador =0;

        Nodo temp = cabeza;
        while (contador< index){
            temp = temp.getSiguiente();
            contador++;
        }
        return temp.getValor();
    }

    public void Eliminar(Object numeroeliminar) {

        Nodo temporal = cabeza;
        if(!buscar(numeroeliminar)){
            System.out.println("No se encontro");
        }else {

            if (numeroeliminar == temporal.getValor()) {
                cabeza = cabeza.getSiguiente();
            } else {
                while (temporal.getSiguiente().getValor() != numeroeliminar) {
                    temporal = temporal.getSiguiente();
                }
                // Guarda el nodo siguiente del nodo a eliminar.
                //Nodo siguiente = temporal.getSiguiente().getSiguiente();
                temporal.enlazarSiguiente(temporal.getSiguiente().getSiguiente());

            }
            size--;
        }
    }

    public void Buscar(Object referencia){
        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
            // Crea una copia de la lista.
            Nodo aux = cabeza;
            // COntado para almacenar la posición del nodo.
            int cont = 0;
            // Recoore la lista hasta llegar al nodo de referencia.
            while(referencia != aux.getValor()){
                // Incrementa el contador.
                cont ++;
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
            // Retorna el valor del contador.
            //return cont;
            System.out.println("El número: " + referencia + " esta ubicado en la pocisión: " + cont);
                    // Crea una excepción de Valor inexistente en la lista.
        } else {
            //return("Valor inexistente en la lista.");
            System.out.println("Valor inexistente en la lista.");
        }
    }

    public boolean buscar(Object numero){
        // Crea una copia de la lista.
        Nodo aux = cabeza;
        // Indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (numero == aux.getValor()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }

                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();

        }
        // Retorna el resultado.
        return encontrado;
    }


}
