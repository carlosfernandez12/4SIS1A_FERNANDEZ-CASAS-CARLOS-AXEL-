
import javax.swing.*;



public class Ventana2 extends JFrame{
    public  JPanel panel;
    public Ventana2(){
    
        this.setSize(800,500);
        setTitle("REGISRTO");
        setLocation(500,250); //localisacion de tu pantalla
        setLocationRelativeTo(null);//centro de pantalla pra todo tipo de tamaño de compu
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("REGISRTO ");
       
        iniciarComponentes();
         panel.add(etiqueta1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
            
        
    }

    
    private void iniciarComponentes(){

        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        

    
    }
    
    private void colocarPaneles(){
        
     panel = new JPanel();
    
    
    panel.setLayout(null);
    this.getContentPane().add(panel);
        
    
  
    }
    
    private void colocarEtiquetas(){
          JLabel etiqueta = new JLabel();
    etiqueta.setText("NOMBRE:");
    etiqueta.setBounds(10,30,60,20);
    etiqueta.setOpaque(true);
    
    
            //campo de texto
        JTextField usertext = new JTextField(20);
        usertext.setBounds(80, 30, 130, 20);
        panel.add(usertext);
    panel.add(etiqueta);
            
    JLabel etiqueta2 = new JLabel();
    etiqueta2.setText("APELLIDO PATERNO:");
    etiqueta2.setBounds(10,60,120,20);
    etiqueta2.setOpaque(true);
    
    
         //campo de texto
        JTextField text = new JTextField(20);
        text.setBounds(140, 60, 130, 20);
        panel.add(text);
    panel.add(etiqueta2);
    
       JLabel etiqueta3 = new JLabel();
    etiqueta3.setText("APELLIDO MATERNO:");
    etiqueta3.setBounds(10,90,120,20);
    etiqueta3.setOpaque(true);
   
    
      //campo de texto
        JTextField texto = new JTextField(20);
        texto.setBounds(140, 90, 130, 20);
        panel.add(texto);
    
    panel.add(etiqueta3);
    
       JLabel etiqueta4 = new JLabel();
    etiqueta4.setText("FECHA DE NACIMIENTO:");
    etiqueta4.setBounds(10,120,150,20);
    etiqueta4.setOpaque(true);
   
    
      //campo de texto
        JTextField texto2 = new JTextField(20);
        texto2.setBounds(170, 120, 130, 20);
        panel.add(texto2);
    
    panel.add(etiqueta4);
    
       JLabel etiqueta5 = new JLabel();
    etiqueta5.setText("USUARIO:");
    etiqueta5.setBounds(10,150,70,20);
    etiqueta5.setOpaque(true);
    
    
      //campo de texto
        JTextField texto3 = new JTextField(20);
        texto3.setBounds(90, 150, 130, 20);
        panel.add(texto3);
    
    panel.add(etiqueta5);
    
       JLabel etiqueta6 = new JLabel();
    etiqueta6.setText("CONTRASEÑA:");
    etiqueta6.setBounds(10,180,100,20);
    etiqueta6.setOpaque(true);
    
    
      //campo de texto
        JTextField texto4 = new JTextField(20);
        texto4.setBounds(120, 180, 130, 20);
        panel.add(texto4);
    
    panel.add(etiqueta6);
    }
    
    private void colocarBotones(){
        JButton boton1 = new JButton("ENVIAR");
        boton1.setBounds(450,380,120,30);
        boton1.setEnabled(true);
        panel.add(boton1);
        
        
    }


    
}
