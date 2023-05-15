package org.example;

import java.util.ArrayList;

public abstract class Animal {
    private int edad;
    private String nombre;
    private String nombre_duenio;
    private int doc_duenio;
    private String direccion_duenio;
    private char sexo;
    private int peso;
    private String tipo;

    private int posicion;

    public void Saludar(){
        System.out.println("Hola me llamo "+ this.nombre + " y además soy un " +
                this.tipo);
    }


    //Setters

    public void setPosicion(ArrayList<Animal> lista) {
        if (lista.size() == 1){
            posicion = 0;
        } else {
            posicion = lista.indexOf(this);
        }
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public void setDoc_duenio(int doc_duenio) {
        this.doc_duenio = doc_duenio;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void  setDireccion_duenio(String direccion_duenio) {
        this.direccion_duenio = direccion_duenio;
    }




    //Getters


    public int getPosicion() {
        return posicion;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public int getDoc_duenio() {
        return doc_duenio;
    }

    public char getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDireccion_duenio() {
        return direccion_duenio;
    }
}
