// ESTRUCTURA DE DATOS MENU DE PROGRAMS 
// ALUMNO: Fernandez Casas Carlos Axel 
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Menu{
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        float a2,b2,c2,d2,e2,f2;
        int edad;
        int op;
        int op2;
        int op3; 
        int op4;
        int op5;
        int op6;
        int op7;  
        int op8; 
        int op9;  
        int op10; 
        int op11; 
        int op12; 
        int op13; 
        int op14; 
        int op15; 
        int op16;
        int suma;
        int resta; 
        int multi; 
        int div; 
        int lado;
        int num1;
        int num2; 
        String nombre; 
        double c; 
        double f; 
        double k; 
        double r3;
        double pi = 3.1416; 
        int area;
        int perimetro;
        double volumen; 
        int lado_a;
        int lado_b; 
        int lado_c;  
        int b;
        int h; 
        int numero;
        int factorial;
        double r; 
        double r2;
        double h2;  
        char letra;
        factorial = 1;
        do{
            System.out.println("\n\n\t\t MENU PRINCIPAL ");
            System.out.println("\n\nSeleccione una opcion :");
            System.out.println(" 1 Descuento por edad ");
            System.out.println(" 2 Converciones de temperatura ");
            System.out.println(" 3 Area ");
            System.out.println(" 4 Calculadora JOption");
            System.out.println(" 5 Figura Hueca "); 
            System.out.println(" 6 factorial ");
            System.out.println(" 7 Diamante");
            System.out.println(" 8 Patron Sorpresa");
            System.out.println(" 9 cuadrado por creado por usuario ");
            System.out.println("10 Numeros negativos y positivos  ");
            op = entrada.nextInt();
            switch(op){
                case 1 :// primer progama 
                System.out.println("\n\n\t\t descuento por edad " ); 
                System.out.println("\n\nponga su edad : "); 
                edad = entrada.nextInt(); 
            
                if (edad>65){
                
                System.out.println( "\nEdad : " + edad);
                System.out.println(" Su descuento es del %40 ");  
            }
                if(edad<21){
                System.out.println("\nEdad : " + edad); 
                System.out.println("Tus padres son socios ?"); 
                System.out.println("1 si"); 
                System.out.println("2 no");
                System.out.println("seleccione una opcion : "); 
                op3 = entrada.nextInt(); 
                switch(op3){
                    case 1 :
                    System.out.print("El descuento es de : %45");  
                    break; 
                    case 2:
                    System.out.println("El descuento es de : %25");  
                    break; 
                    default :
                    System.out.println("Opcion Invalida ");  
                    break; 
                }
            }
                break;// aqui termina el primer programa 
                case 2 :
                System.out.println("\n\n\t\tCONVERCIONES DE TEMPERATURA "); 
                System.out.println("\n\nseleccione una opcion que quiera :");
                System.out.println("1 Celsius"); 
                System.out.println("2 Fahrenheit");
                System.out.println("3 Kelvin"); 
                System.out.println("4 Rankin"); 
                op4 = entrada.nextInt(); 
                switch(op4){
                   case 1:
                    System.out.println("\n\n\t\t CELSIUS"); 
                    System.out.println("\n\nseleccione una opcion  : "); 
            System.out.println(" 1 Celsius a Fahrenit"); 
            System.out.println(" 2 Celsius a Kelvin"); 
            System.out.println(" 3 Celsius a Rankin"); 
            System.out.println(" pon tu opcion  : ");
            op5 = entrada.nextInt(); 
            switch(op5){
                case 1 :
                System.out.println("\n\n\t\t CELSIUS A FAHRENHEIT"); 
                System.out.println("\n\nIngresa los grados Celsius : "); 
                c = entrada.nextDouble(); 
                f = (1.8 * c) + 32;
                System.out.println("Los grados celsius son  " + c + " a Farenheit son " + f);  
                break; 
                case 2:
                System.out.println("\n\n\t\t CELSIUS A KELVIN"); 
                System.out.println("\n\nIngresa los grados en Celsius : "); 
                c = entrada.nextDouble(); 
                k = c + 273.15; 
                System.out.println("Los grados Celsius son " + c + "a Kelvin son : " + k); 
                break; 
                case 3:
                System.out.println("\n\n\t\t CELSIUS A RANKIN"); 
                System.out.println("\n\nIngresa los grados en Celsius : "); 
                c = entrada.nextDouble(); 
                r3 = (1.8 * c)+ 491.67;  
                System.out.println("Los grados Celsius son " + c +" a Rankin son : " +r3);  // hdptsm
                break; 
                default:
                System.out.println("error");
                break; 
            } 
            break;

            case 2 : 
            System.out.println("\n\n\t\t FAHRENHEIT"); 
            System.out.println("\n\nseleccione una opcion que quiera: "); 
            System.out.println(" 1 Fahrenheit a Celsius"); 
            System.out.println(" 2 Fahrenheit a Kelvin "); 
            System.out.println(" 3 Fahrenheir a Rankin"); 
            System.out.println(" ponga su opcion  : "); 
            op6 = entrada.nextInt(); 
            switch(op6){
                case 1 :
                System.out.println("\n\n\t\t FAHRENHEINT A CELSIUS"); 
                System.out.println("\n\nIngresa los grados en Fahrenheit : "); 
                f = entrada.nextDouble();
                c = (f-32)/1.8;
                System.out.println("Los grados Fahrenheit son " + f + " a Celsius es : "+ c );   
                break; 
                case 2 :
                System.out.println("\n\n\t\t FAHRENHEIT A KELVIN ");
                System.out.println("\n\nIngresa los grados en Fahrenheit : ");
                f = entrada.nextDouble(); 
                k = (((f - 32)/1.8)+273.15); 
                System.out.println("Los grados Fahrentheit son  " +f+ " a Kelvin son : " +k); 
                break;
                case 3:
                System.out.println("\n\n\t\t FAHRENHEIT A RANKIN"); 
                System.out.println("\n\nIngresa los grados en Fahrenheint : "); 
                f = entrada.nextDouble(); 
                r = (f + 459.67);
                System.out.println("Los grados Fahrenheit son "+f+" a Rankin son : "+r);   
                break;  
                default:
                System.out.println("opcion erronea"); 
                break; 
            }
            break; 
            case 3: 
            System.out.println("\n\n\t\t KELVIN"); 
            System.out.println("\n\nseleccione una opcion que quiera : "); 
            System.out.println(" 1 Kelvin a Celsius "); 
            System.out.println(" 2 Kelvin a Fahrenheit "); 
            System.out.println(" 3 Kelvin a Rankin"); 
            System.out.println(" ponga su opcion "); 
            op7 = entrada.nextInt(); 
            switch(op7){
                case 1:
                System.out.println("\n\n\t\t KELVIN A CELSIUS"); 
                System.out.println("\n\nIngresa los grados en Kelvin :"); 
                k = entrada.nextDouble(); 
                c = k-273.15; 
                System.out.println("Los grados kelvin son : "+ k+ " a Celsius : "+ c);  
                break; 
                case 2:
                System.out.println("\n\n\t\t KELVIN A FAHRENHEIT"); 
                System.out.println("\n\nIngresa los datos en Kelvin : "); 
                k = entrada.nextDouble();  
                f = (((k-273.15)*1.8)+32); 
                System.out.println("Los grados Kelvin son : " + k + " a Fahrenhein son : " +f); 
                break; 
                case 3:
                System.out.println("\n\n\t\tKELVIN A RANKIN");
                System.out.println("\n\nIngresa los datos en kelvin : "); 
                k = entrada.nextDouble(); 
                r = 3*k; 
                System.out.println("Los grados Kelvin son  " + k + " a Rankin son : " + r );   
                break; 
                default:
                System.out.println("Opcion erronea ");  
                break;
            }
            break; 
            case 4 :
            System.out.println("\n\n\t\t RANKIN"); 
            System.out.println("\n\nseleccione una opcion que quiera : "); 
            System.out.println("1 Rankin a Celsius "); 
            System.out.println("2 Rankin a Fahrenhein"); 
            System.out.println("3 Rankin a kelvin "); 
            op8 = entrada.nextInt(); 
            switch(op8){
                case 1 :
                System.out.println("\n\n\t\tRANKIN A CELCIUS"); 
                System.out.println("\n\nIngresa los datos en Rankin : "); 
                r = entrada.nextDouble(); 
                c = 0.55*( r - 491.67); 
                System.out.println("Los grados en Rankin son  : "+ r + " a Celcius son : "+c);  
                break; 
                case 2 :
                System.out.println("\n\n\t\tRANKIN A FAHRNHEIN"); 
                System.out.println("\n\nIngresa los datos en Rankin : "); 
                r = entrada.nextDouble(); 
                f = r - 459.67; 
                System.out.println("Los datos en Rankin son " + r + "a Fahrenhein son : "+ r ); 
                break; 
                case 3 :
                System.out.println("\n\n\t\tRANKIN A KELVIN"); 
                System.out.println("\n\nIngresa los datos en Rankin : "); 
                r = entrada.nextDouble(); 
                k = 0.55*r; 
                System.out.println("Los datos Rankin son : " + r + " a kelvin son " +k);  
                break; 
                default:
                System.out.println("error");  
                break; 
            }
            break; 
            default: 
            System.out.println("error "); 
            break;
           

        }

                break;// aqui termina el segundo programa 
                case 3 :// aqui empieza el tercer programa
                System.out.println("\n\n\t\t MENU PRINCIPAL "); 
                System.out.println("\n\nsleccione una opcion que quiera : "); 
                System.out.println(" 1 rectangulo"); 
                System.out.println(" 2 Triangulo "); 
                System.out.println(" 3 Esfera"); 
                System.out.println(" 4 Cilindro"); 
                System.out.println("ponga su opcion : "); 
                op9 = entrada.nextInt(); 
                switch(op9){
                    case 1:
                    System.out.println("\n\n\t\t RECTANGULO"); 
                    System.out.println("\n\n selecciona una de las 2 opciones : "); 
                    System.out.println("1 area"); 
                    System.out.println("2 perimetro"); 
                    System.out.println("ingresa tu opcion  : "); 
                    op10 = entrada.nextInt(); 
                    switch(op10){
                        case 1 :
                        System.out.println("\n\n\t\t AREA DE UN RECTANGULO"); 
                        System.out.println("\n\n Ingresar la altura"); 
                        h = entrada.nextInt(); 
                        System.out.println("Ingresar la base : ");
                        b = entrada.nextInt(); 
                        area = b * h; 
                        System.out.println("El area del rectangulo es : " + area);   
                        break; 
                        case 2:
                        System.out.println("\n\n\t\t PERIMETRO DE UN RECTANGULO"); 
                        System.out.println("\n\n Ingresar la altura : "); 
                        h = entrada.nextInt(); 
                        System.out.println("Ingresar la base : "); 
                        b = entrada.nextInt(); 
                        perimetro = 2 * (b+h); 
                        System.out.println("El perimetro de el rectangulo es : " + perimetro); 
                        break;
                        default:
                        System.out.println("opcion erronea"); 
                        break;  
                    } // aqui nos quedamos 
                    break; 
                    case 2: 
                    System.out.println("\n\n\t\t TRIANGULO"); 
                    System.out.println("\n\n seleccione una de las 2 opciones  : "); 
                    System.out.println("1 area "); 
                    System.out.println("2 perimetro"); 
                    System.out.println("ingresa tu opcion "); 
                    op11 = entrada.nextInt(); 
                    switch(op11){
                        case 1:
                        System.out.println("\n\n\t\t AREA DE UN TRIANGULO "); 
                        System.out.println("\n\nIngresar la base : "); 
                        b = entrada.nextInt(); 
                        System.out.println("Ingresar la altura"); 
                        h = entrada.nextInt(); 
                        area = ((b * h)/2); 
                        System.out.println("El area del triangulo es : "+ area); 
                        break; 
                        case 2:
                        System.out.println("\n\n\t\t PERIMETRO DE UN TRIANGULO "); 
                        System.out.println("\n\nIngresar lado a "); 
                        lado_a = entrada.nextInt(); 
                        System.out.println("Ingresar lado b : "); 
                        lado_b = entrada.nextInt(); 
                        System.out.println("Ingresar lado c"); 
                        lado_c = entrada.nextInt(); 
                        perimetro = (lado_a + lado_b + lado_c); 
                        System.out.println("El perimetro del triangulo es "+perimetro);   
                        break; 
                        default:
                        System.out.println("error "); 
                        break;
                    }
    
                    break; 
                    case 3 :
                    System.out.println("\n\n\t\t ESFERA"); 
                    System.out.println("\n\n VOLUMEN DE UNA ESFERA"); 
                    System.out.println("Ingresar el radio ");
                    r = entrada.nextDouble(); 
                    r2 =  Math.pow(r,3);
                    volumen = (1.33 *(pi * r2 ));  
                    System.out.println("El volumen de la esfera es "+volumen); 
                    break; 
                    case 4 :
                    System.out.println("\n\n\t\t CILINDRO");  
                    System.out.println("\n\nVOLUMEN DE UN CILINDRO ");
                    System.out.println("Ingresar la altura "); 
                    h2 = entrada.nextDouble();  
                    System.out.println("Ingresar el radio "); 
                    r = entrada.nextDouble(); 
                    r2 = Math.pow(r, 2); 
                    volumen = ((pi * r2)+h2); 
                    System.out.println("EL volumen del cilindro es : "+volumen); 
    
                    break; 
                }

                break;// aqui termina el tercer programa 
                case 4 ://aqui em empieza el programa JOption
                JOptionPane.showMessageDialog(null," \t\t CALCULADORA "); 
                nombre = JOptionPane.showInputDialog("escriba su nombre  "); 
            JOptionPane.showMessageDialog(null,"Hola bienvenido :D " + nombre);
            op12 = Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion  : \n 1 suma \n 2 resta \n 3 multiplicacion \n 4 division \n seleccione una opcion de las que aparece : ")); 
            switch(op12){
                case 1 :
                JOptionPane.showMessageDialog(null , "Hola"+ nombre);
                num1 = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese un numero para sumar : ")); 
                num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero a sumar ")); 
                suma = (num1 + num2); 
                JOptionPane.showMessageDialog(null,"El resultado de la suma es : "+suma );
                break; 
                case 2:
                JOptionPane.showMessageDialog(null,"Hola "+ nombre); 
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para restar :"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para restar : ")); 
                resta = num1 - num2; 
                JOptionPane.showMessageDialog(null,"La resultado de la resta es : "+ resta);   
                break; 
                case 3 :
                JOptionPane.showMessageDialog(null, "Hola "+ nombre); 
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para multiplicar : ")); 
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para multiplicar : ")); 
                multi = num1 * num2; 
                JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es : " + multi);  
                break; 
                case 4:
                JOptionPane.showMessageDialog(null , " hola " + nombre ); 
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero dividir ")); 
                num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero dividir ")); 
                div = num1 / num2; 
                JOptionPane.showMessageDialog(null,"El resultado de la division es "+div); 
                break; 
                default:
                JOptionPane.showMessageDialog(null,"error"); 
                break; 
            }

                break;// aqui termina el 4 programa 
                case 5 ://inicia el 5 programa
                do {
                    System.out.println("\n\n");
                    System.out.println ("\t\t  FIGURA HUECA\n\n"); 
                    System.out.println("\t\t*********************"); 
                    System.out.println("\t\t**                 **"); 
                    System.out.println("\t\t**                 **"); 
                    System.out.println("\t\t*********************"); 
                    System.out.println("\n\nDeseas reimprimir el rectangulo"); 
                    System.out.println(" 1 si :D "); 
                    System.out.println(" 2 no :( "); 
                    op13 = entrada.nextInt(); 


                }while(op13 != 2);
                break; // aqui termina el programa 
                case 6 : // inicia el 6 programa 
                System.out.println("\n\n\t\t FACTORIAL DE UN NUMERO ");
                System.out.println("\n\nIngresa un numero positivo para factorial");
                numero = entrada.nextInt();
                if(numero>0){
                while(numero != 0){

                    factorial=factorial*numero;
                    numero --;
                }
                System.out.println("El factorial del numero es : " + factorial);
                }else{
                System.out.println("ingresar un numero positivo");
                }
                break; // termina el programa 6
                case 7 : // inicia el 7 programa
                System.out.println("\n\n\t\t diamante ");
                System.out.println("\n\n");
                for (int i = 1; i<=1 ; i++){
                    System.out.println("\t   *** ");//3
                    for(int j=1 ; j<= 1 ; j++){
                        System.out.println("\t  *****");//5
                        for(int y=1; y<=1; y++ ){
                          System.out.println("\t *******");
                          for( int a = 1; a<=1 ; a++){
                            System.out.println("\t*********");
                          }
                          System.out.println("\t *******");   
                        }
                        System.out.println("\t  *****");
                    }
                    for(int x = 1; x <= 1 ; x++){
                        System.out.println("\t  *****");
                    }
                    System.out.println("\t   ***");
                    for(int z=1 ; z<=1; z++){
                        System.out.println("\t    *");
                    } 
                }

                break;// aqui termina el programa 7
                case 8:// inicia el 8 programa 
                System.out.println("\n\n\t\t Patron "); 
                System.out.println("\n\n ¿ Deseas desplegar el patron sorpresa ?");
                System.out.println("1 si \n2 no "); 
                op13 = entrada.nextInt(); 
                switch(op13){
                    case 1 :
                    System.out.println("\n**************\n**************\n**************\n**************\n"); 
                    break; 
                    case 2:
                    System.out.println("Que aburrido :( ");  
                    break; 
                    default:
                    System.out.println("error "); 
                    break; 
                }
                break;// aqui termina el programa 8 
                case 9:// inicia el 9 programa 
                System.out.println("\n\n\t\t Cuadrado ");
                System.out.println("\n\ningrese el tamaño de la figura : "); 
                lado = entrada.nextInt(); 
                for (int i=1; i<= lado; i++){
                for (int j=1 ; j<=lado ; j++ ){
                System.out.print("*"); 
                }
                System.out.println(""); 
                }
                break; // termina el programa 9
                case 10:// inicia el 10 programa 
                System.out.println("\n\n\t\t Numeros positivos y negativos ");
                System.out.println("\n\nIngresa seis numeros diferentes");
                a2 = entrada.nextFloat();
                b2 = entrada.nextFloat();
                c2 = entrada.nextFloat();
                d2 = entrada.nextFloat();
                e2 = entrada.nextFloat();
                f2 = entrada.nextFloat();
                if(a2 > 0){
                   System.out.println("el numero " + a2 +" es positivo");
                }else{
                   System.out.println("el numero " + a2 + " es negativo");
                }
                if(b2 > 0){
                   System.out.println("el numero " + b2 +" es positivo");
                }else{
                   System.out.println("el numero " + b2 + " es negativo");
                }
                if(c2 > 0){
                   System.out.println("el numero " + c2 +" es positivo");
                }else{
                   System.out.println("el numero " + c2 + " es negativo");
                }
                if(d2 > 0){
                   System.out.println("el numero " + d2 +" es positivo");
                }else{
                   System.out.println("el numero " + d2 + " es negativo");
                }
                if(e2 > 0){
                   System.out.println("el numero " + e2 +" es positivo");
                }else{
                   System.out.println("el numero " + e2 + " es negativo");
                }
                if(f2 > 0){
                   System.out.println("el numero " + f2 +" es positivo");
                }else{
                   System.out.println("el numero " + f2 + " es negativo");
                }
           
                break;

                
            }
            System.out.println("\nDeseas repetir la operacion que hiciste ");
            System.out.println(" 1 si :D ");
            System.out.println(" 2 no :( ");
            op2 = entrada.nextInt();

        }while(op2 != 2);

    }
}

