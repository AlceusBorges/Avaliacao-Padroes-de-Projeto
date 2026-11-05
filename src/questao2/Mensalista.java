package questao2;

public class Mensalista implements PerfilCobranca {
    public static final double VALOR_FIXO = 15.00;

    @Override
    public double calcular(int minutos) {
        return VALOR_FIXO;
    }

    @Override
    public String getNome() {
        return "Mensalista";
    }
}
