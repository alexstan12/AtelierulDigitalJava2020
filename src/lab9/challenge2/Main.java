package lab9.challenge2;


import org.reactivestreams.Subscriber;

public class Main {
    public static void main(String[] args) {
        Challenge2 ch2 = new Challenge2();
        Subscriber subscriber = new PrintSubscriber<String>();
        ch2.emptyMono().subscribe(subscriber);
        ch2.monoWithNoSignal().subscribe(subscriber);
        ch2.fooMono().subscribe(subscriber);
        ch2.errorMono().subscribe(subscriber);

    }
}
