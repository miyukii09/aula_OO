public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        String msg = String.format("A %s é um cachorro e faz Au Au", super.getNome());
        System.out.println(msg);
    }
    
    
    
}
