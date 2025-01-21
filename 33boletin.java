package 33boletin;

import java.util.Random;

public class 33boletin {

    public static void main(String[] args) {
     
        final int REPETICIONES = 1_000;
        
        int ganancias = 0;
        
        for (int i = 0; i < REPETICIONES; i++) {
            ganancias += partida();
        }
        
        System.out.println("Ganancias: " + ganancias);
    }
    
    public static int partida(){
        final int GANANCIAS = 10;
        int caras = 0; 
        int cruces = 0;
                
        do{
            if (esCara())
                caras++;
            else
                cruces++;
        
        } while(caras < cruces + 3);
        
        return GANANCIAS - (caras + cruces);
}

    public static Random random = new Random();// Importar como en el Scaner 

    public static boolean esCara() {

        return random.nextBoolean();

    }

}
       