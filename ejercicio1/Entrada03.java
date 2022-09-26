import java.util.Scanner; 
public class Entrada03{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in); 
        String nombre; 
        System.out.println("Porfavor Ingresa tu nombre : ");
        nombre = entrada.nextLine(); 
        System.out.println("hola "+nombre); 
    }
}