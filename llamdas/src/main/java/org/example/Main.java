package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        FechaLlamada objetoFecha = new FechaLlamada();


        System.out.println("PROGRAMA DE COBRO DE LLAMADA.");
        System.out.println("Ingrese la fecha e inicio de la llamada: ");
        objetoFecha.setFechaInicio(lectura.next());
        System.out.println("Ingrese la fecha de fin de la llamda: ");
        objetoFecha.setFechaFinal(lectura.next());

        System.out.println("Ingrese el costo por minuto de la llamada: ");
        objetoFecha.setPrecioXMinuto(lectura.nextDouble());


        objetoFecha.calculoDeMinutos();
        objetoFecha.costoLlamada();







    }
}