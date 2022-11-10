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

    //Constructor de la ventana del login.
    public Ventana() {
        this.setTitle("Hola Mudo");
        this.setSize(370, 170);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
         JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("Hola Mundo");
        
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

        //Boton de salir
        JButton registroButton = new JButton("Registrarse");
        registroButton.setBounds(180, 80, 120, 30);
        registroButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
                Ventana2 newFrame = new Ventana2();
                 newFrame.setVisible(true);
            }

            
     
        });
        mainPanel.add(registroButton);

     

        JButton loginButton = new JButton("iniciar Sesion");
        loginButton.setBounds(10, 80, 120, 25);
        mainPanel.add(loginButton);

        ActionListener userLoginButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String usuarioUser = "AxelFernandez";
                String usuarioPass = "12345";

                if (usuarioUser.equals(userBox.getText())) {
                    String contrasena = "";

                    for (int i = 0; i < passBox.getPassword().length; i++) {
                        contrasena += passBox.getPassword()[i];
                    }

                    if (usuarioPass.equals(contrasena)) {
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
       
        userBox.setBounds(160, 20, 160, 25);
        mainPanel.add(userBox);

        JLabel userPass = new JLabel("Contraseña");
        userPass.setBounds(10, 40, 80, 50);
        mainPanel.add(userPass);
        passBox.setBounds(160, 50, 160, 25);
        mainPanel.add(passBox);

    }

   
    public static void main(String[] args) {
        Ventana mainPanel = new Ventana();
        mainPanel.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
