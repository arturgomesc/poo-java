package br.com.screenmatch.Principal;

import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;
import br.com.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("The Godfather", 1972);
        Filme outroFilme = new Filme("Close", 2022);
        var filmeDoArtur = new Filme("Spiderman: Into the Spiderverse", 2018);
        Serie theOffice = new Serie("The Office", 2005);
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoArtur);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(theOffice);
        for (Titulo item: lista) { //foreach
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: ");
        }
    }
}
