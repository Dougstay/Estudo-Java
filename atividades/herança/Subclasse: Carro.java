public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando rapidamente!");
    }

    public void abrirPorta() {
        System.out.println("Abrindo porta do carro.");
    }
}
