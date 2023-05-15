package org.example;

public class Perro extends Animal{
    String raza;
    public Perro(int p_edad,String p_raza,char p_sexo ,String p_nombre,String p_nombre_duenio, int p_doc_duenio, String p_direccion_duenio, int p_peso) {
        setEdad(p_edad);
        setTipo("Perro");
        setNombre(p_nombre);
        setDoc_duenio(p_doc_duenio);
        setNombre_duenio(p_nombre_duenio);
        setDireccion_duenio(p_direccion_duenio);
        setSexo(p_sexo);
        setPeso(p_peso);
        this.raza = p_raza;
    }
}
