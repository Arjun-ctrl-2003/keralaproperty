package TESTKERALAPRO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KERAKLATEST {
	WebDriver driver;

    @BeforeMethod
    ()
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://keralaproperty.in/");
        driver.manage().window().maximize();
        
    }

    @Test
    public void testProperty() {
        WebElement logo = driver.findElement(
            By.xpath("/html/body/header/div[2]/div/a[1]/img")
        );

        if (logo.isDisplayed()) {
            System.out.println("Kerala Property logo is displayed");
        } else {
            System.out.println("Kerala Property logo is not displayed");
        }
        driver.quit();
    }
    
    
    @Test (priority = 1)
    public void testproperty()
    {
    	WebElement login = driver.findElement(By.xpath("/html/body/header/div[1]/div/a[1]"));
    	login.click();
    	WebElement newuser = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/a"));
    	newuser.click();
    	WebElement drop = driver.findElement(By.xpath("//*[@id=\"listowner\"]"));
    	Select s = new Select(drop);
    	s.selectByVisibleText("Builder");
    	
   
   
        
    	driver.findElement(By.xpath("//*[@id=\"utitle\"]")).sendKeys("anupriya");
    	driver.findElement(By.xpath("//*[@id=\"umail\"]")).sendKeys("arabsss@gmai.com");
    	driver.findElement(By.xpath("//*[@id=\"memberpass\"]")).sendKeys("anu123wer");
    	driver.findElement(By.xpath("//*[@id=\"repass\"]")).sendKeys("anu123wer");
    	driver.findElement(By.xpath("//*[@id=\"umobile\"]")).sendKeys("9876543225");
    	driver.findElement(By.xpath("//*[@id=\"sub_regbutton\"]")).click();
    	driver.quit();
    
    
    }
    @Parameters({"user","pass"})
    @Test(priority = 2)
    public void test(String user,String pass) throws InterruptedException 
    {
    	WebElement login1 = driver.findElement(By.xpath("/html/body/header/div[1]/div/a[1]"));
    	login1.click();
    	
    	driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys(user);
    	driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys(pass);
    	driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
    	Thread.sleep(3000);
    	String s = driver.getCurrentUrl();
    	String url = "https://keralaproperty.in/member/myhome/";
    	System.out.println(s);
    	
    	if(s.equals(url))
    	{
    		System.out.println("Pass");
    	}
    	else
    	{
    		System.out.println("fail");
    	}
    	driver.quit();
    	
    }



}
