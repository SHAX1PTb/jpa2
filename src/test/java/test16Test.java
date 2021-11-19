import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class test16Test  {

    @Test
    public void testRecur(){

        test16 test16 = new test16();

        Integer numb = test16.Recurssion(4);

        Assert.assertEquals(20, java.util.Optional.ofNullable(numb));

    }

}