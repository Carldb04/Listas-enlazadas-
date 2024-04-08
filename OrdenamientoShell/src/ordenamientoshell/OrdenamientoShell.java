/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientoshell;

/**
 *
 * @author Carlos
 */
public class OrdenamientoShell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 1, 3};

        int salto = array.length / 2;
        while (salto > 0) {
            for (int i = salto; i < array.length; i++) {
                int valorActual = array[i];
                int j = i;
                while (j >= salto && array[j - salto] > valorActual) {
                    array[j] = array[j - salto];
                    j -= salto;
                }
                array[j] = valorActual;
            }
            salto /= 2;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
