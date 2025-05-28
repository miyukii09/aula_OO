public class CartaoCredito implements Pagamento {
    
    @Override
    public void pagar(double valor) {
        System.out.println(String.format("Pagamento de R$ %.2f realizado com cartão de crédito !",valor));
    }
}
