package com.sena;

public class Algoritmo6Daniel {
    public static void main(String[] args) {
        Main obj = new Main();

        double pi=3.1416;

        double ra;
        System.out.print("Introduzca el valor del radio: ");
        ra=obj.sc.nextInt();

        double area=pi*Math.pow(ra,2);
        double cir=pi*ra*2;
        System.out.print("El valor del Area del circulo es: "+area);
        System.out.print(" Y el valor de la circunferencia es: "+cir);
    }
}
