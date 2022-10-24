package com.sena;

import javax.swing.*;

public class Algoritmo12Daniel {
    public static void main(String[] args) {

        double n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número: "));
        if((n1>=0 && n1<=10)||(n1>=90 && n1<=100)){
        }
        else{
            JOptionPane.showMessageDialog(null,"El número no es permitido");
        }
    }
}