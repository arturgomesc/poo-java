import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.filme;

public class Principal {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.setDiretor("Copolla");
        meuFilme.setNome("The Godfather");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAlavaliacoes());
        System.out.println("Média de notas: " + meuFilme.pegaMedia());

        Serie theOffice = new Serie();
        theOffice.setNome("The Office");
        theOffice.setAnoDeLancamento(2005);
        theOffice.exibeFichaTecnica();
        theOffice.setTemporadas(9);
        theOffice.setAtiva(false);
        theOffice.setEpisodiosPorTemporada(28);
        theOffice.setMinutosPorEpisodio(22);
    }
}
