import org.junit.Assert;
import org.junit.RegexJava;
import org.junit.Test;

public class JunitAssertTest {

    @Test
    public void When_Given_Name_Is_Correct_ReturnTrue() {

        RegexJava obj = new RegexJava();
        boolean result = obj.firstName("Aditya");
        Assert.assertTrue(result);


    }

    @Test
    public void When_Given_LastName_Is_Correct_ReturnTrue(){
        RegexJava obj = new RegexJava();
        boolean result = obj.lastName("Sharma");
        Assert.assertTrue(result);
    }

    @Test
    public void When_Given_Email_Is_Correct_ReturnTrue(){
        RegexJava obj = new RegexJava();
        boolean result = obj.eMail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }
}
