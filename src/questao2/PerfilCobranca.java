package questao2;

// Strategy: cada perfil é uma forma diferente de calcular o valor.
public interface PerfilCobranca {
    double calcular(int minutos);

    String getNome();
}
