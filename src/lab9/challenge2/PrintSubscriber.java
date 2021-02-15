package lab9.challenge2;


import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class PrintSubscriber<String> implements Subscriber<String> {

    @Override
    public void onSubscribe(Subscription subscription) {
        subscription.request(1);
    }

    @Override
    public void onNext(String string) {
        System.out.println(string);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable);
    }

    @Override
    public void onComplete() {
        System.out.println("completed");
    }
}
