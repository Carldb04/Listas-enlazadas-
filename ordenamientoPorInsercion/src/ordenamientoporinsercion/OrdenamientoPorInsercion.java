/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientoporinsercion;

/**
 *
 * @author Carlos
 */
public class OrdenamientoPorInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {5, 2, 4, 1, 3};

        for (int i = 1; i < array.length; i++) {
            int valorActual = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > valorActual) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = valorActual;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
