import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class test13Test  {

    @Test
    public void sortedTest(){

        test13 test13_a = new test13();

        List<String> words = new ArrayList<>();
        List<String> alphabet = new ArrayList<>();


        words.add("cat");
        words.add("cap");
        words.add("bat");
        words.add("tab");
        //c,c,b,t - c,b,t
        //c,b,a,t
        //c,b,t
        //
        alphabet.add("c");
        alphabet.add("b");
        alphabet.add("a");
        alphabet.add("t");

        boolean result = test13_a.sortwords(words,alphabet);

        Assert.assertEquals(true,result);

    }

}