package Ejercicio_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JLabel labelTitulo;
    private JButton buttonSuma;
    private JButton buttonResta;
    private JButton buttonMultiplicacion;
    private JButton buttonDivicion;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel labelTotal;
    private JLabel labelResult;
    public JPanel mainPanel;

    public Ventana() {
        buttonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(textField1.getText());
                Double num2 = Double.parseDouble(textField2.getText());
                labelResult.setText(String.valueOf(num1 + num2));
            }
        });
        buttonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(textField1.getText());
                Double num2 = Double.parseDouble(textField2.getText());
                labelResult.setText(String.valueOf(num1 - num2));
            }
        });
        buttonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(textField1.getText());
                Double num2 = Double.parseDouble(textField2.getText());
                labelResult.setText(String.valueOf(num1 * num2));
            }
        });
        buttonDivicion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(textField1.getText());
                Double num2 = Double.parseDouble(textField2.getText());
                labelResult.setText(String.valueOf(num1 / num2));
            }
        });
    }
}
