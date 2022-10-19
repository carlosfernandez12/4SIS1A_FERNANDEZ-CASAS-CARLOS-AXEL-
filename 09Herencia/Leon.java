public class Leon extends Animal{
    //aqui deberia de venir String
    String rugido;

    public Leon(){

    }

    public Leon(String nombre, String raza, String tipo_alimento, int edad, String rugido){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.rugido = rugido;
    }

    //recibir
    public String rugido(){
        return rugido;
    }

    //enviar
    public void setrugido(String rugido){
        this.rugido = rugido;
    }

    //el metodo propio del hasmter
    public void mostrarLeon(){
        System.out.println("El nombre del Leon es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su rugido es: " + rugido);
    }




    
}