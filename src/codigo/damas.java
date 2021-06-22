package codigo;
import java.util.*;
public class damas {

    pieza nuevaPieza = new pieza();
    Scanner read = new Scanner(System.in);

    public damas(){
        int[][] tablero = new int[8][8];                 
        int[][] tableronull = empezarTablero(tablero);
        mostrarTablero(tableronull);        
        seleccionDeFicha1();
        tablaActualizada(tableronull);
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

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print("["+tablero[i][j]+"]");
            }
            System.out.println("");
        }
        return tablero;
    }   
    public void tituloMostrarTablero(){
        System.out.println("");
        asterisco(56);
        System.out.println("                  mostrando tablero");
        asterisco(56);        
    } 

    public void mostrarTablero(int[][] tablero){        
        tituloMostrarTablero();
        int numeroFicha1=0;
        int numeroFicha2=0;
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
                            nuevaPieza.cuadroDeMezaOcupado1(i2,numeroFicha1,i,j,0);
                            
                            if (i2==1) {                            
                                if (numeroFicha1!=11) {
                                    numeroFicha1++;  
                                }                                                                  
                            }                            
                        }                        
                    }
                    if (i==5||i==6||i==7) {
                        if (tablero[i][j]==1) {
                            nuevaPieza.cuadroDeMezaOcupado2(i2,numeroFicha2,i,j,0);    

                            if (i2==1) {                                
                                if (numeroFicha2!=11) {
                                    numeroFicha2++;                                    
                                }
                            }                            
                        }                        
                    }
                    if (i==3||i==4) {
                        if (tablero[i][j]==1) {
                            nuevaPieza.cuadroDeMeza1();    
                        }
                        
                    }
                }
                System.out.println(nuevaPieza.colorBlanco+" [ "+i+" ] ");
            }                                
        }

        for (int j = 0; j < tablero.length; j++) {
            System.out.print(nuevaPieza.colorBlanco+"  ["+j+"] ");            
        }        
    }

    public void seleccionDeFicha1(){
        System.out.println("\nQue ficha quiere mover, ingrese numero de ficha");
        int numeroFicha = read.nextInt();
        nuevaPieza.mostrarDatosfichaVerde1(numeroFicha);
        System.out.println("");
        opcionesDeMovimeinto(numeroFicha);                
    }

    public int opcionesDeMovimeinto(int ficha){
        int posicioni=0;
        int j=0;
        int seleccionDemovivimiento=0;

        for (int i = ficha; i < (ficha+1); i++) {
            posicioni=nuevaPieza.datosFicha1Verde[i][1];
            j=nuevaPieza.datosFicha1Verde[i][2];
        }
        
        if (posicioni==0 && j==0) {
            System.out.println("se puede mover a");
            System.out.println("");
        }
        if (j==0 && posicioni>0) {
            System.out.println("Se puede mover a");
            System.out.println("opcion 1.");
            System.out.println("\t(i)fila: "+(posicioni+1));
            System.out.println("\t(j)columna:"+(j+1));
            System.out.println("ingrese seleccion:");
            seleccionDemovivimiento = read.nextInt();            
            if (seleccionDemovivimiento==1) {
                for (int i = ficha; i < (ficha+1); i++) {
                    nuevaPieza.datosFicha1Verde[i][1]=(posicioni+1);
                    nuevaPieza.datosFicha1Verde[i][2]=(j+1);
                }                
                nuevaPieza.mostrarDatosfichaVerde1(ficha);
            }
        }     
        return seleccionDemovivimiento;   
    }

    public void tablaActualizada(int[][] tablero){        
        tituloMostrarTablero();              
        nuevaPieza.ordenarFichasVerdes();
        int contadorficha1=0;
        int contadorficha2=0;
        //filas
        for (int i = 0; i < tablero.length; i++) {
            //repetir filas para que los cuadros sean 3*3(representativamente)
            for (int i2 = 0; i2 < 3; i2++) {
                //columnas
                for (int j = 0; j < tablero.length; j++) { 

                    if (tablero[i][j]==0) {
                        nuevaPieza.cuadroDeMeza0();
                    }
                    if (tablero[i][j]==1) {

                        int jj=0;
                        int numero = nuevaPieza.datosFicha1Verde[contadorficha1][jj];
                        int posicioni = nuevaPieza.datosFicha1Verde[contadorficha1][(jj+1)];
                        int posicionj = nuevaPieza.datosFicha1Verde[contadorficha1][(jj+2)];

                        int numero2 = nuevaPieza.datosFicha2Blanco[contadorficha2][jj];
                        int posicioni2 = nuevaPieza.datosFicha2Blanco[contadorficha2][jj+1];
                        int posicionj2 = nuevaPieza.datosFicha2Blanco[contadorficha2][jj+2];

                        if(i==posicioni2 && j==posicionj2){
                            nuevaPieza.cuadroDeMezaOcupado2(i2,numero2,posicioni2,posicionj2,0);
                            
                                if (i2==1) {
                                    if (contadorficha2!=11) {
                                        contadorficha2++;
                                    }                                
                                }                                
                            
                        }else if (i==posicioni && j==posicionj) {
                            nuevaPieza.cuadroDeMezaOcupado1(i2,numero,posicioni,posicionj,0);                                                              
                                if (i2==1) {
                                    if (contadorficha1!=11) {
                                        contadorficha1++;    
                                    }                                    
                                }                                
                                                    
                        }else{
                            nuevaPieza.cuadroDeMeza1();
                        }
                    }    
                }
                System.out.println(nuevaPieza.colorBlanco+" [ "+i+" ] ");
            }            
        }

        for (int j = 0; j < 8; j++) {
            System.out.print(nuevaPieza.colorBlanco+"  ["+j+"] ");            
        }        
    }

    public void asterisco(int valor){
        for(int i = 0; i< valor; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}