package questao2;

// Context: o tíquete delega o cálculo para o perfil que estiver configurado.
public class Tiquete {
    private String placa;
    private int minutos;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutos, PerfilCobranca perfil) {
        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public void setPerfil(PerfilCobranca perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcular(minutos);
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }

    public PerfilCobranca getPerfil() {
        return perfil;
    }
}
