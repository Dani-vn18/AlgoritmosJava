package com.sena;

import java.util.Scanner;


import javax.swing.*;


public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        //Comentario

        int x=10;
        int y=5;
        int z=8;
        int resultado=x*y*z;

        System.out.println("El resultado es:" + resultado);
        System.out.println("Fin del programa");

        JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);

    }
}
