public class filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDeAvaliacoes;
    int totalDeAlavaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDeAvaliacoes += nota;
        totalDeAlavaliacoes++;
    }

    double pegaMedia() {
        return somaDeAvaliacoes / totalDeAlavaliacoes;
    }
}
