import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest  {
    @Test
    public void shouldReturn1WhenInputIs1(){
        String result=FizzBuzzConverter.convert(3);
        Assert.assertEquals("Fizz",result);
    }

}