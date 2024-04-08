/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientoporseleccion;

/**
 *
 * @author Carlos
 */
public class OrdenamientoPorSeleccion {

    /**
     * @param args the command line arguments
     */
    public class Main {

        public static void main(String[] args) {

            int[] array = {5, 2, 4, 1, 3};

            for (int i = 0; i < array.length - 1; i++) {
                int indiceMenor = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[indiceMenor]) {
                        indiceMenor = j;
                    }
                }
                int temp = array[i];
                array[i] = array[indiceMenor];
                array[indiceMenor] = temp;
            }

            for (int i : array) {
                System.out.print(i + " ");
            }
        }

    }
}
