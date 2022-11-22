package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp (){

        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
    sendTextToElement(By.name("username"),"Admin");
    sendTextToElement(By.name("password"),"admin123");
    clickOnElement(By.xpath("//button[@type='submit']"));
    String expectedMessage  = "Dashboard";
    String actualMessage =  getTextFromElement(By.xpath("//h6[text() = 'Dashboard']"));

    Assert.assertEquals("Not navigate to login page", expectedMessage,actualMessage);
    }
    }
