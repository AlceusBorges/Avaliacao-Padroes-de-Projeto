package questao1;

public class Main {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        teclado.adicionarArea(compras);
        teclado.adicionarArea(vendas);
        teclado.adicionarArea(auditoria);

        System.out.println("Estoque 10 -> 4");
        teclado.setQuantidade(4);

        System.out.println("Estoque 4 -> 4 (sem mudança, ninguém é avisado)");
        teclado.setQuantidade(4);

        System.out.println("Estoque 4 -> 0");
        teclado.setQuantidade(0);

        System.out.println("Estoque 0 -> 8");
        teclado.setQuantidade(8);

        System.out.println("Removendo a área de Compras...");
        teclado.removerArea(compras);

        System.out.println("Estoque 8 -> 2 (Compras não recebe mais)");
        teclado.setQuantidade(2);
    }
}
