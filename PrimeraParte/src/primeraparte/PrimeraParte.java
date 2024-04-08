/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeraparte;

import java.awt.JobAttributes;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class PrimeraParte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.agregarAlInicio(10);
        lista.agregarAlInicio(20);

        lista.agregarAlFinal(11);
        lista.agregarAlFinal(12);
        lista.mostrarLista();

        lista.eliminarAlInicio(10);
        lista.eliminarAlFinal(12);

        lista.mostrarLista();

    }
}
