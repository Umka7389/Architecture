package adapter;

public class ReceivedPricesImpl implements ReceivedPrices {

    String information;

    public ReceivedPricesImpl(String information) {
        this.information = information;
    }

    @Override
    public String getInformationFromExcelDoc() {
        //some logic here
        return information;
    }
}
