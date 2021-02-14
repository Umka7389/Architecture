package adapter;

public class Main {
    public static void main(String[] args) {
        ReceivedPrices prices = new ReceivedPricesImpl("Price 200");
        ReceivedPriceAdapterToInvoice adapter = new ReceivedPriceAdapterToInvoiceImpl(prices);

        System.out.println("Price for invoice:" + adapter.getPriceForInvoice());

    }

}
