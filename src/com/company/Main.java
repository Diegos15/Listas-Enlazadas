package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion;
        Object numero,eliminar,buscarnumero;
        Lista lista = new Lista();


        do{
            System.out.println("Elige una opción");
            System.out.println("1. Insertar\t\t2. Mostrar\t\t3. Buscar");
            System.out.println("4. Eliminar\t\t5. Contar\t\t6. Salir");

            opcion = sc.nextLine();

            switch (opcion) {
            case "1":

                System.out.println("Dame un número");
                numero = sc.nextInt();
                lista.Añadir(numero);
                System.out.println("ELemnto agregado\n");

                break;
            case "2":

                lista.Vacia();
                System.out.println("\n");
                for(int i=0; i<lista.size();i++) {
                    System.out.print(lista.ShowList(i)+" ---> ");
                }
                System.out.println("\n");

                break;
            case "3":


                System.out.println("Dame el número a buscar");
                buscarnumero = sc.nextInt();

                    lista.Buscar(buscarnumero);


                break;

            case "4":

                System.out.println("¿Qué número desea eliminar?");
                eliminar=sc.nextInt();

                lista.Eliminar(eliminar);

                break;

            case "5":

                System.out.println("\n");
                System.out.println("La lista tiene: " + lista.size() + " elementos");

                break;
                case "6":

                System.out.println("Adiós");

                break;

            default:
                System.out.println("Opción incorrecta");
                break;
            }

        } while(!opcion.equals("6"));

    }
}

