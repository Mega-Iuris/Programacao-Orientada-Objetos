package exceptions;

public class NomeInvalidoException extends Exception{
    public NomeInvalidoException(){
        super("Nome do produto precisa ter mais de 3 letras");
    }

}
