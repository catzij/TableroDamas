import jdk.javadoc.internal.tool.ElementsTable;

public class damas {
    public static void main(String[] args){
        damas tableroUno = new damas();
    }
    public damas(){
        String colorAmarillo = "\033[33m";
        String colorVerde = "\033[32m";
        String colorBlanco = "\033[37m";
        String colorRojo = "\033[31m";
        int[][] tablero = new int[8][8];         
        mostrarTablero(tablero,colorVerde,colorAmarillo,colorRojo,colorBlanco);
    }

    public void mostrarTablero(int[][] tablero, String color1, String color2,String color3,String color4){
        asterisco(40);
        System.out.println("            mostrando tablero");
        asterisco(40);
        int posicion=1;
        
        for(int i = 0; i < tablero.length;i++){
            for(int j = 0 ; j<tablero.length;j++){                
                //hace que el color se mueva 
                if (posicion %9==0) {
                    posicion++;      
                }
                if (i==0||i==1||i==2) {
                    if (posicion %2==0) {
                        String uno = pieza(color3)+"";                                                            
                        if (j%2==0) {
                            System.out.print(color1+" {"+uno+color1+"} ");
                        }else{
                            System.out.print(color1+" {"+uno+color1+"} ");
                        }
                        posicion++;
                        
                    }else{
                        String dos = pieza(color4)+"";
                        System.out.print(color2+" [ ] ");                    
                        posicion++;
                        
                    }
                }
                if (i==5||i==6||i==7) {
                    if (posicion %2==0) {
                        String dos = pieza2(color4)+"";                                                            
                        if (j%2==0) {
                            System.out.print(color1+" {"+dos+color1+"} ");
                        }else{
                            System.out.print(color1+" {"+dos+color1+"} ");
                        }
                        posicion++;
                        
                    }else{
                        String dos = pieza(color4)+"";
                        System.out.print(color2+" [ ] ");                    
                        posicion++;
                        
                    }
                }
                if (i==3||i==4) {
                    if (posicion %2==0) {                        
                        if (j%2==0) {
                            System.out.print(color1+" { } ");
                        }else{
                            System.out.print(color1+" { } ");
                        }
                        posicion++;
                        
                    }else{                        
                        System.out.print(color2+" [ ] ");                    
                        posicion++;                        
                    }
                }         
            }        
            System.out.println("");
            System.out.println("");
        }
    }

    public void posicionPiezas(String pieza1, String pieza2){
        

    }

    public String pieza(String color){
        String uno = color+"o";
        return uno;
    }

    public String pieza2(String color){
        String dos = color+"x";
        return dos;
    }

    public void asterisco(int valor){
        for(int i = 0; i< valor; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

}
