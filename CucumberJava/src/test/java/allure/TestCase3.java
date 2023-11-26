package allure;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class TestCase3 {

    @Test
    public void testMethod3(){
       throw new SkipException("This test will be skipped");
    }
}
