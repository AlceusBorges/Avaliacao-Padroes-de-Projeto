package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 150; // 2h30

        System.out.println("Mesmo tempo (" + minutos + " min) nos três perfis:");
        PerfilCobranca[] perfis = { new Rotativo(), new Mensalista(), new Conveniado() };
        for (PerfilCobranca perfil : perfis) {
            Tiquete t = new Tiquete("ABC1D23", minutos, perfil);
            imprimir(t);
        }

        System.out.println();
        System.out.println("Troca de perfil no mesmo tíquete:");
        Tiquete tiquete = new Tiquete("XYZ9F87", 95, new Rotativo());
        imprimir(tiquete);

        tiquete.setPerfil(new Conveniado());
        imprimir(tiquete);

        tiquete.setPerfil(new Mensalista());
        imprimir(tiquete);
    }

    private static void imprimir(Tiquete t) {
        System.out.printf("  %s | %d min | %-10s | R$ %.2f%n",
                t.getPlaca(), t.getMinutos(), t.getPerfil().getNome(), t.calcularValor());
    }
}
