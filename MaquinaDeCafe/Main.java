import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        int[] AAA = new int[3];
        AAA[0] = entrada.nextInt();
        AAA[1] = entrada.nextInt();
        AAA[2] = entrada.nextInt();
        int posiRelevante = 0, i=0;
        int[] somaTempoDeCafe = new int[3];

        
        for(i=0; i<3; i++){
            int aux = (Math.abs(posiRelevante-i))*2;
            somaTempoDeCafe[0] += AAA[i]*aux;
        }
        posiRelevante++;
        for(i=0; i<3; i++){
            int aux = (Math.abs(posiRelevante-i))*2;
            somaTempoDeCafe[1] += AAA[i]*aux;
        }
        posiRelevante++;
        for(i=0; i<3; i++){
            int aux = (Math.abs(posiRelevante-i))*2;
            somaTempoDeCafe[2] += AAA[i]*aux;
        }
        
        System.out.println( Math.min(somaTempoDeCafe[0], Math.min(somaTempoDeCafe[1], somaTempoDeCafe[2])) );
 
    }
 
}