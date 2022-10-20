import java.util.Scanner; 
public class Conejo extends Animal{
   
    String ladrido;
    Scanner entrada= new Scanner (System.in); 
    Animal ani = new Animal();



    public Conejo(){

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, String ladrido){
        
        super(nombre, raza, tipo_alimento, edad);
        this.ladrido = ladrido;
    }

    //recibir
    public String getLadrido(){
        return ladrido;
    }

    //enviar
    public void setLadrido(String ladrido){
        this.ladrido = ladrido;
    }

    //el metodo propio del perro
    public void mostrarConejo(){

        ani.entrada_de_datos();
        System.out.println("que sonido emite el animalito : ");
        ladrido = entrada.nextLine(); 
        ani.mostrar();
        System.out.println("Sonido : "+ ladrido );
      
    }
    



    
}