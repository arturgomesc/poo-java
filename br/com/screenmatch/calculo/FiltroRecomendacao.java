package br.com.screenmatch.calculo;

public class FiltroRecomendacao {
    private String recomendacao;
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momentos!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliados");
        } else {
            System.out.println("Confira!");
        }
    }
}
