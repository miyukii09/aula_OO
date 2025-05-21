public class Principal {
    
    public static void main(String[] args) {
        Funcionarios maria = new Funcionarios();
        
        maria.setNome("Maria");
        maria.setQtddeHoras(8);
        maria.setValorHora(40);
        
        System.out.println("Salario: " + maria.getSalario());
    }
    
}
