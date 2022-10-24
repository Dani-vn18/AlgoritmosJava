package com.sena;

import javax.swing.*;

public class Algoritmo7Daniel {
    public static void main(String[] args) {

        double n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del primer número: "));
        double n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del segundo número: "));
        double n3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del tercer número: "));
        double resultado=(n1+n2)-n3;

        JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);


    }
}
