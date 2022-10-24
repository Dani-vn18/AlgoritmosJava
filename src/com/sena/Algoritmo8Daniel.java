package com.sena;

import javax.swing.*;

public class Algoritmo8Daniel {
    public static void main(String[] args) {

        double a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de A : "));
        double b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de B : "));
        double c=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de C : "));
        double resultado=(Math.pow(a,2)+Math.pow(b,2))/(2*a*c);
        double rfinal=Math.sqrt(resultado);

        JOptionPane.showMessageDialog(null,"El resultado es: "+rfinal);

    }
}
