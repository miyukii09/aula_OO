public class main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Vaca vaca         = new Vaca();
        Gato gato         = new Gato();
        
        cachorro.setNome("cachorro");
        cachorro.getNome();
        cachorro.EmitirSon();
        
        gato.setNome("gato");
        gato.EmitirSon();
        
        vaca.setNome("vaca");
        vaca.EmitirSon();
    }
    
}
