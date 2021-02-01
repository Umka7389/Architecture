package factory;

public class PostpaymentClient implements ClientPaymentTerms {

    int clientTypeID = 1;

    @Override
    public void sendPayment() {
        System.out.println("Оплатить полную сумму после поставки товара");
    }
}
