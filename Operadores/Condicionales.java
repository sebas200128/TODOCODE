package Operadores;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double n1, n2, n3, promedio;

        System.out.println("Ingrese nota1: ");
        n1 = leer.nextDouble();
        System.out.println("Ingrese nota2: ");
        n2 = leer.nextDouble();
        System.out.println("Ingrese nota3");
        n3 = leer.nextDouble();

        promedio = (n1 + n2 + n3) / 3;

        System.out.println("Tu promedio es de: " + promedio);
        if (promedio < 11) {
            System.out.println("Estas desaprobado con " + promedio);
        } else {
            System.out.println("Felicidades aprobaste con: " + promedio);
        }
    }

}
