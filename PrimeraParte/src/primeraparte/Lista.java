/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeraparte;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Lista {

    private Nodo primero;
    private Nodo ultimo;
    private int tamanio;

    public Lista() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tamanio == 0;
    }

    public void agregarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            primero = ultimo = nuevo;
        } else {
            nuevo.setSiguiente(primero);
            primero = nuevo;
        }
        tamanio++;
    }

    public void agregarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamanio++;
    }

    public void eliminarAlInicio(int dato) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else if (tamanio == 1) {
            primero = ultimo = null;
            tamanio--;
        } else {
            primero = primero.getSiguiente();
            tamanio--;
        }
    }

    public void eliminarAlFinal(int dato) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else if (tamanio == 1) {
            primero = ultimo = null;
            tamanio--;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != ultimo) {
                actual = actual.getSiguiente();
            }
            ultimo = actual;
            actual.setSiguiente(null);
            tamanio--;
        }
    }

    public void mostrarLista() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            String mensaje = "";
            Nodo actual = primero;
            while (actual != null) {
                mensaje += actual.getDato() + " ";
                actual = actual.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    public int getTamanio() {
        return tamanio;
    }

}
