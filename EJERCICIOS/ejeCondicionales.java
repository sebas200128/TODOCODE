/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ejeCondicionales {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a Englisch School");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del alumno"));
        
        if (edad >= 4 && edad <= 6) {
            JOptionPane.showMessageDialog(null, "El horario del grupo KINDER, es de Lunes y Miercoles de 16 a 17hrs");
        } else if (edad >= 7 && edad <= 8) {
            JOptionPane.showMessageDialog(null, "El horario del grupo 1st year, es Martes y jueves de 16:30 a 17:30");
        } else if (edad >= 9 && edad <= 10) {
            JOptionPane.showMessageDialog(null, "El horario del grupo 2do year, es Martes y Jueves de 17:30 a 19:00");
        } else if (edad >= 11 && edad <= 13) {
            JOptionPane.showMessageDialog(null, "El horario del grupo 3rd year, es Lunes y Miercoles de 17 a 18:30");
        } else {
            JOptionPane.showMessageDialog(null, "Opcion invalida");
        }
    }
}
