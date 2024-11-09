
package condicionales;

import javax.swing.JOptionPane;

public class eje1 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null,"Digite su nombre: ");
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la primera nota: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la segunda nota: "));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la tercera nota: "));
        
        double promedio = (n1+n2+n3)/3;
        
        if(promedio >= 11){
            JOptionPane.showMessageDialog(null, "APROBADO con: "+promedio);
        }else{
            JOptionPane.showMessageDialog(null, "DESAPROBADO con: "+promedio);
        }
    }
}
