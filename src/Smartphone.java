public class Smartphone implements AparelhoTelefonico {
    private String numeroLigacao;

    @Override
    public void ligar(String numero) {
        this.numeroLigacao = numero;
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        if (numeroLigacao != null) {
            System.out.println("Atendendo a ligação de: " + numeroLigacao);
        } else {
            System.out.println("Nenhuma ligação para atender.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}