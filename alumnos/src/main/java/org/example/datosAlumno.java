package org.example;

public class datosAlumno {
    private String nombre;
    private String color;

    private double peso;

    private double altura;

    private int edad;

    public datosAlumno(){


    }

    public void setAltura(double altura) {
        this.altura = altura;
        if (this.altura > 1.90){
            System.out.println("muy alto.");

        }
    }
    public void setColor(String color) {
        this.color = color;
    }


    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEdad(int edad) {


        if (edad<0){
            System.out.println("no esta vivo.");
        } else {
            this.edad = edad;
        }

    }
    public void setPeso(double peso) {

        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }


    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }



}
