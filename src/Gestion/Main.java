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
			System.out.println("===============================================");
            System.out.println("| Bienvenido al juego de adivinar el número |");
            System.out.println("=================================");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.println("=================================");
            System.out.println("Elige una opción: ");
            System.out.println("===============================================");
           
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

	//Metodo de calculos del programa
		private static void jugar(Scanner scanner) {
	        Random random = new Random();
	        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número entre 1 y 100
	        int intentosMaximos = 10;
	        int intentos = 0;
	        boolean adivinado = false;
	        
	        System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");
	        System.out.println("Tienes " + intentosMaximos + " intentos.");
	        
	        while (intentos < intentosMaximos && !adivinado) { //Guia al usuario con el numero
	            System.out.print("Introduce tu intento: ");
	            try {
	                int intento = scanner.nextInt();
	                intentos++;

	                if (intento < numeroAleatorio) {
	                    System.out.println("Demasiado bajo.");
	                } else if (intento > numeroAleatorio) {
	                    System.out.println("Demasiado alto.");
	                } else { //Intento correcto
	                    adivinado = true;
	                    System.out.println("¡Correcto! Has adivinado el número en " + intentos + " intentos.");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Entrada no válida. Por favor, ingresa un número.");
	                scanner.next(); // Limpiar el buffer del scanner
	            }
	        }

	        if (!adivinado) { //Intentos maximos
	            System.out.println("Lo siento, has agotado tus intentos. El número era " + numeroAleatorio + ".");
	        }
	    }
	}

		