public class Conejo extends Animal{
    //aqui deberia de venir String
    String gruñido;

    public Conejo(){

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, String gruñido){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.gruñido = gruñido;
    }

    //recibir
    public String getgruñido(){
        return gruñido;
    }

    //enviar
    public void setgruñido(String gruñido){
        this.gruñido = gruñido;
    }

    //el metodo propio del hasmter
    public void mostrarConejo(){
        System.out.println("El nombre del Conejo es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su gruñido es  es: " + gruñido);
    }




    
}