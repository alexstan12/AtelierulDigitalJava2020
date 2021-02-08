package lab9;
import reactor.core.publisher.Flux;

public class Ch1 {
    public static void main(String[] args) {
        Flux.range(1,7).subscribe(System.out::println);
    }

}
