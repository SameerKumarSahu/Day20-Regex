import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedTest {
    ValidateMultipleMail mail = new ValidateMultipleMail();
    public String emailTest;
    public boolean expected;

    public ParameterisedTest(String emailTest, boolean expected){
        super();
        this.emailTest = emailTest;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection input() {

        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-10@yahoo.com", true},
                {"abc.1010@yahoo.com", true},
                {"abc222@abc.com", true},
                {"abc.100@abc.com", true},
                {"abc@1.com", true},
                {"abc123@gamil.a", true},
                {"abc123@yahoo.com", true},
                {"abc@gmail.com", true},
                {"abc404@gamil.com", true},
                {"abc-100@abc.net", true}});
    }

    @Test
    public  void givenEmailsAspertheParameters(){
        boolean check = mail.emailUniversal(emailTest);
        Assert.assertEquals(expected, check);
    }
}
