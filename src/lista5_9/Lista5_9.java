package lista5_9;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista5_9 {
    public static void main(String[] args) {
        final int TAM = 5;
        final int LIMITECIMA = 100;
        int vet[] = new int [TAM];
        int cont=0, cont2=0;
        for(int x=0; x < TAM; x++){
            do{
                cont=0;
                cont2=0;
                vet[x] = (int) (Math.random() * (LIMITECIMA+1));
                for(int y=1; y <= vet[x]; y++){
                    if(vet[x] % y == 0){
                        cont++;
                    }
                }
            }while(cont != 2);
        }
        JOptionPane.showMessageDialog(null, "Vetor: " +Arrays.toString(vet));
    }    
}
