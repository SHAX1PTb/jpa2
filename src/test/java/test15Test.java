import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class test15Test  {

    @Test
    public void testName(){

        test15 test15 = new test15();
String name = "shankar";

    Assert.assertEquals("raknahs",test15.ReverseName(name));
    }

}