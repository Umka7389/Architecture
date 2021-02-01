package factory;

public class Main {
    public static void main(String[] args) {

        ClientFactory factory = new ClientFactory();
        ClientPaymentTerms postpaymentClient = factory.getClientByPaymentTerms(1);
        ClientPaymentTerms prepaymentClient = factory.getClientByPaymentTerms(2);

        postpaymentClient.sendPayment();
        prepaymentClient.sendPayment();

    }
}
