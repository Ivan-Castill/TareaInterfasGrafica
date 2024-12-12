package Ejercicio_1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        JFrame frame = new JFrame(" Calculadora Chida ");
        frame.setContentPane(new Ventana().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setPreferredSize(new Dimension(400,500));
        frame.pack();
        frame.setVisible(true);
    }
}