package allure;

import org.junit.Assert;
//import org.junit.Test;
import org.testng.annotations.Test;
import java.util.logging.Logger;

public class TestCase2 {
    private static final Logger logger = Logger.getLogger(TestCase2.class.getName());
    @Test
    public void testMethod2(){
        Assert.assertTrue(true);
        System.out.println("Test method 2 is working as expected from sout");
        logger.info("Test method 2 is working as expected from logger");
    }
}
