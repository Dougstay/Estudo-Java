public class Bicicleta extends Veiculo {
    private boolean hasBasket;

    public Bicicleta(String marca, String modelo, int ano, boolean hasBasket) {
        super(marca, modelo, ano);
        this.hasBasket = hasBasket;
    }

    @Override
    public void acelerar() {
        System.out.println("Bicicleta acelerando com pedaladas!");
    }

    public void ajustarSelim() {
        System.out.println("Ajustando altura do selim.");
    }
}
