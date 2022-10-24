package com.sena;

import javax.swing.*;

public class Algoritmo9Daniel {
    public static void main(String[] args) {

        double n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número: "));
        double n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        double n3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número: "));
        double resul1=n1+n2+n3;
        double resul2=n1-n2-n3;
        if(n1>100){
            JOptionPane.showMessageDialog(null,"El resultado es: "+resul1);
        }
        else{
            JOptionPane.showMessageDialog(null,"El resultado es: "+resul2);
        }

    }
}
