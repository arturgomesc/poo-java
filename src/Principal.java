public class Principal {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.nome = "The Godfather";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        System.out.println(meuFilme.somaDeAvaliacoes);
        System.out.println(meuFilme.totalDeAlavaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
