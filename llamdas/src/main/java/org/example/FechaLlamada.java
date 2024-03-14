package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaLlamada {

    private String fechaInicio;
    private String fechaFinal;

    private long minutosLlamada;
    private double precioXMinuto;
    private double totalDeLlamada;


    public void Fecha() {
    }


    public void costoLlamada (){
        totalDeLlamada =  * precioXMinuto;
        System.out.println("El costo de llamada es de: " + totalDeLlamada);


    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;

    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void setPrecioXMinuto(double precioXMinuto) {
        this.precioXMinuto = precioXMinuto;
    }

    public void calculoDeMinutos (){

        try{

            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date fechaInicio = formatoFecha.parse(this.fechaInicio);
            Date fechaFinal = formatoFecha.parse(this.fechaFinal);
            long minutosLlamada = fechaFinal.getTime() - fechaInicio.getTime();
            long totalMinutos = ((1/1000) / 60);
            this.minutosLlamada = totalMinutos;

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }



}
