package questao3;

public class Calda extends Complemento {
    public Calda(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNome() {
        return "Calda de chocolate";
    }

    @Override
    protected double getValor() {
        return 2.50;
    }
}
