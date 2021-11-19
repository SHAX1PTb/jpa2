import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class test12Test   {

    @Test
    public void sum(){

        AbstractList abstractList = new AbstractList() {
            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(10);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(2);

        test12 test12 = new test12();

        Integer sum = test12.sumMethod(a);
    System.out.println();

        Assert.assertEquals(java.util.Optional.of(19),sum);

    }

}