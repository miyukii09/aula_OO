public class BoletoBancario implements Pagamento{


    @Override
    public void pagar(double valor) {
        System.out.println(String.format("Pagamento de R$ %.2f realizado com Boleto Bancario !",valor));
    }

}
