import java.util.Scanner;
public class Principal {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int op;
        //hago la instancia del animal perro
        Perro dog = new Perro("Pulgas", "de la calle", "Croquetas", 1, "gua gua");
        Gato cat = new Gato("Michi", "de la calle", "Atun", 1, 7);
        Hamster hamster = new Hamster("Ratoncito", "sirio", "cereales", 1, "shhh");
        Conejo rabbit = new Conejo("Conejito", "bugs bunny", "vegetales", 1, "ññññ");
        Cuyo whose = new Cuyo("Cuyito", "Cobaya", "verduras", 1, "cuiii cuiii");
        Uron ferret = new Uron("Urionsito", "whippet", "carne", 1, 7);
        Leon lion = new Leon("Leonsito", "Africano", "carne", 1, "aaaaah");
        /*Quiero que se cree un menu mediante el cual el usuario pueda ingresar los datos de los animales:
         * 
         * 1.- Perro
         * 2.- Gato
         * 3.- Hamster
         * 4.- Conejo
         * 5.- Cuyo
         * 6.- Uron
         * 7.- Otro
         * 
         * Debera de poder ingresar cada uno de los datos y asi mismo deberan de entregar el diagrama de clases hecho en star uml aplicando la herencia correspondiente y el programa
        */

        //muestro

        System.out.println("Lee las opciones y escoje tu animalito ");
        System.out.println(" 1 perro ");
        System.out.println(" 2 gato ");
        System.out.println(" 3 Hamster");
        System.out.println(" 4 Conejo ");
        System.out.println(" 5 Cuyo ");
        System.out.println(" 6 Uron ");
        System.out.println(" 7 Sorpresa ");
        System.out.println("Digita tu opcion ");
        op = entrada.nextInt();
        switch(op){
            case 1 : 
            dog.mostrarPerro();
            break; 
            case 2 :
            cat.mostrarGato();
            break;
            case 3 :
            hamster.mostrarHamster();
            break;
            case 4 :
            rabbit.mostrarConejo();
            break;
            case 5:
            whose.mostrarCuyo();
            break;
            case 6:
            ferret.mostrarUron();
            break;
            case 7:
            lion.mostrarLeon();
            break;
            default:
            System.out.println(" opcion invalida  ");
            break;
        }

        
    }
    
}