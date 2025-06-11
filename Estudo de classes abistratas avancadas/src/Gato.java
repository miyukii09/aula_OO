public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    } 

    @Override
    public void emitirSom() {
        String msg = String.format("A %s é um Gato e faz miau miau", super.getNome());
        System.out.println(msg);
    }
}
