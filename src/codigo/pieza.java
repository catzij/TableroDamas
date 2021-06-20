package codigo;
public class pieza {    
    //colores
    final String colorBlanco = "\033[37m";
    final String colorAmarillo = "\033[33m";
    final String colorVerde = "\033[32m";    
    final String colorRojo = "\033[31m";
    final String colorNegro = "\033[30m"; 

    //piezas a usar
    final String cuadroTabla="█";    
    final String reina="[]";
    
    
    //final String colorRojo = "\u001B[31m";
    //final String colorAmarillo = "\u001B[33m";
    //final String colorAmarillo = "\u001B[43m";    

    public void cuadroDeMeza0(){
        for (int i = 0; i < 6; i++) {            
            System.out.print(colorAmarillo+""+cuadroTabla);                        
         }
    }

    public void cuadroDeMeza1(){        
        for (int i = 0; i < 6; i++) {            
            System.out.print(colorRojo+""+cuadroTabla);         
        }
    }

    public void cuadroDeMezaOcupado1(int linea){
        if (linea == 0||linea==2) {
         cuadroDeMeza1();
        }
        for (int i = 0; i < 6; i++) {            
            if (linea == 1) {
                if (i==2||i==3) {
                    System.out.print(colorNegro+""+cuadroTabla);                    
                }else{
                    System.out.print(colorRojo+""+cuadroTabla);                              
                }   
            }            
        }                    
    }

    public void cuadroDeMezaOcupado2(int linea){
        if (linea == 0||linea==2) {
            cuadroDeMeza1();
        }
        for (int i = 0; i < 6; i++) {            
            if (linea == 1) {
                if (i==2||i==3) {
                    System.out.print(colorBlanco+""+cuadroTabla);                    
                }else{
                    System.out.print(colorRojo+""+cuadroTabla);                              
                }   
            }            
        }        
    }
}