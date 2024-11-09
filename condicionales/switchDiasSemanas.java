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
public class switchDiasSemanas {
    public static void main(String[] args) {
        
        String nombreDia;
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero del 1 al 7"));
        
        switch (dia){
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Dia incorrecto";
        }
        JOptionPane.showMessageDialog(null, "El dia de la semana es: "+nombreDia);
    }
}
