package com.sena;

public class Algoritmo5Daniel {
    public static void main(String[] args) {
        Main obj = new Main();

        int base;
        System.out.print("Introduzca el valor de la base: ");
        base=obj.sc.nextInt();

        int h;
        System.out.print("Introduzca el valor de la altura: ");
        h=obj.sc.nextInt();

        int ltriados;
        System.out.print("Introduzca el valor del lado 2 del triangulo: ");
        ltriados=obj.sc.nextInt();

        int ltriatres;
        System.out.print("Introduzca el valor del lado 3 del triangulo: ");
        ltriatres=obj.sc.nextInt();

        double area=base*h/2;
        int per=base+ltriados+ltriatres;
        System.out.print("El valor del Area del triangulo es: "+area);
        System.out.print(" Y el valor del perimetro es: "+per);
    }
}
