public abstract class Animal{
    private String nome;
    
    public Animal(){
        nome = "";
    }
    
    public Animal(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirDados(){
        String msg =String.format("Este %s é um animal", nome.toUpperCase());
        System.out.print(msg);
    }
    
    public abstract void emitirSom();
    
    
}
