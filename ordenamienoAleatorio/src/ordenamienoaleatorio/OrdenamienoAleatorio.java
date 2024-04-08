/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamienoaleatorio;

/**
 *
 * @author Carlos
 */
public class OrdenamienoAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {5, 2, 4, 1, 3};

        for (int i = 0; i < array.length; i++) {
            int indiceAleatorio = (int) (Math.random() * array.length);
            int temp = array[i];
            array[i] = array[indiceAleatorio];
            array[indiceAleatorio] = temp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
