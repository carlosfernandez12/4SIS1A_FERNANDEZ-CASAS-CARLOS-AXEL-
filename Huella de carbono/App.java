import javax.annotation.processing.SupportedOptions;
import javax.swing.JOptionPane;

import java.util.Scanner;
public class App {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); 
        int op; 
        int op2 ; 
        int op3 ; 

        Manipulacion obj = new Manipulacion();
        Formula obj2 = new Formula();
        Creditos obj3 = new Creditos();
        Sedes obj5 = new Sedes();

       try{

        do{


            try{
    
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "Lee las opciones y escoje la de tu agrado : \n 1 ---> Huella de Carbono  \n 2 ---> Sedes \n 3 ---> Creditos \n Digita tu opcion : "));
                switch(op){
                    case 1: 
                    obj2.MenuFormula();
                    break;
                    case 2 : 
                    obj.Manipulacion();
                    break;
                    case 3 :
                    obj5.Sedes2();
                    break;
                    case 4 :
                    obj3.Babosos();
                    break;
                    default:
                    JOptionPane.showMessageDialog(null,"error");
                    break;
                }
        
               }catch(Exception e ){
        
                JOptionPane.showMessageDialog(null, "bye ");
        
               }
    
    
            op3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseas regresar al menu principal \n 1 si \n 2 no \n Digita tu opcion : ")); 
    
           }while(op3 != 2); 

       }catch(Exception o ){
        JOptionPane.showMessageDialog(null, "bye ");
       }
        

        


        
    }
    
}