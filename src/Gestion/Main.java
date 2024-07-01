package Gestion;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definiendo variables
		Scanner scanner = new Scanner (System.in);
		boolean salir = false;
		
		//Bucle que interactua con el usuario
		while (!salir) {
            System.out.println("Bienvenido al juego de adivinar el número.");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        jugar(scanner);
                        break;
                    case 2:
                        salir = true;
                        System.out.println("Gracias por jugar. ¡Adiós!");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) { //Error al ingresar un valor no numerico
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        scanner.close();
    }
		