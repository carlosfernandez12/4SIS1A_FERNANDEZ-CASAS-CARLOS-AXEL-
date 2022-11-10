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


public class ventana2 extends JFrame implements ActionListener{

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

    //Constructor de la ventana del login.
    public ventana2() {
        this.setTitle("figuritas");
        this.setSize(370, 170);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
         JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("figuritas");
        
         setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();

    }

    //Metodo para inicializar
    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
        colocarEtiquetas();
        
       

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
        userBox = new JTextField();

        
        JButton registroButton = new JButton("circulo");
        registroButton.setBounds(180, 80, 120, 30);
        registroButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
                Circulo newFrame = new Circulo();
                newFrame.setVisible(true);
            }

            
     
        });
        mainPanel.add(registroButton);


        JButton loginButton = new JButton("Cuadrado");
        loginButton.setBounds(10, 80, 120, 25);
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


        
        JLabel userLabel = new JLabel("Escoje  tu figurita a calcular"); 
        userLabel.setBounds(100, 10, 210, 50);
        mainPanel.add(userLabel);
    }

   
    public static void main(String[] args) {
        Ventana mainPanel = new Ventana();
        mainPanel.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}