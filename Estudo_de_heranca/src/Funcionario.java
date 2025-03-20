public class Funcionario {
    // Criando 
    private int matricula;
    private String nome;

    // Criando costrutor sem parametos
    public Funcionario() {
    }
    
        public Funcionario(int matricula, String nome) {
            this.matricula = matricula;
            this.nome = nome;
        }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario" ;
    }
    
    public double calcularSalario()
    {
        return 2000.00;
    }
    
    
    
}
