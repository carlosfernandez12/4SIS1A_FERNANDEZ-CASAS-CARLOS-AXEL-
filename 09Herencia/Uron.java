public class Uron extends Animal{
    //aqui deberia de venir String
    int num_vidas;

    public Uron(){

    }

    public Uron(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
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

    //el metodo propio del hasmter
    public void mostrarUron(){
        System.out.println("El nombre del Uron es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su num de vidas es: " + num_vidas);
    }




    
}