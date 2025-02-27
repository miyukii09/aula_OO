import java.util.List;
import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Professor> lista;
    
    public FolhaPagamento()
    {
        lista = new ArrayList<>();
    }

    public ArrayList<Professor> getLista() {
        return lista;
    }
    
    public void contratarPorfessor(Professor objeto)
    {
        lista.add(objeto);
    }
    public void contratarPorfessor(String nome, int qtdAulas)
    {
        lista.add( new Professor(nome, qtdAulas));
    }
    public void demitirProfessor(int i)
    {
        lista.remove(i);
    }
    
    public double calcularSalarioTotal()
    {
        double total = 0;
        
        for (Professor objeto : lista)
        {
            total = total +objeto.getSalario();
        }
    }
}
