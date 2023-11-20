package sdet.allure;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class TestCase1 {
    private static final Logger logger = Logger.getLogger(TestCase1.class.getName());
    @Test
    public void testMethod1(){
        Assert.assertTrue(false);
        System.out.println("Test method 1 is not working as expected from sout");
        logger.info("Test method 1 is not working as expected from logger");
    }
}
