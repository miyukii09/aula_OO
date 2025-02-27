import java.util.List;
import java.util.ArrayList;

public class Principal 
{
    public static void main(String[] args) {
        Professor objeto1, objeto2;
        
       objeto1 = new Professor();
       
       objeto1.setNome("Guilherme");
       objeto1.setQuantidadeAulas(10);
       objeto1.calcularSalario();
       
       //System.out.println(objeto1);
       
       objeto2 = new Professor( "Nidia", 20);
       objeto2.calcularSalario();
       //System.out.println(objeto2);
       
       List<Professor> lista = new ArrayList<Professor>();
       lista.add(objeto1);
       lista.add(objeto2);
       lista.add(new Professor("luis",30) );
       
        System.out.println("Exibindo os Professores da lista");
        
        for (int i = 0; i < lista.size(); i++)
        {
            lista.get(i).calcularSalario();
            System.out.println("");
            System.out.println(lista.get(i) );
        }
        
        double total = 0;
        for (Professor objeto : lista)
        {
            total = total + objeto.getSalario();
        }
        System.out.println("O tital do salario é " + total );
    }
}
