package TestSample;
import org.testng.annotations.Test;

public class Sample {

    @Test(groups = {"Sanity"}, priority = 1)
    public void sanityTest1() {
        System.out.println("Sanity Test 1 executed");
    }

    @Test(groups = {"Sanity"}, priority = 2)
    public void sanityTest2() {
        System.out.println("Sanity Test 2 executed");
    }

    @Test(groups = {"Regression"}, priority = 1)
    public void regressionTest1() {
        System.out.println("Regression Test 1 executed");
    }

    @Test(groups = {"Regression"}, priority = 2)
    public void regressionTest2() {
        System.out.println("Regression Test 2 executed");
    }

    @Test(groups = {"EndToEnd"}, priority = 1)
    public void endToEndTest1() {
        System.out.println("End-to-End Test 1 executed");
    }

    @Test(groups = {"EndToEnd"}, priority = 2)
    public void endToEndTest2() {
        System.out.println("End-to-End Test 2 executed");
    }
}