import java.util.Scanner;

public class App {

    private static int QUANT_PERGUNTAS = 3;
    private static String[] RESPOSTAS = new String[QUANT_PERGUNTAS];
    private static String[] GABARITO = new String[QUANT_PERGUNTAS];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nomeParticipante = receberNome();
        iniciarQuiz(nomeParticipante);
        fazerPerguntas(nomeParticipante);
        mostrarResultado(nomeParticipante);
        agradecerParticipacao(nomeParticipante);
    }

    public static String receberNome() {
        System.out.println(
                """
                    Olá, vamos nos divertir com um quiz!
                    Digite seu nome para comecar:

                """
        );
        String nome = sc.nextLine();
        return formatarNome(nome);

    }

    public static String formatarNome(String nome){
        
        String primeiraLetraDoNome = String.valueOf(nome.charAt(0));
        String nomeSemInicial = nome.substring(1);
        String nomeFormatado = primeiraLetraDoNome.toUpperCase() + nomeSemInicial.toLowerCase();

        return nomeFormatado;
    }

    public static void iniciarQuiz(String nomeParticipante) {
        System.out.println(String.format(
                """
                    Olá, %s! Vamos começar.
                    Mas antes, preciso te explicar uma coisa!
                    Se a letra da alternativa envida for diferente das disponíveis,
                    também será considerado errado.

                    Tecle ENTER para começar!

                """,
                nomeParticipante
            ));

        sc.nextLine();
    }

    public static void fazerPerguntas(String nome) {

        String resposta = "";

        do {
            System.out.println(String.format(
                    """
                        Pergunta 1: Qual foi o primeiro filme do Universo Cinematográfico Marvel?

                        a) Homem de Ferro
                        b) Capitão América
                        c) Thor
                        d) O Incrível Hulk
                    
                    """
            ));

            resposta = sc.nextLine();

        } while (!ehUmaRespostaValida(resposta));

        GABARITO[0] = "a";
        RESPOSTAS[0] = resposta;
        
        do {
            System.out.println(String.format(
                    """
                        Pergunta 2: Quem é o criador da série "Game of Thrones"?

                        a) J.R.R. Tolkien
                        b) J.K. Rowling
                        c) George R. R. Martin
                        d) Stephen King
                    
                    """
            ));

            resposta = sc.nextLine();

        } while (!ehUmaRespostaValida(resposta));

        GABARITO[1] = "c";
        RESPOSTAS[1] = resposta;
        
        do {
            System.out.println(String.format(
                    """
                        Pergunta 3: Qual é o nome da princesa no filme "Frozen"?

                        a) Anna
                        b) Elsa
                        c) Rapunzel
                        d) Bela
                    """
            ));

            resposta = sc.nextLine();

        } while (!ehUmaRespostaValida(resposta));

        GABARITO[2] = "b";
        RESPOSTAS[2] = resposta;
    }

    public static boolean ehUmaRespostaValida(String resposta) {
        if (resposta.isBlank()) {
            System.out.println(
                """
                    Sua resposta não pode ser vazia!
                    Vamos enviar a pergunta novamente
                """
            );

            return false;
        }
        return true;
    }

    public static void mostrarResultado(String nomeParticipante){
        System.out.println(String.format(
            """
            %s, vamos ver se você foi bem no quiz!
            Veja quais perguntas você acertou:        
            """,

            nomeParticipante
        ));

        for (int i = 0; i < QUANT_PERGUNTAS; i++) {
            System.out.println(String.format(
                "%s - %s",
                (i + 1),
                RESPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "ACERTOU!" : "ERROU!"
                
            ));
        }
    }

    public static void agradecerParticipacao(String nome){
        System.out.println(String.format(
            """
                    %s, muito obrigado por participar do nosso Quiz!
                    """, 
                    nome
        ));
    }
}
