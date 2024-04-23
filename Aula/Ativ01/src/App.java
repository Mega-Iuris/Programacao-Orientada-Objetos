import java.util.Scanner;

public class App {

    static final int[] NUMEROS = new int[10];
    static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        preencherVetor();

        int numBuscado = SC.nextInt();

        boolean numEncontrado = buscarNumero(numBuscado);

        if (numEncontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
    }

    public static void preencherVetor() {

        for (int i = 0; i < NUMEROS.length; i++) {
            NUMEROS[i] = SC.nextInt();
        }
    }

    public static boolean buscarNumero(int valor) {

        for (int i = 0; i < NUMEROS.length; i++) {
            if (NUMEROS[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
