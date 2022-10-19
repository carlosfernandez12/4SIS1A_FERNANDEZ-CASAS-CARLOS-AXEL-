public class Hamster extends Animal{
    //aqui deberia de venir String
    String chillido;

    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String chillido){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.chillido = chillido;
    }

    //recibir
    public String chillido(){
        return chillido();
    }

    //enviar
    public void setchillido(String chillido){
        this.chillido = chillido;
    }

    //el metodo propio del hasmter
    public void mostrarHamster(){
        System.out.println("El nombre del Hamster es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su chillido es: " + chillido);
    }




    
}