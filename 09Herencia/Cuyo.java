public class Cuyo extends Animal{
    //aqui deberia de venir String
    String ruidito;

    public Cuyo(){

    }

    public Cuyo(String nombre, String raza, String tipo_alimento, int edad, String ruidito){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.ruidito= ruidito;
    }

    //recibir
    public String getruidito(){
        return ruidito;
    }

    //enviar
    public void setruidito(String ruidito){
        this.ruidito = ruidito;
    }

    //el metodo propio del hasmter
    public void mostrarCuyo(){
        System.out.println("El nombre del Cuyo es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su ruidito es: " + ruidito);
    }




    
}