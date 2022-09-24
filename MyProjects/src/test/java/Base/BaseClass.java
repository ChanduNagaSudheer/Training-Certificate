package Base;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	protected WebDriver driver=null;
	@BeforeSuite
	public void suitebefore() {
		//created timestamp
        Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        System.out.println(formatter.format(ts));   
        
	}
	
	
	@AfterSuite
	public void suiteafter() {
	       //created timestamp
		Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        System.out.println(formatter.format(ts)); 
	}
	
	@BeforeTest
	public void testbefore() {
		//i have setup the chromedriver
		System.setProperty("webdriver.chrome.driver","/home/ChanduNagaSudheer/eclipse-workspace/TestngProjectChandu/src/test/resources/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://google.com/");
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void classbefore() {
		driver.navigate().to("http://adactinhotelapp.com/");
		WebElement x = driver.findElement(By.id("username"));
		x.sendKeys("sudheer24072000");
		WebElement x1 = driver.findElement(By.name("password"));
		x1.sendKeys("Sudheer");
		WebElement x2 = driver.findElement(By.id("login"));
		x2.click();
	}
	
	@AfterTest
	public void testafter() {
		driver.close();
    }
}
