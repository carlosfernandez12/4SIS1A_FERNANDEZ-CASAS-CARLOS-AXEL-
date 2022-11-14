import java.util.ArrayList;

public class AccionPrenda {
   

     public ArrayList<Prenda> listaPersonas = new ArrayList<Prenda>();

    
     public void agregarPersona(Prenda p){
     
        listaPersonas.add(p);
     }

    
     public Prenda buscarPersona(int id){
        
        Prenda encontrada = new Prenda();
       
        for(Prenda p : listaPersonas){
           
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("No existe ese registro ");
            }
        }
        return encontrada;
     }

     
     public void actualizarPersona(Prenda actualizada){
       
        Prenda actualizar = buscarPersona(actualizada.getId());

       
        listaPersonas.remove(actualizar);

     
        listaPersonas.add(actualizar);
     }

 
     public void eliminarPersona(Prenda eliminar){
        listaPersonas.remove(eliminar);
     }

   
     public ArrayList<Prenda> mostrarPersonas(){
        return listaPersonas;
     }


    
}