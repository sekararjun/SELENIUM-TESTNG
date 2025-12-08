package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringAssertTest {
    @Test
    public void compareStrings() {
        String str1 = "Hello World";
        String str2 = "Hello World";

        Assert.assertEquals(str1, str2, "Strings are not equal!");
        System.out.println("Assertion Passed: Both strings are equal.");
    }
}