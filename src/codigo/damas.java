package codigo;

public class damas {

    pieza nuevaPieza = new pieza();

    public damas(){
        int[][] tablero = new int[8][8];                 
        int[][] tableronull = empezarTablero(tablero);
        mostrarTablero(tableronull);        
    }

    public int[][] empezarTablero(int[][] tablero){

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (i%2==0) {
                    if (j%2==0) {
                        tablero[i][j]=1;        
                    }
                }else{
                    if (j%2==0) {                     

                    }else{
                        tablero[i][j]=1;        
                    }                    
                }                
            }    
        }
        return tablero;
    }    

    public void mostrarTablero(int[][] tablero){
        asterisco(56);
        System.out.println("            mostrando tablero");
        asterisco(56);
        
        //filas
        for (int i = 0; i < tablero.length; i++) {               
            //repetir filas para que los cuadros sean 3*3(representativamente)
            for (int i2 = 0; i2 < 3; i2++) {                    
            //columnas
                for (int j = 0; j < tablero.length; j++) {

                    if (tablero[i][j]==0) {
                        nuevaPieza.cuadroDeMeza0();                        
                    }
                    if (i==0||i==1||i==2) {
                        if (tablero[i][j]==1) {
                            nuevaPieza.cuadroDeMezaOcupado1(i2);
                        }                        
                    }
                    if (i==5||i==6||i==7) {
                        if (tablero[i][j]==1) {
                            nuevaPieza.cuadroDeMezaOcupado2(i2);    
                        }                        
                    }
                    if (i==3||i==4) {
                        if (tablero[i][j]==1) {
                            nuevaPieza.cuadroDeMeza1();    
                        }
                        
                    }


                    /*if (i==0||i==1||i==2) {
                        if (tablero[i][j]==1) {                            
                            nuevaPieza.cuadroDeMezaOcupado1(i2);                            
                            tablero[i][j]=2;
                        }else{
                            nuevaPieza.cuadroDeMeza0();
                        }
                        
                    }else if(i==5||i==6||i==7){
                        if (tablero[i][j]==1) {                            
                            nuevaPieza.cuadroDeMezaOcupado2(i2);                            
                            tablero[i][j]=3;
                        }else{
                            nuevaPieza.cuadroDeMeza0();
                        }
                    }else{
                        if (tablero[i][j]==0) {
                            nuevaPieza.cuadroDeMeza0();
                        }else{
                            nuevaPieza.cuadroDeMeza1();
                        }
                    } */           
                }               
                System.out.println("");                
            }            
        }
    }

    public void asterisco(int valor){
        for(int i = 0; i< valor; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
