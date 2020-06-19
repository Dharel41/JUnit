import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Algorithm_test {

    Algorithm test;
    @Before
    public  void init(){
        test=new Algorithm();
    }

    @Test
    public void factorialDigitSumOfZero(){
        Assert.assertEquals(1,test.factorialDigitSum(0));
    }
    @Test(expected = ArithmeticException.class)
    public void factorialDigitSumOfNegativeNumbers(){
        test.factorialDigitSum(-22);
    }
    @Test
    public void factorialDigitSumOfOne(){
        Assert.assertEquals(1,test.factorialDigitSum(1));
    }
    @Test
    public void factorialDigitSumOfSmallNumber(){
        Assert.assertEquals(9,test.factorialDigitSum(7));
    }
    @Test
    public void factorialDigitSumOfSmallNumber2(){
        Assert.assertEquals(45,test.factorialDigitSum(15));
    }
    @Test
    public void factorialDigitSumOfBigNumber(){
        Assert.assertEquals(432,test.factorialDigitSum(75));
    }
    @Test
    public void factorialDigitSumOfBigNumber2(){
        Assert.assertEquals(3123,test.factorialDigitSum(352));
    }
    @Test
    public void factorialDigitSumOfBigNumber3(){
        Assert.assertEquals(10539,test.factorialDigitSum(999));
    }
}
