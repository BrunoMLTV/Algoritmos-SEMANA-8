/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class InversorLista {

    public static Nodo invertir(Nodo cabeza) {

        Nodo anterior = null;
        Nodo actual = cabeza;

        while (actual != null) {

            Nodo siguiente = actual.siguiente;

            actual.siguiente = anterior;

            anterior = actual;

            actual = siguiente;
        }

        return anterior;
    }
}