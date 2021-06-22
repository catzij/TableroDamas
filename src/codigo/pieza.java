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

    int [][] datosFicha1Verde = new int[12][4];
    int [][] datosFicha2Blanco = new int[12][4];    
    
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

    public void cuadroDeMezaOcupado1(int linea,int numeroFicha,int posicioni,int posicionj, int estado){        

        for (int i = numeroFicha; i < (numeroFicha+1); i++) {
            int j=0;
                datosFicha1Verde[i][j]=numeroFicha;
                datosFicha1Verde[i][(j+1)]=posicioni;
                datosFicha1Verde[i][(j+2)]=posicionj;
                datosFicha1Verde[i][(j+3)]=estado;
        }

        if (linea == 0||linea==2) {
         cuadroDeMeza1();
        }
        if (linea ==1) {
            for (int i = 0; i < 6; i++) {                
    
                if (i==2) {
                    if (numeroFicha>9) {
                        System.out.print(colorVerde+""+numeroFicha);                        
                        }
                    if (numeroFicha<10) {
                        System.out.print(colorVerde+"0");                        
                    }                    
                }
                if (i==3) {
                    if (numeroFicha>9) {
                         
                    }
                   if (numeroFicha<10) {
                        System.out.print(colorVerde+""+numeroFicha);                        
                    }                    
                }
                if(i==1||i==4){
                    System.out.print(colorVerde+""+cuadroTabla);
                }
                if (i==0||i==5) {
                    System.out.print(colorRojo+""+cuadroTabla);
                }                
            }            
        }        
    }

    public void cuadroDeMezaOcupado2(int linea,int numeroFicha,int posicioni,int posicionj, int estado){
        for (int i = numeroFicha; i < (numeroFicha+1); i++) {
            int j=0;
                datosFicha2Blanco[i][j]=numeroFicha;
                datosFicha2Blanco[i][(j+1)]=posicioni;
                datosFicha2Blanco[i][(j+2)]=posicionj;
                datosFicha2Blanco[i][(j+3)]=estado;
        }

        if (linea == 0||linea==2) {
            cuadroDeMeza1();
        }
        for (int i = 0; i < 6; i++) {            
            if (linea == 1) {

                if (i==2) {
                    if (numeroFicha>9) {
                        System.out.print(colorBlanco+""+numeroFicha);                        
                    }
                    if (numeroFicha<10) {
                        System.out.print(colorBlanco+"0");
                    }                    
                }
                if (i==3) {
                    if (numeroFicha>9) {
                     
                    }
                    if (numeroFicha<10) {
                        System.out.print(colorBlanco+""+numeroFicha);                        
                    }
                }
                if(i==1||i==4){
                    System.out.print(colorBlanco+""+cuadroTabla); 
                }
                if(i==0||i==5){
                    System.out.print(colorRojo+""+cuadroTabla);                              
                }   
            }            
        }        
    }

    public void mostrarDatosfichaVerde1(int numeroFicha){
        for (int i = numeroFicha; i < (numeroFicha+1); i++) {
            int j=0;
            System.out.println("numero de ficha: "+datosFicha1Verde[i][j]);
            System.out.println("posicion i(fila): "+datosFicha1Verde[i][(j+1)]);
            System.out.println("posicion j(columna): "+datosFicha1Verde[i][(j+2)]);
            //System.out.println("numero de ficha: "+datosFicha1Verde[i][(j+3)]);
        }        
    }
    public void mostrarDatosfichaBlanca2(int numeroFicha){
        for (int i = numeroFicha; i < (numeroFicha+1); i++) {
            int j=0;
            System.out.println("numero de ficha: "+datosFicha2Blanco[i][j]);
            System.out.println("posicion i(fila): "+datosFicha2Blanco[i][(j+1)]);
            System.out.println("posicion j(columna): "+datosFicha2Blanco[i][(j+2)]);
            //System.out.println("numero de ficha: "+datosFicha1Verde[i][(j+3)]);
        }        
    }
    public void ordenarFichasVerdes(){
        
        for (int i = 0; i < (datosFicha1Verde.length-1); i++) {
            for (int j = 0; j < (11); j++) {
                
                int auxnumero;
                int auxposicioni;
                int auxposicionj;

                //pieza1                
                int numeroFicha=datosFicha1Verde[i][0];
                int posicioni=datosFicha1Verde[i][1];
                int posicionj=datosFicha1Verde[i][2];
                //pieza2
                int numeroficha2=datosFicha1Verde[(i+1)][0];
                int posicioni2=datosFicha1Verde[(i+1)][1];
                int posicionj2=datosFicha1Verde[(i+1)][2];
                
                if (posicioni>posicioni2) {
                    //guardamos pieza2 en aux
                    auxnumero = numeroficha2;
                    auxposicioni = posicioni2;
                    auxposicionj = posicionj2;
                    //cambio1 pieza1 a donde estaba pieza2
                    datosFicha1Verde[(i+1)][j] =  numeroFicha;
                    datosFicha1Verde[(i+1)][(j+1)] = posicioni;
                    datosFicha1Verde[(i+1)][(j+2)] = posicionj;
                    //cambio2 pieza2 a donde estaba pieza1
                    datosFicha1Verde[i][j] = auxnumero;
                    datosFicha1Verde[i][(j+1)] = auxposicioni;
                    datosFicha1Verde[i][(j+2)] = auxposicionj;
                }                                
            }
        }
    }
}