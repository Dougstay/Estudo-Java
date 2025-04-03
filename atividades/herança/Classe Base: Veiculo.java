public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("Veículo acelerando...");
    }

    public void frear() {
        System.out.println("Veículo freando...");
    }
}
