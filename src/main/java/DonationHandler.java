public class DonationHandler {
    DonationHandler nextHandler;

    public DonationHandler() {}

    public DonationHandler setNext(DonationHandler donationHandler) {
        this.nextHandler = donationHandler;
        return nextHandler;
    }

    public void match(Client client) {
        if (this.nextHandler != null)
            this.nextHandler.match(client);
        else
            System.out.println("We are sorry but we didn't find a cat for you. Please come back in a few days.");
    }
}
