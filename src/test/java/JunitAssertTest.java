import org.junit.Assert;
import org.junit.RegexJava;
import org.junit.Test;

public class JunitAssertTest {

    @Test
    public void When_Given_Name_Is_Correct_ReturnTrue(){

        RegexJava obj = new RegexJava();
        boolean result=obj.firstName("Aditya");
        Assert.assertTrue(result);




    }
}
