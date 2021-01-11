package lab8.predicate;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class Producer {

    @Test
    public void predicate1(){
        Predicate<String> p1 = s->s.isEmpty();
        Predicate<String> notPredicate = p1.negate();
        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("dsadss"));
    }

    @Test
    public void predicate2(){
        Predicate<String> p1 = s-> s!=null ;
        Predicate<String> p2 = s -> !s.isEmpty();

        Predicate<String> p3 = p1.and(p2);
        Assert.assertFalse(p3.test(""));
        Assert.assertFalse(p3.test(null));
        Assert.assertTrue(p3.test("sdasd"));

    }
}
