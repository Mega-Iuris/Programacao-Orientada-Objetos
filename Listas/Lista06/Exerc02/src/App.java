import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        Gato gato = new Gato("Mimi", "Siamês");
        System.out.println(gato.miado());
        System.out.println(gato.comer());

        System.out.println();

        Cachorro cachorro = new Cachorro("Rex", "Labrador");
        System.out.println(cachorro.latido());
        System.out.println(cachorro.comer());

        System.out.println();
    }
}
