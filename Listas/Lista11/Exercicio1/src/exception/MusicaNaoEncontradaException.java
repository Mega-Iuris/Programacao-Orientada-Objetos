package exception;

public class MusicaNaoEncontradaException extends Exception{
    public MusicaNaoEncontradaException(String message) {
        super(message = "Musica não encontrada");
    }
}
