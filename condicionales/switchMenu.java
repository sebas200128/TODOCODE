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
public class switchMenu {

    public static void main(String[] args) {
        double saldo = 0.0; // Inicializamos el saldo en 0.0
        StringBuilder movimientos = new StringBuilder(); // Para almacenar los movimientos

        while (true) {
            // Mostramos el menú de opciones
            String opcionStr = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n"
                    + "1. Ver saldo\n"
                    + "2. Realizar depósito\n"
                    + "3. Retirar dinero\n"
                    + "4. Ver movimientos\n"
                    + "5. Salir"
            );

            // Convertimos la entrada a un número entero
            int opcion;
            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
                continue;
            }

            switch (opcion) {
                case 1:
                    // Ver saldo
                    JOptionPane.showMessageDialog(null, "Saldo actual: $" + saldo);
                    break;
                case 2:
                    // Realizar depósito
                    String depositoStr = JOptionPane.showInputDialog("Ingrese el monto a depositar:");
                    try {
                        double deposito = Double.parseDouble(depositoStr);
                        if (deposito > 0) {
                            saldo += deposito;
                            movimientos.append("Depósito: $").append(deposito).append(" - Saldo actual: $").append(saldo).append("\n");
                            JOptionPane.showMessageDialog(null, "Has depositado: $" + deposito + "\nSaldo actual: $" + saldo);
                        } else {
                            JOptionPane.showMessageDialog(null, "El monto debe ser positivo.");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Monto no válido.");
                    }
                    break;
                case 3:
                    // Retirar dinero
                    String retiroStr = JOptionPane.showInputDialog("Ingrese el monto a retirar:");
                    try {
                        double retiro = Double.parseDouble(retiroStr);
                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro;
                            movimientos.append("Retiro: $").append(retiro).append(" - Saldo actual: $").append(saldo).append("\n");
                            JOptionPane.showMessageDialog(null, "Has retirado: $" + retiro + "\nSaldo actual: $" + saldo);
                        } else if (retiro > saldo) {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "El monto debe ser positivo.");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Monto no válido.");
                    }
                    break;
                case 4:
                    // Ver movimientos
                    if (movimientos.length() == 0) {
                        JOptionPane.showMessageDialog(null, "No hay movimientos registrados.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Movimientos:\n" + movimientos.toString());
                    }
                    break;
                case 5:
                    // Salir
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. ¡Adiós!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}
