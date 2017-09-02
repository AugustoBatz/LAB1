
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author AUGUSTO-BTZ
 *
 */
import java.io.*;
import java.util.Scanner;
class Anyio{
    private int mes=9,dia=19;

    void igual(int min,int di)
    {
        if(mes==min&&dia==di)
        {
            System.out.println("La fecha es la misma que la de mi cumpleaños");
        }
        else
        {
            System.out.println("Las fechas de nuestros cumpleaños es distinto");
        }
       }
    void visualizar()
    {
        System.out.println("1.Enero");
        System.out.println("2.Febrero");
        System.out.println("3.Marzo");
        System.out.println("4.Abril");
        System.out.println("5.Mayo");
        System.out.println("6.Junio");
        System.out.println("7.Julio");
        System.out.println("8.Agosto");
        System.out.println("9.Septiembre");
        System.out.println("10.Octubre");
        System.out.println("11.Noviembre");
        System.out.println("12.Diciembre");


    }
  }


public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Anyio cumple=new Anyio();
        Scanner leer = new Scanner (System.in);
        cumple.visualizar();
        int ms,ds;
        System.out.println("Ingrese el numero de su mes de cumpleaños");
        ms=leer.nextInt();
        System.out.println("Ingrese el dia de su cumpleaños");
        ds=leer.nextInt();
        cumple.igual(ms, ds);

        // TODO code application logic here
    }

}
