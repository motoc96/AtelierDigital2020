package lab9;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CH2 {
    @Test
    public void predicate1(){
        Predicate<String> p1 = s -> s.isEmpty();
        Predicate<String> notPredicate  = p1.negate();

        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("Not Empty!"));
    }

    @Test
    public void predicate2(){
        Predicate<String> p1 = s -> s != null;
        Predicate<String> p2 = s -> s.isEmpty();
        Predicate<String> p3 = null ;

        Assert.assertFalse(p3.test(""));
        Assert.assertFalse(p3.test(null));
        Assert.assertTrue(p3.test("Not Empty"));
    }
}
