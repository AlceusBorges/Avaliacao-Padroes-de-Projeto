package questao2;

public class Conveniado implements PerfilCobranca {
    public static final int MINUTOS_GRATUITOS = 30;
    public static final double VALOR_HORA = 8.00;
    public static final double PERCENTUAL_DESCONTO = 0.25; // 25%

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATUITOS);
        int horasIniciadas = (int) Math.ceil(minutosCobrados / 60.0);
        return horasIniciadas * VALOR_HORA * (1 - PERCENTUAL_DESCONTO);
    }

    @Override
    public String getNome() {
        return "Conveniado";
    }
}
