// Classe abstrata base para todas as formas geométricas
abstract class FormaGeometrica {
    // Método abstrato que todas as subclasses devem implementar
    public abstract double calcularArea();
}

// Classe para círculos
class Circulo extends FormaGeometrica {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Classe para quadrados
class Quadrado extends FormaGeometrica {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// Classe para triângulos
class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// Classe principal para demonstração
public class Main {
    public static void main(String[] args) {
        // Criando um array de formas geométricas
        FormaGeometrica[] formas = new FormaGeometrica[3];
        
        // Instanciando diferentes formas
        formas[0] = new Circulo(5.0);
        formas[1] = new Quadrado(4.0);
        formas[2] = new Triangulo(3.0, 6.0);
        
        // Calculando e exibindo áreas usando polimorfismo
        for (FormaGeometrica forma : formas) {
            System.out.println("Área da forma: " + forma.calcularArea());
        }
    }
}
