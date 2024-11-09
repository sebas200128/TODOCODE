/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadorTernario;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class OperadorTernario {

    public static void main(String[] args) {
        double prom;
        String condiFinal;
        String nombre;
        

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cual es tu nombre? ");
        nombre = leer.nextLine();

        System.out.println("Ingrese el promedio del alumno: ");
        prom = leer.nextDouble();

        condiFinal = (prom >= 11) ? "Aprobado" : "Desaprobado";
        
        System.out.println("Alumno: "+nombre+" Su condicion final del alumno es: "+condiFinal+" El promedio fue: "+prom);
    }
}
