package factory;

public class PrepaymentClient implements ClientPaymentTerms {

    int clientTypeID = 2;

    @Override
    public void sendPayment() {
        System.out.println("Оплатить аванс до поставки товара");
    }
}
