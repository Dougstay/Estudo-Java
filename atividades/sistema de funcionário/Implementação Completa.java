// Classe abstrata base para todos os funcionários
abstract class Funcionario {
    private String nome;
    private String matricula;
    
    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    // Método abstrato que todas as subclasses devem implementar
    public abstract double calcularSalario();
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
}

// Classe para funcionários em tempo integral
class FuncionarioTempoIntegral extends Funcionario {
    private double salarioMensal;
    private double bonusAnual;
    
    public FuncionarioTempoIntegral(String nome, String matricula, double salarioMensal, double bonusAnual) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
        this.bonusAnual = bonusAnual;
    }
    
    @Override
    public double calcularSalario() {
        return salarioMensal + (bonusAnual / 12);
    }
}

// Classe para funcionários em meio período
class FuncionarioMeioPeriodo extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;
    
    public FuncionarioMeioPeriodo(String nome, String matricula, double valorHora, int horasTrabalhadas) {
        super(nome, matricula);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}

// Classe para funcionários contratados
class FuncionarioContratado extends Funcionario {
    private double valorContrato;
    private int duracaoContratoMeses;
    
    public FuncionarioContratado(String nome, String matricula, double valorContrato, int duracaoContratoMeses) {
        super(nome, matricula);
        this.valorContrato = valorContrato;
        this.duracaoContratoMeses = duracaoContratoMeses;
    }
    
    @Override
    public double calcularSalario() {
        return valorContrato / duracaoContratoMeses;
    }
}

// Classe principal para demonstração
public class SistemaFuncionarios {
    public static void main(String[] args) {
        // Criando um array de funcionários
        Funcionario[] funcionarios = new Funcionario[3];
        
        // Instanciando diferentes tipos de funcionários
        funcionarios[0] = new FuncionarioTempoIntegral("João Silva", "FTI001", 5000.0, 6000.0);
        funcionarios[1] = new FuncionarioMeioPeriodo("Maria Souza", "FMP002", 50.0, 80);
        funcionarios[2] = new FuncionarioContratado("Carlos Oliveira", "FC003", 30000.0, 6);
        
        // Calculando e exibindo salários usando polimorfismo
        for (Funcionario func : funcionarios) {
            System.out.println("Funcionário: " + func.getNome() + 
                             " (" + func.getMatricula() + ")");
            System.out.println("Salário: R$ " + String.format("%.2f", func.calcularSalario()));
            System.out.println("----------------------");
        }
    }
}
