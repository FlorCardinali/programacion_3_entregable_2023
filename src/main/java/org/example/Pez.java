package org.example;

public class Pez extends Animal{
    String tipo_de_agua;
    public Pez(int p_edad,char p_sexo ,String p_nombre,String p_nombre_duenio, int p_doc_duenio, String p_direccion_duenio, int p_peso, String p_agua) {
        this.setEdad(p_edad);
        this.setTipo("Pez");
        this.setNombre(p_nombre);
        this.setDoc_duenio(p_doc_duenio);
        this.setNombre_duenio(p_nombre_duenio);
        this.setDireccion_duenio(p_direccion_duenio);
        this.setSexo(p_sexo);
        this.setPeso(p_peso);
        this.tipo_de_agua = p_agua;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de agua: "+ this.tipo_de_agua);
    }

    public String getTipo_de_agua() {
        return tipo_de_agua;
    }

    public void setTipo_de_agua(String tipo_de_agua) {
        this.tipo_de_agua = tipo_de_agua;
    }

}
