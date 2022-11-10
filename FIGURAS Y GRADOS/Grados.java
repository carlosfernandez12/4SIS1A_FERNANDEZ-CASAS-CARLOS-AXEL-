package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class Grados extends JFrame{
 
    private JLabel eDe,eA,cant,salida;
    private JTextField cantidad;
    private JComboBox de,a;
    private JButton convertir, salir;
    private String DE="", A="";
 
    public Grados(){
        super("Conversor de temperatura.");
 
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
 
        eDe = new JLabel("De:     ");
        eA = new JLabel("       A:");
        JPanel panel1 = new JPanel();
        panel1.add(eDe);
        panel1.add(eA);
        contenedor.add(panel1);
        //Combo Boxes
        de = new JComboBox();
        de.addItem("Centigrados");
        de.addItem("Fahrenheit");
        de.addItem("Kelvin");
        de.setMaximumRowCount(3);
        
        a = new JComboBox();
        a.addItem("Centigrados");
        a.addItem("Fahrenheit");
        a.addItem("Kelvin");
        a.setMaximumRowCount(3);
        
        JPanel panel2 = new JPanel();
        panel2.add(de);
        panel2.add(a);
        contenedor.add(panel2);
        //Etiqueta y Campo de texto para ingresar la cantidad
        cant = new JLabel("Cantidad:");
        cantidad = new JTextField(10);
        JPanel panel3 = new JPanel();
        panel3.add(cant);
        panel3.add(cantidad);
        contenedor.add(panel3);
        //Botones
        convertir = new JButton("Convertir");
        convertir.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String DE = de.getSelectedItem().toString();
                    String A = a.getSelectedItem().toString();
                    convertir(Integer.parseInt(cantidad.getText()), DE, A);
                }
            }
        );
        salir = new JButton("Salir");
        salir.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            }
        );
        JPanel panel4 = new JPanel();
        panel4.add(convertir);
        panel4.add(salir);
        contenedor.add(panel4);
       
        salida = new JLabel("");
        JPanel panel5 = new JPanel();
        panel5.add(salida);
        contenedor.add(panel5);
 
        setSize(250,250);
        setVisible(true);
        setResizable(false);
    }
 
    public void convertir(int canti, String de, String a){
        int numero = canti;
        String desde = de;
        String hacia = a;
        double resultado = 0;
        
        
        if(desde.equals("Centigrados") && hacia.equals("Centigrados")){
            resultado = numero;
            salida.setText("Resultado: " + resultado + " centigrados");
            
        }
        
        if(desde.equals("Centigrados") && hacia.equals("Fahrenheit")){
            resultado = 9*(numero/5)+32;
            salida.setText("Resultado: " + resultado);
            
        }
       
        if(desde.equals("Centigrados") && hacia.equals("Kelvin")){
            resultado = (numero + 273.15);
            salida.setText("Resultado: " + resultado);
            
        }
       
        if(desde.equals("Fahrenheit") && hacia.equals("Centigrados")){
            resultado = (5/9)*(numero-32);
            salida.setText("Resultado: " + resultado);
            
        }
       
        if(desde.equals("Fahrenheit") && hacia.equals("Fahrenheit")){
            resultado = numero;
            salida.setText("Resultado: " + resultado);
           
        }
        
        if(desde.equals("Fahrenheit") && hacia.equals("Kelvin")){
            resultado = (numero+459.67)/(9/5);
            salida.setText("Resultado: " + resultado);
            
        }
        
        if(desde.equals("Kelvin") && hacia.equals("Centigrados")){
            resultado = (numero - 273.15);
            salida.setText("Resultado: " + resultado);
            
        }
        
        if(desde.equals("Kelvin") && hacia.equals("Fahrenheit")){
            resultado = (numero-273)*(9/5)+32;
            salida.setText("Resultado: " + resultado);
            
        }
        
        if(desde.equals("Kelvin") && hacia.equals("Kelvin")){
            resultado = numero;
            salida.setText("Resultado: " + resultado);
           
        }
    }
 
    public static void main(String[] args) {
        Grados conversor = new Grados();
        conversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}