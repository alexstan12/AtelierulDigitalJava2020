package lab9.example;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class Main {
    public static void fluxPublishOn(){
        Scheduler scheduler = Schedulers.newParallel("t2", 4);
        final Flux<String> flux = Flux.range(1,7).map( i ->{
            System.out.println("map1 " + Thread.currentThread().getName());
            return 10 + i;
        }).publishOn(scheduler).map( i->{
            System.out.println("map1 " + Thread.currentThread().getName());
            return "value " + i;
        });

        new Thread(() -> flux.subscribe(System.out::println), "t1").start();
    }

    public static void main(String[] args) {
        fluxPublishOn();
    }
}
