package Rest.Api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class S {
	@Test
	public  void test() {
		// TODO Auto-generated method stub
		System.out.println("Testng class");
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\driver\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.guru99.com/become-an-instructor.html");
        
        String title = driver.getTitle();
       System.out.println(title);
       
       driver.close();
	}

}
