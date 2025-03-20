public class Professores extends Funcionario{
    private int quantidadeAula;
    private double valorHoraAula;
    
    public Professores()
    {
        quantidadeAula = 0;
        valorHoraAula  = 0;
    }

    public Professores(int quantidadeAula, double valorHoraAula, int matricula, String nome) {
        super(matricula, nome);
        
        this.quantidadeAula = quantidadeAula;
        this.valorHoraAula  = valorHoraAula;
    }

    public int getQuantidadeAula() {
        return quantidadeAula;
    }

    public void setQuantidadeAula(int quantidadeAula) {
        this.quantidadeAula = quantidadeAula;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public double calcularSalario() {
        return quantidadeAula * valorHoraAula * 4.5;
    }

    @Override
    public String toString() {
        return "progessor";
    }
    
    
    
    
    
}
