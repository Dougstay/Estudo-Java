public class Caminhao extends Veiculo {
    private double cargaMaxima;

    public Caminhao(String marca, String modelo, int ano, double cargaMaxima) {
        super(marca, modelo, ano);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void acelerar() {
        System.out.println("Caminhão acelerando lentamente devido ao peso.");
    }

    public void carregar(double peso) {
        if (peso <= cargaMaxima) {
            System.out.println("Carga de " + peso + " kg carregada.");
        } else {
            System.out.println("Carga excede a capacidade máxima!");
        }
    }
}
