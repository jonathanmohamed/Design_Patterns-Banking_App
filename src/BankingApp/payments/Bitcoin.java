package BankingApp.payments;

public class Bitcoin implements CardPayment {
    private String btAddress;
    private String type;

    @Override
    public void makePayment(double money) {
        System.out.println("paid with card bitcoin: " + money);
    }
}
