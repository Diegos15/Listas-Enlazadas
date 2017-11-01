package com.company;

/**
 * Created by Diego Sánchez on 25/10/2017.
 */
public class Nodo {

    Object valor;
    Nodo siguiente;

    public Nodo(Object valor){
        this.valor = valor;
        this.siguiente = null;
    }

    public void enlazarSiguiente(Nodo n){
        siguiente = n;
    }


    public Object getValor(){
        return valor;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

}
