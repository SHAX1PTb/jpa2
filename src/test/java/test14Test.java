import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class test14Test  {

    @Test
    public void testAnagram(){

        String input1 = "CAT";
        String input2 = "TAC";

        test14 test14 = new test14();

        Assert.assertEquals(false,test14.anagram(input1,input2));

    }

}