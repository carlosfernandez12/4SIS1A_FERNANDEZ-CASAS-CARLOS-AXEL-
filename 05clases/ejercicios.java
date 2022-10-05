import java.util.Scanner;

public class ejercicios {
    /**
     * Vamos a hacer una calculadora, un conversor de unidades creacion de cuadros y
     * de movimiento
     */

    // los metodos son las operaciones de un objeto o de una clase, tambien llamado
    // comportamiento

    // objetos
    Scanner entrada = new Scanner(System.in);

    // variables globales
    char op;

    // vamos a ser un metodo para el menu del programa
    public void menu() {
        // menu del programa
        System.out.println("Ejercicios de yo para tu");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Crear cuadros magicos");
        System.out.println("d.- Desplazamiento de cuadro");
        System.out.println("Elija una opción");

        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                // implementamos metodos
                Ejercicio1();
                break;
            case 'b':
                // implementamos metodos
                Ejercicio2();
                break;
            case 'c':
                // implementamos metodos
                Ejercicio3();
                break;
            case 'd':
                // implementamos metodos
                Ejercicio4();
                break;
            default:
                System.out.println("Gracias por jugar :3");
        }
    }

    public void Ejercicio1() {
        // variable local
        double num1 = 0.00, suma = 0.00, multi = 1.00,b,divi=1;
        char operacion;

        System.out.println("Selecciona la operacion que desees realizar");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Division ahi la hacen");

        operacion = entrada.next().charAt(0);
        switch (operacion) {
            case 'a':
                do {
                    System.out.println("Para detener la suma o resta ingrese el numero 0");
                    System.out.println("Escriba los numeros que desee sumar o restar");
                    num1 = entrada.nextDouble();
                    suma += num1;
                    // suma = suma + num1;

                } while (num1 != 0);
                System.out.println("El resultado es: " + suma);
                break;
            case 'b':
            do {
                System.out.println("Para detener multiplicaion ingrese el numero 0");
                System.out.println("Escriba los numeros que desee sumar o restar");
                num1 = entrada.nextDouble();
                multi *= num1;
                // multi = multi * num1;

            } while (num1 != 0);
            System.out.println("El resultado es: " + multi);
            
                break;
            case 'c':do{
                System.out.println("Para detener divicion ingrese el numero 0");
                System.out.println("ingrese el numerador ");
                num1 = entrada.nextDouble();
                System.out.println("ingrese el denomidador");
                b = entrada.nextDouble();
                if(b !=0){

                    divi/=num1;

                }else{
                    System.out.println("no se puede divider entre 0 pendejo");
                }

            }while(num1 != 0);
            System.out.println("el resultado de la diicion es: " + divi);
            break;
                default:
                System.out.println("hasta la vista popo");
                break;

        }

    }

    public void Ejercicio2() {
        double metros = 0.00, kg=0.00,velocidad=0.00, cm=100, pulgadas=39.37,gramos=1000,libra=2.20,ms=0.00;
        double a,b,pesos=0.00,dolar=0.050,euro=0.51;
        System.out.println("seleccione la cantidad que desee convertir a las siguientes unidades");
        System.out.println("a. metros a cm a pulgadas");
        System.out.println("b. kilogramos a libras y gramos");
        System.out.println("c. m/s a km/h");
        System.out.println("d.pesos a dolar a euro");
        op = entrada.next().charAt(0);

        switch(op){

            case 'a':
            System.out.println("ingrese los metros a transformar ");
            metros = entrada.nextDouble();
            a= metros*cm;
            b=metros*pulgadas;
            System.out.println("la cantidad en metros es" + metros + "de m a cm es: " + a + "de m a pulgadas es: " + b);
            break;
            case 'b':
            System.out.println("ingrese los gramos a transformar ");
            kg =entrada.nextDouble();
            a= kg*gramos;
            b=kg*libra;
            System.out.println("la cantidad en gramos es" + gramos + "de kg a gramos es: " + a + "de kg a libras es: " + b);
            break;

            case 'c':
            System.out.println("ingrese la m/s a transformar ");
            ms=entrada.nextDouble();

            a= ms*(3600/1000);
            System.out.println("la conversion es"+ a );
            break;
            case 'd':
            System.out.println("ingrese los pesos a convertir");
            pesos = entrada.nextDouble();
            a=pesos*dolar;
            b=pesos*euro;
            System.out.println("la cantidad de pesos es:"+pesos+" en dolares es:"+dolar+"en euro es: "+euro);
            break;
        }

    }

    public void Ejercicio3() {
        /* */
    int lado;
    char letra;
    do{
        System.out.println("ingrese el tamaño del cuadrado : "); 
        lado = entrada.nextInt(); 
        if(lado>=1 & lado<=1000){
          
        for (int i=1; i<= lado; i++){
            for(int j=1; j<=lado;j++){
                System.out.print(" *"); 
            }
            System.out.println(""); 
            for(int k=1; k<=lado;k++){
            System.out.print(" /"); 
            }
            System.out.println(""); 
        }
        
    }else{
        System.out.println("habiendo tantos numeros escogiste uno negativo y mayor a mill");
    }
          System.out.println("Deseas repetir el programa, escribe s para si");
              letra = entrada.next().charAt(0);
    }while(letra == 's' || letra == 'S' );

    }

    public void Ejercicio4() {

    }

}