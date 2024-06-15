package exceptions;

public class PrecoInvalidoException extends Exception{
    public PrecoInvalidoException(){
        super("Preço não pode ser zero e nem negativo");
    }
}
