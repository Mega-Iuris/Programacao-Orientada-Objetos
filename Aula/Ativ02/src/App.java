import java.util.Scanner;

public class App {

    static final Scanner SC = new Scanner(System.in);
    static final boolean[][] MAPA_DO_BREATH = new boolean[4][4];

    public static void main(String[] args) {
        
        preencherValorFalse(); 

        int pontoHorizontal = SC.nextInt();
        int pontoVertical = SC.nextInt();
        posicaoJogador(pontoHorizontal, pontoVertical); 

        imprimirPosicaoMapa(); 
    }

    static void preencherValorFalse() {
        for (int i = 0; i < MAPA_DO_BREATH.length; i++) {
            for (int j = 0; j < MAPA_DO_BREATH[i].length; j++) { 
                MAPA_DO_BREATH[i][j] = false;
            }
        }
    }

    static void posicaoJogador(int linha, int coluna) {
        
        if (linha >= 0 && linha < MAPA_DO_BREATH.length && coluna >= 0 && coluna < MAPA_DO_BREATH.length) {
            MAPA_DO_BREATH[linha][coluna] = true; 
        } else {
            System.out.println("Coordenadas fora dos limites da matriz.");
        }
    }

    static void imprimirPosicaoMapa() {
       
        for (int i = 0; i < MAPA_DO_BREATH.length; i++) { 
       
            for (int j = 0; j < MAPA_DO_BREATH.length; j++) { 
       
                if (MAPA_DO_BREATH[i][j]) { 
                    System.out.print("|O");
                } else { 
                    System.out.print("|X");
                }
            }
            System.out.println("|"); 
        }
    }
}
