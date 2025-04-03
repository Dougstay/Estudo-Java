public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Bicicleta bike = new Bicicleta("Caloi", "Elite", 2023, true);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2020, 5000.0);

        // Testando Carro
        carro.acelerar();
        carro.frear();
        carro.abrirPorta();

        // Testando Bicicleta
        bike.acelerar();
        bike.frear();
        bike.ajustarSelim();

        // Testando Caminhão
        caminhao.acelerar();
        caminhao.frear();
        caminhao.carregar(6000.0);
    }
}
