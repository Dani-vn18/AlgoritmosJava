package com.sena;

import javax.swing.*;

public class Algoritmo3Daniel {


    public static void main(String[] args) {

        double pi=3.1416;
        double h=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura: "));
        double ra=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));
        double vol=pi*h*Math.pow(ra,2)/3;

        JOptionPane.showMessageDialog(null,"El Volumen del cono es: "+vol);


    }
}
