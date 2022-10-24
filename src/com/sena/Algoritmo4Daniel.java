package com.sena;


import javax.swing.*;

public class Algoritmo4Daniel {

    public static void main(String[] args) {
     Main obj = new Main();

     double pi=3.1416;

        int h;
        System.out.print("Introduzca el valor de la altura: ");
        h=obj.sc.nextInt();

        int ra;
        System.out.print("Introduzca el valor del radio: ");
        ra=obj.sc.nextInt();

        double vol=pi*h*Math.pow(ra,2)/3;
        System.out.print("El Volumen del cono es: "+vol);
    }
}
