public class Texte {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex");
        dog.exibirDados();
        dog.emitirSom();
        
        Gato gat = new Gato("Wolley");
        gat.exibirDados();
        gat.emitirSom();
        
        Vaca vc = new Vaca("Betina");
        vc.exibirDados();
        vc.emitirSom();
    }
}
