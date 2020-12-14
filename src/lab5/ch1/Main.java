package lab5.ch1;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        Ron ronValue = new Ron(20);
        EUR eurValue = new EUR(5);
        USD usdValue = new USD(6);

        USD newValue = exchangeDesk.exchange(ronValue,USD.class, (float)2.4);
        System.out.println("Exchange result" + newValue.getValue());

        EUR newValue1 = exchangeDesk.exchange(ronValue, EUR.class, ((float)(1/4.8)));
        System.out.println("Exchange result" + newValue1.getValue());

        EUR newValue2 = exchangeDesk.exchange(usdValue, EUR.class, ((float)(1/1.3)));
        System.out.println("Exchange result" + newValue2.getValue());
    }
}
