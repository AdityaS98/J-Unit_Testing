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

    @Test
    public void When_Given_PassWord1_Is_Correct_ReturnTrue(){
        RegexJava obj = new RegexJava();
        boolean result = obj.PasswordCheck1("adityasharma");
        Assert.assertTrue(result);

    }
    @Test
    public void When_Given_PassWord2_Is_Correct_ReturnTrue(){
        RegexJava obj = new RegexJava();
        boolean result = obj.PasswordCheck2("Adityasharma");
        Assert.assertTrue(result);

    }

    @Test
    public void When_Given_PassWord3_Is_Correct_ReturnTrue(){
        RegexJava obj = new RegexJava();
        boolean result = obj.PasswordCheck3("Adityasharm1");
        Assert.assertTrue(result);

    }

}
