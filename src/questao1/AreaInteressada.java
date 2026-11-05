package questao1;

// Observer: toda área que quer ser avisada sobre o estoque implementa esta interface.
public interface AreaInteressada {
    void atualizar(String produto, int quantidadeAnterior, int novaQuantidade);
}
