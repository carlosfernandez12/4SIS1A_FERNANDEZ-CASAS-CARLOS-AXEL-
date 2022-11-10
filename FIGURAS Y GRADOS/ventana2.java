package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ventana2 extends JFrame implements ActionListener {

    private final class ActionListenerImplementation2 implements ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {

        }
    }

    private final class ActionListenerImplementation implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private JPanel mainPanel;
    private JTextField userBox;
    private JPasswordField passBox;

    public ventana2() {
        this.setTitle("FIGURAS GEOMETRICAS");
        this.setSize(370, 170);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("FIGURAS GEOMETRICAS");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        iniciarComponentes();

    }

    
    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
        colocarEtiquetas();

    }

    private void colocarPaneles() {
        
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        this.getContentPane().add(mainPanel); 

    }

    private void colocarBotones() {

        userBox = new JTextField();
        passBox = new JPasswordField();
        userBox = new JTextField();

        JButton registroButton = new JButton("CIRCULO");
        registroButton.setBounds(180, 40, 120, 30);
        registroButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Circulo Newframe = new Circulo();
                Newframe.setVisible(true);
            }

        });
        mainPanel.add(registroButton);

        

        JButton trianButton = new JButton("TRIANGULO");
        trianButton.setBounds(180, 80, 120, 30);
        trianButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Triangulo newFrame = new Triangulo();
                newFrame.setVisible(true);
            }

        });
        mainPanel.add(trianButton);

        

        JButton rectanButton = new JButton("RECTANGULO");
        rectanButton.setBounds(30, 80, 120, 30);
        rectanButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Rectangulo newFrame = new Rectangulo();
                newFrame.setVisible(true);
            }

        });
        mainPanel.add(rectanButton);

        

        JButton loginButton = new JButton("CUADRADO");
        loginButton.setBounds(30, 40, 120, 25);
        mainPanel.add(loginButton);

        ActionListener userLoginButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cuadrado newFrame = new Cuadrado();
                newFrame.setVisible(true);

            }
        };
        loginButton.addActionListener(userLoginButton);
    }

    private void colocarEtiquetas() {

        JLabel userLabel = new JLabel("ELIGE UNA FIGURA");
        userLabel.setBounds(100, 0, 210, 50);
        mainPanel.add(userLabel);
    }

    public static void main(String[] args) {
        ventana mainPanel = new ventana();
        mainPanel.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        

    }

}