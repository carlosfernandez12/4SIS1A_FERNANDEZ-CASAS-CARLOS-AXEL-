import javax.swing.JOptionPane;
public class Formula {

    public void MenuFormula(){

        PrendasRegistradas obj4 = new PrendasRegistradas(); 
        Calcular obj5 = new Calcular();

        int op3 ;
        int op4 ; 
        int op5; 
        int op6; 
        int op7; 
        int op8; 
        int op9; 
        int op10; 
        int op11;
        int op12; 
        int op13; 
        int op14;  


        try{
            op3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Lee las opciones y escoje la de tu agrado : \n 1 --> Que es la huella de carbono \n 2 --> Saber la huella de carbono de prendas registradas \n 3 --> Saber la huella de carbono de una prenda \n Digita tu opcion : "));
            switch(op3){
                case 1 :
                JOptionPane.showMessageDialog(null, "\t\tQue es la huella de carbono \n La huella de carbono representa el volumen total de gases de efecto invernadero (GEI) que producen las actividades económicas y cotidianas del ser humano.\n Conocer el dato —expresado en toneladas de CO2 emitidas— es importante para tomar medidas y poner en marcha las iniciativas necesarias para reducirla al máximo, \nempezando por cada uno de nosotros en nuestro día a día."); 
                break;
                case 2 :
                op3 = Integer.parseInt(JOptionPane.showInputDialog(null, "En este apartado conoceras la huella de carbono de algunas prendas que tenemos registradas\n1 --> Camisa \n2 --> Pantalon \n3 --> Vestido \n Digita tu opcion : ")); 
                switch(op3){
                    case 1 : 

                    op5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoje el material de la Playera : \n 1 Algodon \n 2 Nylon \n 3 Polyester \n 4 Lana \n Digita tu opcion : ")); 
                    switch(op5){
                        case 1 : 
                         
                        op6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoje una talla : \n 1 Chica \n 2 Mediana \n 3 Grande \n Digit tu opcion : ")); 
                        switch(op6){
                            case 1 :
                              
                            obj4.chicaPlayera(); 
                            break; 
                            case 2 : 
                            
                            obj4.Playera();
                            break; 
                            case 3 : 
                            
                            obj4.PlayeraGrande(); 
                            break; 
                            default: 
                            JOptionPane.showMessageDialog(null,"Opcion Invalida ");
                            break; 
                        }
                        
                        break; 
                        case 2 :
                        
                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 :
                            
                            obj4.PlayeraChicaNylon();
                            break;
                            case 2 : 
                             
                            obj4.PlayeraMedianaNylon();
                            break;
                            case 3 :
                             
                            obj4.PlayeraGrandeNylon();
                            break;
                            default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida ");
                            break;
                        }
                        break; 
                        case 3 :
                         

                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 :
                            
                            obj4.PlayeraChicaPoli();
                           
                            break;
                            case 2 : 
                            
                            obj4.PlayeraMedianaPoli();
                            
                            
                            break;
                            case 3 :
                            

                            obj4.PlayeraGrandePoli();

                            
                            break;
                            default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida ");
                            break;
                        }
                        
                        break; 
                        case 4 : 
                       
                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 : 
                            obj4.PlayeraCLana();
                            break;
                            case 2 : 
                            obj4.PlayeraMLana();
                            break;
                            case 3 : 
                            obj4.PlayeraGLana();
                            break;
                            default: 
                            break;
                        }



                        break; 
                        default : 
                        JOptionPane.showMessageDialog(null,"Opcion Invalida ");
                        break; 

                         
                    
                    }

                   
                    break; 

                    case 2 : 
                     
                    op7 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoje el material del Pantalon : \n 1 Agodon \n 2 Nylon \n 3 Polyester \n 4 Lana \n Digita tu opcion : ")); 
                    switch(op7){
                        case 1 : 
                        
                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 : 
                            
                            obj4.PantalonChicoAlgodon();
                            break; 
                            case 2: 
                            
                            obj4.PantalonMedianoAlgodon(); 
                            break; 
                            case 3 : 
                            
                            obj4.PantalonGrandeAlgodon();
                            break; 
                            default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida "); 
                            break; 
                            
                        }
                        
                        break; 
                        case 2 : 
                      
                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 : 
                            
                            obj4.PantalonChicoNylon();
                            break; 
                            case 2: 
                           
                            obj4.PantalonMedioanoNylon();
                            break; 
                            case 3 : 
                           
                            obj4.PantalonGrandeNylon();
                            break; 
                            default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida "); 
                            break; 
                        }
                        break; 
                        case 3 : 
                        
                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 : 
                           
                            obj4.PantaloncPoli();
                            break; 
                            case 2: 
                            
                            obj4.PantalonMPoli();
                            break; 
                            case 3 : 
                           
                            obj4.PantalonGrPoli();
                            break; 
                            default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida "); 
                            break; 
                        }
                        break; 
                        case 4 : 
                        
                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 : 
                             
                            obj4.PantalonChLana();
                            break; 
                            case 2: 
                            
                            obj4.PantalonMLana();
                            break; 
                            case 3 : 
                            
                            obj4.PantalonGLana();
                            break; 
                            default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida "); 
                            break; 
                        }
                        break; 
                        default : 
                        break; 
                    }
                    break ; 

                    case 3 :
                     
                    op8 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoje el material del Vestido : \n 1 Agodon \n 2 Nylon \n 3 Polyester \n 4 Lana \n Digita tu opcion : ")); 
                    switch(op8){
                        case 1 : 
                        
                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 : 
                            
                            obj4.VestidoChicoAlgodon();
                            break; 
                            case 2: 
                            
                            obj4.VestidoMedianoAlgodon();
                            break; 
                            case 3 : 
                            
                            obj4.VestidoGrandeAlgodon();
                            break; 
                            default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida "); 
                            break; 
                        }
                        break; 
                        case 2 : 
                        
                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 : 
                            
                            obj4.VestidochicoNylon();
                            break; 
                            case 2: 
                            
                            obj4.VestidoMedianoNylon();
                            break; 
                            case 3 : 
                           
                            obj4.VestidoGrandeNylon();
                            break; 
                            default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida "); 
                            break; 
                        }
                        break; 
                        case 3 : 
                        
                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 : 
                            
                            obj4.VestidoCPoliester();
                            break; 
                            case 2: 
                            
                            obj4.VestidoMPoliester();
                            break; 
                            case 3 : 
                          
                            obj4.VestidoGPoliester();
                            break; 
                            default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida "); 
                            break; 
                        }
                        break; 
                        case 4 : 
                       
                        op9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la talla ; \n 1 Chica \n 2 Mediana \n 3 GRande \n -dgiita tu opcion : ")); 
                        switch(op9){
                            case 1 : 
                           
                            obj4.VestidoChLana();
                            
                            case 2: 
                            
                            obj4.VestidoMLana();
                            
                            break; 
                            case 3 : 
                            
                            obj4.VestidoGLana();
                            break; 
                            default:
                            JOptionPane.showMessageDialog(null, "error "); 
                            break; 
                        }
                        break; 
                        default : 
                        break; 
                    }

                    break; 

                    default : 
                    JOptionPane.showMessageDialog(null, "error ");
                    break; 
                }
                break; 

                case 3 :

                obj5.Usuario();

                break;

                
            }

        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "error :(");
        }

        
      


    }

    
}