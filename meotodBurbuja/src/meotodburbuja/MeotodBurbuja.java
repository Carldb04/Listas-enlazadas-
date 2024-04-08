/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meotodburbuja;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class MeotodBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {5, 2, 4, 1, 3};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i : array) {
            JOptionPane.showMessageDialog(null, +i + " ");

        }
    }
}
