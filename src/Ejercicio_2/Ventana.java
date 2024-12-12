package Ejercicio_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JLabel labelTitulo;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton buttonlogin;
    private JLabel labelUsuario;
    private JLabel labelPassword;
    public JPanel mainPanel;

    public Ventana() {
        buttonlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioCorrecto = "apellido";
                String passwordCorrecto = "apellido123";

                // Obtiene los datos ingresados por el usuario
                String usuarioIngresado = textField1.getText();
                String passwordIngresado = new String(passwordField1.getPassword());

                // Validación de las credenciales
                if (usuarioIngresado.equals(usuarioCorrecto) && passwordIngresado.equals(passwordCorrecto)) {
                    JOptionPane.showMessageDialog(null, "BIENVENIDO\n"+usuarioCorrecto+"\n Inicio de sesión exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
