package org.example;

import java.time.LocalDate;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA DE FECHAS.");

        Fecha objetoFecha = new Fecha();

        System.out.println("Ingrese dia: ");
        objetoFecha.setDia(lectura.next());
        System.out.println("Ingrese mes: ");
        objetoFecha.setMes(lectura.next());
        System.out.println("Ingrese año: ");
        objetoFecha.setAno(lectura.next());

        objetoFecha.validarFecha();

    objetoFecha.impresionFecha();






    }
}