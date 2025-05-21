public class Funcionarios implements Salarios{
    
    private String nome;
    private int qtddeHoras;
    private double valorHora;
    private double salario;
    
    public Funcionarios(){
        nome       = "";
        qtddeHoras = 0;
        valorHora  = salario =0;
    }

    public Funcionarios(String nome, int qtddeHoras, double valorHora) {
        this.nome = nome;
        this.qtddeHoras = qtddeHoras;
        this.valorHora = valorHora;
        this.salario = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtddeHoras() {
        return qtddeHoras;
    }

    public void setQtddeHoras(int qtddeHoras) {
        this.qtddeHoras = qtddeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        salario = calcularSalario();
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
       return qtddeHoras * valorHora;
    }

    @Override
    public double reajustarSalario(double salarioAtual) {
        return salarioAtual * 1.10;
    }
    
}
