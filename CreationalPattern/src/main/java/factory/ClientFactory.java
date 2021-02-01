package factory;

public class ClientFactory {

    public ClientPaymentTerms getClientByPaymentTerms(int clientType) {
        ClientPaymentTerms toReturn;

        switch (clientType) {
            case 1:
                toReturn = new PostpaymentClient();
                break;
            case 2:
                toReturn = new PrepaymentClient();
                break;
            default:
                throw new IllegalArgumentException("Wrong client type:" + clientType);
        }
        return toReturn;
    }

}

