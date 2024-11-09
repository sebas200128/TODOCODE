
package Operadores;

import java.util.Scanner;


public class EjercicioIf {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad = leer.nextInt();

        if (edad > 18) {
            System.out.println("Eres mayor de edad, FELICIDADES");
        } else {
            if(edad ==18){
                System.out.println("Tienes exactamente 18");
            }else{
                System.out.println("Eres menor de edad");
            }
        }
        System.out.println("Llegue al final");
    }
}
