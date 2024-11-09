
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class par_Impar {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero"));
        
        if(num % 2 == 0){
            JOptionPane.showMessageDialog(null, num+" es par.");
        }else{
            JOptionPane.showMessageDialog(null, num+" es impar.");
        }
    }
}
