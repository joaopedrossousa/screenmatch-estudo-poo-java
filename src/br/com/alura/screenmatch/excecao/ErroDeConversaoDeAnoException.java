package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String messagem) {
        this.mensagem = messagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
