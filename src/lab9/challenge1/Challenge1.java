package lab9.challenge1;

import reactor.core.publisher.Flux;

public class Challenge1 {
    public Flux<String> emptyFlux(){
        return Flux.empty();
    }

    public Flux<String> fooBarFluxFromValues(){
        return Flux.just("foo", "bar");
    }

    public Flux<String> errorFlux(){
        return Flux.error(new IllegalStateException(""));
    }
}
