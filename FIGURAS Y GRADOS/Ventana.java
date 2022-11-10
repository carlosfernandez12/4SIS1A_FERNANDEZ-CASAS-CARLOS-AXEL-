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


public class Ventana extends JFrame implements ActionListener{

    private JPanel mainPanel;
    private JTextField userBox;
    private JPasswordField passBox;

   
    public Ventana() {
        this.setTitle("MENU KAWAII UwU");
        this.setSize(370, 170);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
         JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("MENU DE FIGURAS");
        
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

        
        JButton registroButton = new JButton("GRADOS");
        registroButton.setBounds(180, 80, 120, 30);
        registroButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
               Grados Newframe = new Grados();
                Newframe.setVisible(true);
            }

            
     
        });
        mainPanel.add(registroButton);

     

        JButton loginButton = new JButton("FIGURITAS");
        loginButton.setBounds(10, 80, 120, 30);
        mainPanel.add(loginButton);

        ActionListener userLoginButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ventana2 Newframe = new ventana2();
                Newframe.setVisible(true);


            }
        };

        loginButton.addActionListener(userLoginButton);
    }


    








    private void colocarEtiquetas() {

        JLabel userLabel = new JLabel("SELECCIONE UNA OPCION ");
        userLabel.setBounds(10, 10, 170, 60);
        mainPanel.add(userLabel);
        

    

    }

   
    public static void main(String[] args) {
        Ventana mainPanel = new Ventana();
        mainPanel.setVisible(true);
        
    }

}