package BankingApp.payments;

public class Card implements CardPayment {
    private String IBAN;
    private String type;

    @Override
    public void makePayment(double money) {
        System.out.println("paid with card amount: " + money);
    }
}
