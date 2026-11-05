package questao1;

import java.util.ArrayList;
import java.util.List;

// Subject: guarda as áreas interessadas e avisa todas quando o estoque muda.
public class Produto {
    private String nome;
    private int quantidade;
    private List<AreaInteressada> areas = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void adicionarArea(AreaInteressada area) {
        areas.add(area);
    }

    public void removerArea(AreaInteressada area) {
        areas.remove(area);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade == quantidade) {
            return; // RQ1.4: só avisa se a quantidade realmente mudou
        }
        int anterior = quantidade;
        quantidade = novaQuantidade;
        notificarAreas(anterior);
    }

    private void notificarAreas(int anterior) {
        for (AreaInteressada area : areas) {
            area.atualizar(nome, anterior, quantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
