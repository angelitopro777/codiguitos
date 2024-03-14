package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        datosAlumno objetoAlumno = new datosAlumno();


        System.out.println("PROGRAMA DE ALUMNOS");
        System.out.println("INGRESE DATOS DEL ALUMNO:");

        System.out.println("Ingrese nombre del alumno:");
        objetoAlumno.setNombre(lectura.next());

        System.out.println("Ingrese edad:");
        objetoAlumno.setEdad(lectura.nextInt());

        System.out.println("Ingrese color del alumno: ");
        System.out.println("* Blanco ");
        System.out.println("* Moreno ");
        System.out.println("* Negro ");
        objetoAlumno.setColor(lectura.next());

        System.out.println("Ingrese altura:");
        objetoAlumno.setAltura(lectura.nextDouble());

        System.out.println("Ingrese peso: ");
        objetoAlumno.setPeso(lectura.nextDouble());

    }
}