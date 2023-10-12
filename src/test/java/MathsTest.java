package test.java;
import org.junit.*;
public class MathsTest {
    Maths maths;
    @Before
    public void setUpInstance() {
        maths = new Maths();
    }

    @Test
    public void checkThatTheSumOfTwoNumbersEqualsThree(){
        Assert.assertEquals(3, maths.addTwoNumbers(2,1));
    }

    @Test
    public void checkIfNumberIsPrime(){
        Assert.assertTrue(maths.checkPrime(13));
    }
}
