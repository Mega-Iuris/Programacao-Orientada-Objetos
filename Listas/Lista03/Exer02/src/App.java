import java.util.Scanner;

public class App {

    private static final int QUANTID_CRITICOS = 3;
    private static int[] notas = new int[QUANTID_CRITICOS];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
       
        receberNotas();
        int mediaFilmes = calcularMedia(notas);
        
        System.out.println(mediaFilmes);
    }

    public static void receberNotas(){
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
        } 
    }

    public static int calcularMedia( int[] notas){
        
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];

        }
        return soma / notas.length;
    }

}
