package questao1;

public class Auditoria implements AreaInteressada {

    @Override
    public void atualizar(String produto, int quantidadeAnterior, int novaQuantidade) {
        System.out.println("  [Auditoria] " + produto + ": " + quantidadeAnterior + " -> " + novaQuantidade);
    }
}
