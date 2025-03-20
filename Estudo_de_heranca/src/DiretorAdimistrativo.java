public class DiretorAdimistrativo extends Funcionario{
    
    public DiretorAdimistrativo()
    {
        
    }

    public DiretorAdimistrativo(int matricula, String nome) {
        super(matricula, nome);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.5 ;
    }

    @Override
    public String toString() {
        return "Diretor Adimistrativo"; 
    }
    
    
}
