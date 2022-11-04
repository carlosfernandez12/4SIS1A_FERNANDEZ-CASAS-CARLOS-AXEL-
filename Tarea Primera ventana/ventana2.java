//Fernandez casas carlos axel 
//Tare de primera ventana

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana2 extends JFrame {

    private JPanel mainPanel;
    private JTextField userBox;
    private JPasswordField passBox;

    public ventana2() {
        this.setTitle("Java Ticket System");
        this.setSize(370, 170);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        iniciarComponentes();

    }

    //Metodo para inicializar
    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
        colocarEtiquetas();
        colocarCajasTexto();
       

    }

    private void colocarPaneles() {
        //Panel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        this.getContentPane().add(mainPanel); // Agregamos el panel

    }

    private void colocarBotones() {

        userBox = new JTextField();
        passBox = new JPasswordField();

        //Boton de salir
        JButton exitButton = new JButton("Registrarse");
        exitButton.setBounds(180, 80, 120, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mainPanel.add(exitButton);

        //Boton de login (en este tengo el problema)

        JButton loginButton = new JButton("iniciar Sesion");
        loginButton.setBounds(10, 80, 120, 25);
        mainPanel.add(loginButton);

        ActionListener userLoginButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String adminUser = "Axel";
                String adminPass = "Fernandez";

                if (adminUser.equals(userBox.getText())) {
                    String contrasena = "";

                    for (int i = 0; i < passBox.getPassword().length; i++) {
                        contrasena += passBox.getPassword()[i];
                    }

                    if (adminPass.equals(contrasena)) {
                        JOptionPane.showMessageDialog(null, "Bienvenido");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, contraseña incorrecta");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario inexistente");
                }


            }
        };

        loginButton.addActionListener(userLoginButton);
    }

    private void colocarEtiquetas() {

        


        //Etiqueta de usuario y contraseña
        JLabel userLabel = new JLabel("Usuario");
        userLabel.setBounds(10, 10, 120, 50);
        mainPanel.add(userLabel);

        JLabel userPass = new JLabel("Contraseña");
        userPass.setBounds(10, 40, 80, 50);
        mainPanel.add(userPass);

    }

    private void colocarCajasTexto() {
        //Cajas de Texto
        JTextField userBox = new JTextField();
        userBox.setBounds(160, 20, 160, 25);
        mainPanel.add(userBox);

        JTextField passBox = new JPasswordField();
        passBox.setBounds(160, 50, 160, 25);
        mainPanel.add(passBox);

    }
    public static void main(String[] args) {
        ventana2 mainPanel = new ventana2();
        mainPanel.setVisible(true);

    }
}
