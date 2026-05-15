/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ListaEnlazada {

    Nodo cabeza;

    public void insertar(int valor) {

        Nodo nuevo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
    }

    public void mostrar() {

        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.valor);

            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }

            actual = actual.siguiente;
        }

        System.out.println();
    }
}