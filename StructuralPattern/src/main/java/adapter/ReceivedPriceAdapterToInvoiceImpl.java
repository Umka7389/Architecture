package adapter;

public class ReceivedPriceAdapterToInvoiceImpl implements ReceivedPriceAdapterToInvoice {
    ReceivedPrices receivedPrices;

    public ReceivedPriceAdapterToInvoiceImpl(ReceivedPrices receivedPrices) {
        this.receivedPrices = receivedPrices;
    }

    @Override
    public Double getPriceForInvoice() {
        return convertReceivedPriceToInvoice(receivedPrices.getInformationFromExcelDoc());
    }

    public Double convertReceivedPriceToInvoice (String receivedDocPrice) {
        String[] inputArray = receivedDocPrice.split(" ");
        return Double.parseDouble(inputArray[1]);
    }
}
