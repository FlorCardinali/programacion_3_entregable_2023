package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int opcion = -1;
         ArrayList<Animal> animales_bajo_cuidado = new ArrayList<>();
         Scanner scan = new Scanner(System.in);
         while (opcion!=0){
             System.out.println("""
                     Bienvenido:\s
                     1- Ingresar animal a la guardería.
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
                     Agregar_animal(animales_bajo_cuidado);
                     break;
                 }
                 case 2: {
                     Scanner scanner_2 = new Scanner(System.in);
                     System.out.println("Ingrese la posicion del animal que quiere borrar: ");
                     int indice = scanner_2.nextInt();
                     System.out.println("Quiere eliminar a " + animales_bajo_cuidado.get(indice).getNombre() + "? (y o n)");
                     char borrar = scanner_2.next().charAt(0);
                     scanner_2.nextLine();
                     if (borrar == 'y' || borrar == 'Y'){
                         System.out.println("Se borro correctamente a "+ animales_bajo_cuidado.get(indice).getNombre() );
                         animales_bajo_cuidado.remove(indice);
                         for (Animal animal : animales_bajo_cuidado){
                             animal.setPosicion(animales_bajo_cuidado);
                         }
                     }else if (borrar == 'n' || borrar=='N'){
                         System.out.println("que bueno que no lo borro, vuelva a intentar.");
                     } else {
                         System.out.println("Opcion invalida.");
                     }
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

    private static void Agregar_animal(ArrayList<Animal> animales) {
        int op_animal = -1;

        System.out.println(""" 
                            Que tipo de animal desea ingresar?\s
                            
                            1 - Hamster.
                            2 - Pez.
                            3 - Gato.
                            4 - Perro.""");
        Scanner scanner = new Scanner(System.in);
        Scanner scaner_atributos = new Scanner(System.in);
        op_animal = scanner.nextInt();
        switch (op_animal){
            case 1:{
                System.out.println("Ingrese edad del Hamster: ");
                int edad = scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                System.out.println("Ingrese el sexo del Hamster: (m o f)");
                char sexo = scaner_atributos.next().charAt(0);
                scaner_atributos.nextLine();

                System.out.println("Ingrese el nombre del Hamster: ");
                String nombre = scaner_atributos.nextLine();

                System.out.println("Ingrese el nombre del dueño: ");
                String nombre_duenio = scaner_atributos.nextLine();

                System.out.println("Ingrese la direccion del dueño: ");
                String direccion_duenio = scaner_atributos.nextLine();

                System.out.println("Ingrese el peso del Hamster: ");
                int peso = scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                System.out.println("Ingrese el documento del dueño: ");
                int doc_duenio =  scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                Hamster hamster = new Hamster(edad,sexo,nombre,nombre_duenio,doc_duenio,direccion_duenio,peso);
                animales.add(hamster);
                int posicion = animales.indexOf(hamster);
                hamster.setPosicion(animales);
                System.out.println("Se agrego un hamster correctamente.");
                scaner_atributos.close();
                scanner.close();
            }
            case 2: {
                System.out.println("Ingrese edad del Pez: ");
                int edad = scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                System.out.println("Ingrese el sexo del Pez: (m o f)");
                char sexo = scaner_atributos.next().charAt(0);
                scaner_atributos.nextLine();

                System.out.println("Ingrese el nombre del Pez: ");
                String nombre = scaner_atributos.nextLine();

                System.out.println("Ingrese el nombre del dueño: ");
                String nombre_duenio = scaner_atributos.nextLine();

                System.out.println("Ingrese la direccion del dueño: ");
                String direccion_duenio = scaner_atributos.nextLine();

                System.out.println("Ingrese el peso del Pez: ");
                int peso = scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                System.out.println("Ingrese el documento del dueño: ");
                int doc_duenio =  scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                System.out.println("Ingrese el tipo de agua que encesita el pez: ");
                String agua = scaner_atributos.nextLine();

                Pez pez = new Pez(edad,sexo,nombre,nombre_duenio,doc_duenio,direccion_duenio,peso,agua);
                animales.add(pez);
                int posicion = animales.indexOf(pez);
                pez.setPosicion(animales);
                System.out.println("Se agrego un pez correctamente.");
                scaner_atributos.close();
                scanner.close();
            }
            case 3: {
                System.out.println("Ingrese edad del Gato: ");
                int edad = scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                System.out.println("Ingrese el sexo del Gato: (m o f)");
                char sexo = scaner_atributos.next().charAt(0);
                scaner_atributos.nextLine();

                System.out.println("Ingrese el nombre del Gato: ");
                String nombre = scaner_atributos.nextLine();

                System.out.println("Ingrese el nombre del dueño: ");
                String nombre_duenio = scaner_atributos.nextLine();

                System.out.println("Ingrese la direccion del dueño: ");
                String direccion_duenio = scaner_atributos.nextLine();

                System.out.println("Ingrese el peso del Gato: ");
                int peso = scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                System.out.println("Ingrese el documento del dueño: ");
                int doc_duenio =  scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                Gato gato = new Gato(edad,sexo,nombre,nombre_duenio,doc_duenio,direccion_duenio,peso);
                animales.add(gato);
                int posicion = animales.indexOf(gato);
                gato.setPosicion(animales);
                System.out.println("Se agrego un gato correctamente.");
                scaner_atributos.close();
                scanner.close();
            }
            case 4: {
                System.out.println("Ingrese edad del Perro: ");
                int edad = scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                System.out.println("Ingrese el sexo del Perro: (m o f)");
                char sexo = scaner_atributos.next().charAt(0);
                scaner_atributos.nextLine();

                System.out.println("Ingrese la raza del Perro: ");
                String raza = scaner_atributos.nextLine();

                System.out.println("Ingrese el nombre del Perro: ");
                String nombre = scaner_atributos.nextLine();

                System.out.println("Ingrese el nombre del dueño: ");
                String nombre_duenio = scaner_atributos.nextLine();

                System.out.println("Ingrese la direccion del dueño: ");
                String direccion_duenio = scaner_atributos.nextLine();

                System.out.println("Ingrese el peso del Perro en gramos: ");
                int peso = scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                System.out.println("Ingrese el documento del dueño: ");
                int doc_duenio =  scaner_atributos.nextInt();
                scaner_atributos.nextLine();

                Perro perro = new Perro(edad,raza,sexo,nombre,nombre_duenio,doc_duenio,direccion_duenio,peso);
                animales.add(perro);
                int posicion = animales.indexOf(perro);
                perro.setPosicion(animales);
                System.out.println("Se agrego un perro correctamente.");
            }
        }
    }
}