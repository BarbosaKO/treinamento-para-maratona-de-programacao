//Formula1
import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner txt = new Scanner(System.in);
		int g,p,s,k;
		String saida = new String();
		//int aux = 1, auxb=0;
		while(true){
			//COMEÇO DAS ENTRADAS
			g = txt.nextInt();	//número de Grandes Prêmios
			p = txt.nextInt();	//número de pilotos
			if(g==0 && p==0){
				break;
			}
			int[][] GP = new int[g][p];		//Matriz pra guardar posicao de chegada de cada piloto, em cada GP
			//Entrada da posicao de chegada de cada piloto, em cada GP
			for(int h=0; h<g; h++){
				for(int i=0; i<p; i++){
					GP[h][i] = txt.nextInt();
				}
			}
			
			s = txt.nextInt();	//numero de sistemas de pontuação
			for(int h=0; h<s; h++){
				k = txt.nextInt();	//Numero de ganhadores no pódio
				int[] pilotos = new int[p];	//Matriz para guardar a pontuação de cada piloto, para cada pontuação
				int[] SP = new int[p];	//Matriz Sistema de Pontuação
				
				for(int i=0; i<p; i++){
					if(i>=k){
						SP[i] = 0;
					}else{
						SP[i] = txt.nextInt();	//Popula a matriz SP
					}
				}
				for(int m=0; m<g; m++){
					for(int n=0; n<p; n++){
						pilotos[n] += SP[(GP[m][n])-1]; //Para cada SP, realizamos o somatorio dos pontos de cada piloto	COM ERROS
					}
				}
				
				int maior = Arrays.stream(pilotos).max().getAsInt();	// pega a maior pontuação entre os pilotos, em cada SP
				for(int x=0,flag=0; x<p; x++){
					if(pilotos[x]==maior){
						if(flag==0){
							saida += (x+1);
							flag = 1;
						}else{
							saida += " " + (x+1);
						}
					}
				}
				saida += "\n";
				
			}
			//FIM DO WHILE
		}
		System.out.print(saida);
		//*********************FIM DO MAIN***************************
    }
 
}