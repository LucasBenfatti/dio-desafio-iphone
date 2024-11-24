public class Iphone {
    public static void main(String[] args) {

        // Testando o Reprodutor Musical
        ReprodutorMusical reprodutor = new ReprodutorMp3();
        reprodutor.selecionarMusica("Bohemian Rhapsody");
        reprodutor.tocar();
        reprodutor.pausar();

        // Testando o Aparelho Telefônico
        AparelhoTelefonico telefone = new Smartphone();
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Testando o Navegador Internet
        NavegadorInternet navegador = new NavegadorBrave();
        navegador.exibirPagina("https://www.dio.me");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}

