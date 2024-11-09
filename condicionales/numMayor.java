/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class numMayor {
    
    public static void main(String[] args) {
        int numMenor = Integer.MAX_VALUE; // Inicializamos con el valor máximo posible
        int mayor = Integer.MIN_VALUE;    // Inicializamos con el valor mínimo posible
        int cont;
        
        int max = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el máximo de números"));

        for (cont = 0; cont < max; cont++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número"));
            
            if (num > mayor) {
                mayor = num;
            }
            if (num < numMenor) {
                numMenor = num;
            }
        }

        JOptionPane.showMessageDialog(null, "El valor mayor es: " + mayor + "\nEl valor menor es: " + numMenor);
    }
}
