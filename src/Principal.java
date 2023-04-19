import br.com.screenmatch.modelos.filme;

public class Principal {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.setNome("The Godfather");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        System.out.println(meuFilme.getTotalDeAlavaliacoes());
        System.out.println(meuFilme.getTotalDeAlavaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
