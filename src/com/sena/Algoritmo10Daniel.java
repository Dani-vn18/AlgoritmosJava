package com.sena;

import javax.swing.*;

public class Algoritmo10Daniel {
    public static void main(String[] args) {

        double n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número: "));
        double n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        double form1=(Math.pow(n1,2)+Math.pow(n2,2));

        if(n1+n2>100){
            JOptionPane.showMessageDialog(null,"El resultado es: "+form1);
        }
        else{
            JOptionPane.showMessageDialog(null,"El resultado es 0 ");
        }

    }
}
