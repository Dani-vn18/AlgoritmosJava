package com.sena;

import javax.swing.*;

public class Algoritmo11Daniel {
    public static void main(String[] args) {

        double n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número: "));
        if(n1>=1000 && n1<=10000){
        }
        else{
            JOptionPane.showMessageDialog(null,"El número no es permitido");
        }
    }
}
