import br.com.screenmatch.calculo.CalculadoraDeTempo;
import br.com.screenmatch.calculo.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodios;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.filme;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        filme meuFilme = new filme("The Godfather", 1972);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8.5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAlavaliacoes());
        System.out.println("Média de notas: " + meuFilme.pegaMedia());

        Serie theOffice = new Serie("The Office", 2005);
        theOffice.exibeFichaTecnica();
        theOffice.setTemporadas(9);
        theOffice.setEpisodiosPorTemporada(28);
        theOffice.setMinutosPorEpisodio(22);
        System.out.println("Duração total da série: " + theOffice.getDuracaoEmMinutos());

        filme outroFilme = new filme("Close", 2022);
        outroFilme.setDuracaoEmMinutos(110);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(theOffice);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(theOffice);
        episodios.setTotalVisualizacoes(300);
        filtro.filtra(episodios);

        var filmeDoArtur = new filme("Spiderman: Into the Spiderverse", 2018);
        filmeDoArtur.setDuracaoEmMinutos(100);
        filmeDoArtur.avalia(10);

        ArrayList<filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoArtur);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}
