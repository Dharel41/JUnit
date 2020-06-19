import java.math.BigInteger;

public class Algorithm {

    public int factorialDigitSum(int n){
        BigInteger factorial=new BigInteger("1");
        int sum=0;

        if(n<0){
            throw new ArithmeticException("factorial is only applicable to natural numbers");
        }

        while(n>0){
            factorial=factorial.multiply(new BigInteger(Integer.toString(n)));
            n--;
        }

        while(factorial.compareTo(new BigInteger("0")) == 1){
            sum+=(factorial.remainder(new BigInteger("10"))).intValue();
            factorial=factorial.divide(new BigInteger("10"));
        }
        return sum;
    }
}
