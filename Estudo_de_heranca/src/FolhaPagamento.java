import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
    private List<Funcionario> funcionarios;

    public FolhaPagamento() {
        funcionarios = new ArrayList<>();
    }

    public List<Funcionario> getFuncionario() {
        return funcionarios;
    }
    
    public void adicionarFuncionario (Funcionario novo){
        funcionarios.add(novo);
    }
    
    public double calcularValorTotal(){
        double total = 0;
        
        for (Funcionario funcionario: funcionarios){
            total = total + funcionario.calcularSalario();
        }
        return total;
    }
    
}
