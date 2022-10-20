/** Para poder aplicar la herencia de una clase, se utiliza la palabra reservada 
 * 
 * extends 
 * 
 * un perro se extiende de un animal
 * animal es la clase padre
 * perro es la clase hija
 */

import java.util.Scanner;
public class Gato extends Animal{
    //aqui deberia de venir String

    int num_vidas;

    Animal ani = new Animal();
    public Gato(){

    }

    public Gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }

    //recibir
    public int getNum_vidas(){
        return num_vidas;
    }

    //enviar
    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    //el metodo propio del perro
    public void mostrarGato(){

        ani.entrada_de_datos();
        ani.mostrar();
        


        
    }




    
}