/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Operadores {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        JOptionPane.showMessageDialog(null, "La suma es: " + suma
                + "\nLa resta es: " + resta
                + "\nLa multiplicacion es: " + multiplicacion
                + "\nLa division es: " + division);
    }
}
