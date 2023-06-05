package br.com.screenmatch.Principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("The Godfather", 1972);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Close", 2022);
        outroFilme.avalia(8);
        var filmeDoArtur = new Filme("Spiderman: Into the Spiderverse", 2018);
        filmeDoArtur.avalia(9);
        Serie theOffice = new Serie("The Office", 2005);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoArtur);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(theOffice);
        for (Titulo item: lista) { //foreach
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Michael Cera");
        buscaPorArtista.add("Jonah Hill");
        buscaPorArtista.add("John Krasinski");
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }
}
