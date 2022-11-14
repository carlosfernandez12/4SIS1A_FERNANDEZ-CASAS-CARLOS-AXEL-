import javax.swing.JOptionPane;
public class Telas{
    public static void main(String[] args) {

        double peso ;
        double Lana = 24.80 ; 
        double Poliester = 12.70;
        double Algodon = 13.5;
        double maquina = 6.19; 
        double gasolina = 2.32;
        double trayecto ; 
        double lavadora = 0.69;
        double lavadas = 50; 
        double residuos = 3.00;
        double resultado1; 
        double resultado2; 
        double resultado3;
        double resultado4;
        double huella_de_carbono ; 
        double a,b,c,d;
        int  op,op2,op3;

        double energiaelectrica = 0.423;


        try{

            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido ala Calculadora de Huella de Carbono  \nEscoje alguna de las telas disponibles : \n 1 Poliester \n 2 Lana \n 3 Algodon \n Digita tu opcion : "));
            switch(op){

                case 1 :
                peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el peso de la prenda : (en Gramos) "));
                trayecto = Double.parseDouble(JOptionPane.showInputDialog(null, " Ingresa el trayecto que haces por al comprar la predan ( km )"));
                resultado1 = (peso*Poliester);
                resultado2 = (peso*maquina);
                resultado3 = (gasolina*trayecto); 
                resultado4 = ((lavadora*lavadas)/5);
                a = (resultado1 * energiaelectrica);
                b = (resultado2 * energiaelectrica);
                c = (resultado3 * energiaelectrica);
                d = (resultado4 * energiaelectrica);
    
               huella_de_carbono = (a+b+c+d);

               JOptionPane.showMessageDialog(null, "Se estima que la huella de carbono de la preda es : \n Peso : " + peso + "\n Material : Poliester  \n Huella de carbono : " + huella_de_carbono );



                break;
                case 2 :                   
                peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el peso de la prenda :(en gramos)"));
                trayecto = Double.parseDouble(JOptionPane.showInputDialog(null, " Ingresa el trayecto que haces por al comprar la predan ( km )"));
                resultado1 = (peso*Lana);
                resultado2 = (peso*maquina);
                resultado3 = (gasolina*trayecto); 
                resultado4 = ((lavadora*lavadas)/5);
                a = (resultado1 * energiaelectrica);
                b = (resultado2 * energiaelectrica);
                c = (resultado3 * energiaelectrica);
                d = (resultado4 * energiaelectrica);
    
               huella_de_carbono = (a+b+c+d);

               JOptionPane.showMessageDialog(null, "Se estima que la huella de carbono de la preda es : \n Peso : " + peso + "\n Material : Lana  \n Huella de carbono : " + huella_de_carbono );

                break;

                case 3 :
                
                peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el peso de la prenda : (en gramos)"));
                trayecto = Double.parseDouble(JOptionPane.showInputDialog(null, " Ingresa el trayecto que haces por al comprar la predan ( Km )"));
                resultado1 = (peso*Algodon);
                resultado2 = (peso*maquina);
                resultado3 = (gasolina*trayecto); 
                resultado4 = ((lavadora*lavadas)/5);
                a = (resultado1 * energiaelectrica);
                b = (resultado2 * energiaelectrica);
                c = (resultado3 * energiaelectrica);
                d = (resultado4 * energiaelectrica);
    
               huella_de_carbono = (a+b+c+d);

               JOptionPane.showMessageDialog(null, "Se estima que la huella de carbono de la preda es : \n Peso : " + peso + "\n Material : Algodon  \n Huella de carbono : " + huella_de_carbono );

                break;

            }

        }catch(Exception p){
            JOptionPane.showMessageDialog(null, "No me rompa");
        }
    }
}