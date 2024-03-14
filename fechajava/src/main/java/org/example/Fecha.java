package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class Fecha {
    private String dia;
    private String mes;
    private String ano;
    private LocalDate fechaUno;
    private String fechaDos;




    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }



    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }




    public void creaFechaUno (){
        String fecha = this.dia + "/" + this.mes + "/" + this.ano;
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaUno = LocalDate.parse(fecha, formatoFecha);
    }

    public void creaFechaDos (){
        this.fechaDos = fechaUno.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public LocalDate getFechaUno() {
        return this.fechaUno;
    }

    public String getFechaDos(){
        return this.fechaDos;
    }
    public void impresionFecha(){
        System.out.println("Fecha ingresada " + fechaUno);
        System.out.println("fecha formateada: " + fechaDos);
    }

    public void validarFecha (){

        int numeroDia = Integer.parseInt(dia);
        int numeroMes = Integer.parseInt(mes);
        int numeroAno = Integer.parseInt(ano);


        if (numeroDia > 1 && numeroDia < 31){
            if (numeroMes > 1 && numeroMes < 12){
                if (numeroAno == 2024){
                    return;
                } else {
                    System.out.println("año invalido");
                }
            }  else {
                System.out.println("mes invalido");
            }
        }  else {
            System.out.println("dia invalido.");
        }
    }

}


