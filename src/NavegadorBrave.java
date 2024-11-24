public class NavegadorBrave implements NavegadorInternet {
    private int numeroAbas = 0;

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        numeroAbas++;
        System.out.println("Abrindo uma nova aba. Total de abas abertas: " + numeroAbas);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}