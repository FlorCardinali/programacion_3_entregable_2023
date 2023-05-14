package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         int opcion = -1;
        Scanner scan = new Scanner(System.in);
         while (opcion!=0){
             System.out.println("""
                     Bienvenido:\s
                     1- Ingresar animal a la guardería (que pida los datos necesarios)
                     2- Retirar animal de la guardería (le pregunta al usuario en qué
                     posición de la lista está el animal que desea retirar)
                     3 - Calcular cantidad de animales actualmente en la guardería
                     (devuelve un entero con la cantidad de animales en la guardería)
                     4 - Listar todos los animales con todos sus datos.(ver ejemplo
                     debajo)
                     5 - Hacer saludar a todos los animales de la lista.
                     0 - Salir (sale del programa)""");
             opcion = scan.nextInt();
             switch (opcion){
                 case 1: {
                     System.out.println("se puso opcion 1");
                     break;
                 }
                 case 2: {
                     System.out.println("se puso opcion 2");
                     break;
                 }
                 case 3: {
                     System.out.println("se puso opcion 3");
                     break;
                 }
                 case 4: {
                     System.out.println("se puso opcion 4");
                     break;
                 }
                 case 5: {
                     System.out.println("se puso opcion 5");
                     break;
                 }
                 case 6: {
                     System.out.println("se puso opcion 6");
                     break;
                 }
                 default: {
                     System.out.println("Opcion invalida");
                     break;
                 }
             }
         }
    }
}