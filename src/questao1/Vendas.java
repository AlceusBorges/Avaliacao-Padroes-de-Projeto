package questao1;

public class Vendas implements AreaInteressada {

    @Override
    public void atualizar(String produto, int quantidadeAnterior, int novaQuantidade) {
        if (quantidadeAnterior == 0 && novaQuantidade > 0) {
            System.out.println("  [Vendas] ALERTA: " + produto + " voltou a ter estoque (" + novaQuantidade + " un.)");
        }
    }
}
