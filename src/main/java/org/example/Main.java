package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int opcion = -1;
         ArrayList<Animal> animales_bajo_cuidado = new ArrayList<>();
         Scanner scan = new Scanner(System.in);
         while (opcion!=0){

             opcion = -1;
             System.out.println("""
                     Bienvenido:\s
                     1- Ingresar animal a la guardería.
                     2- Retirar animal de la guardería.
                     3 - Cantidad de animales en la guarderia.
                     4 - Lista con todos los animales y todos sus datos.
                     5 - Hacer saludar a todos los animales de la lista.
                     0 - Salir""");
             opcion = scan.nextInt();
             scan.nextLine();
             switch (opcion){
                 case 1: {
                     Agregar_animal(animales_bajo_cuidado, scan);
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
                     System.out.println("hay " + animales_bajo_cuidado.size() + " animales en la gaurderia");
                     break;
                 }
                 case 4: {
                     if (animales_bajo_cuidado.size()>0){
                         for (Animal animal : animales_bajo_cuidado){
                             animal.mostrarDatos();
                         }
                     }else {
                         System.out.println("No hay animales en la guarderia");
                     }
                     break;
                 }
                 case 5: {
                     for (Animal animal: animales_bajo_cuidado){
                         animal.saludar();
                     }
                     break;
                 }
                 case 0: {
                     opcion = 0;
                     break;
                 }
                 default: {
                     System.out.println("Opcion invalida");
                     break;
                 }
             }

         }
         scan.close();
    }

    private static void Agregar_animal(ArrayList<Animal> animales, Scanner scanner) {
        int op_animal = -1;

        System.out.println(""" 
                            Que tipo de animal desea ingresar?\s
                            
                            1 - Hamster.
                            2 - Pez.
                            3 - Gato.
                            4 - Perro.""");
        op_animal = scanner.nextInt();
        scanner.nextLine();
        switch (op_animal){
            case 1:{
                System.out.println("Ingrese edad del Hamster: ");
                int edad = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el sexo del Hamster: (m o f)");
                char sexo = scanner.next().charAt(0);
                scanner.nextLine();
                while (!(sexo == 'm' || sexo=='M' || sexo=='f'|| sexo=='F')){
                    System.out.println("Sexo invalido");
                    System.out.println("Ingrese el sexo del Hamster: (m o f)");
                    sexo = scanner.next().charAt(0);
                    scanner.nextLine();
                }

                System.out.println("Ingrese el nombre del Hamster: ");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese el nombre del dueño: ");
                String nombre_duenio = scanner.nextLine();

                System.out.println("Ingrese la direccion del dueño: ");
                String direccion_duenio = scanner.nextLine();

                System.out.println("Ingrese el peso del Hamster: ");
                int peso = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el documento del dueño: ");
                int doc_duenio =  scanner.nextInt();
                scanner.nextLine();

                Hamster hamster = new Hamster(edad,sexo,nombre,nombre_duenio,doc_duenio,direccion_duenio,peso);
                animales.add(hamster);
                int posicion = animales.indexOf(hamster);
                hamster.setPosicion(animales);
                System.out.println("Se agrego un hamster correctamente.");
                break;
            }
            case 2: {
                System.out.println("Ingrese edad del Pez: ");
                int edad = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el sexo del Pez: (m o f)");
                char sexo = scanner.next().charAt(0);
                scanner.nextLine();
                while (!(sexo == 'm' || sexo=='M' || sexo=='f'|| sexo=='F')){
                    System.out.println("Sexo invalido");
                    System.out.println("Ingrese el sexo del Hamster: (m o f)");
                    sexo = scanner.next().charAt(0);
                    scanner.nextLine();
                }

                System.out.println("Ingrese el nombre del Pez: ");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese el nombre del dueño: ");
                String nombre_duenio = scanner.nextLine();

                System.out.println("Ingrese la direccion del dueño: ");
                String direccion_duenio = scanner.nextLine();

                System.out.println("Ingrese el peso del Pez: ");
                int peso = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el documento del dueño: ");
                int doc_duenio =  scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el tipo de agua que encesita el pez: ");
                String agua = scanner.nextLine();

                Pez pez = new Pez(edad,sexo,nombre,nombre_duenio,doc_duenio,direccion_duenio,peso,agua);
                animales.add(pez);
                int posicion = animales.indexOf(pez);
                pez.setPosicion(animales);
                System.out.println("Se agrego un pez correctamente.");
                break;
            }
            case 3: {
                System.out.println("Ingrese edad del Gato: ");
                int edad = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el sexo del Gato: (m o f)");
                char sexo = scanner.next().charAt(0);
                scanner.nextLine();
                while (!(sexo == 'm' || sexo=='M' || sexo=='f'|| sexo=='F')){
                    System.out.println("Sexo invalido");
                    System.out.println("Ingrese el sexo del Hamster: (m o f)");
                    sexo = scanner.next().charAt(0);
                    scanner.nextLine();
                }

                System.out.println("Ingrese el nombre del Gato: ");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese el nombre del dueño: ");
                String nombre_duenio = scanner.nextLine();

                System.out.println("Ingrese la direccion del dueño: ");
                String direccion_duenio = scanner.nextLine();

                System.out.println("Ingrese el peso del Gato: ");
                int peso = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el documento del dueño: ");
                int doc_duenio = scanner.nextInt();
                scanner.nextLine();

                Gato gato = new Gato(edad,sexo,nombre,nombre_duenio,doc_duenio,direccion_duenio,peso);
                animales.add(gato);
                int posicion = animales.indexOf(gato);
                gato.setPosicion(animales);
                System.out.println("Se agrego un gato correctamente.");
                break;
            }
            case 4: {
                System.out.println("Ingrese edad del Perro: ");
                int edad = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el sexo del Perro: (m o f)");
                char sexo = scanner.next().charAt(0);
                scanner.nextLine();
                while (!(sexo == 'm' || sexo=='M' || sexo=='f'|| sexo=='F')){
                    System.out.println("Sexo invalido");
                    System.out.println("Ingrese el sexo del Hamster: (m o f)");
                    sexo = scanner.next().charAt(0);
                    scanner.nextLine();
                }

                System.out.println("Ingrese la raza del Perro: ");
                String raza = scanner.nextLine();

                System.out.println("Ingrese el nombre del Perro: ");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese el nombre del dueño: ");
                String nombre_duenio = scanner.nextLine();

                System.out.println("Ingrese la direccion del dueño: ");
                String direccion_duenio = scanner.nextLine();

                System.out.println("Ingrese el peso del Perro en gramos: ");
                int peso = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el documento del dueño: ");
                int doc_duenio =  scanner.nextInt();
                scanner.nextLine();

                Perro perro = new Perro(edad,raza,sexo,nombre,nombre_duenio,doc_duenio,direccion_duenio,peso);
                animales.add(perro);
                int posicion = animales.indexOf(perro);
                perro.setPosicion(animales);
                System.out.println("Se agrego un perro correctamente.");
                break;
            }
        }
    }
}