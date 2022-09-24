package TestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;

public class TestCases extends BaseClass{
     @Test 
     public void testcase1() {
    	 //i am searching the hotel
    	WebElement loc=driver.findElement(By.name("location"));
    	loc.click();
    	loc.sendKeys(Keys.DOWN);
    	loc.sendKeys(Keys.RETURN);
    	WebElement Hotel=driver.findElement(By.name("hotels"));
    	 Hotel.click();
    	 Hotel.sendKeys(Keys.DOWN);
    	 Hotel.sendKeys(Keys.DOWN);
    	 Hotel.sendKeys(Keys.RETURN);
    	WebElement roomtype=driver.findElement(By.name("room_type"));
    	roomtype.click();
    	roomtype.sendKeys(Keys.DOWN);
    	roomtype.sendKeys(Keys.RETURN);
    	WebElement noofrooms=driver.findElement(By.name("room_nos"));
    	 noofrooms.click();
    	 noofrooms.sendKeys(Keys.DOWN);
    	 noofrooms.sendKeys(Keys.RETURN);
    	 WebElement adult=driver.findElement(By.id("adult_room"));
    	 adult.click();
    	 adult.sendKeys(Keys.DOWN);
    	 adult.sendKeys(Keys.RETURN);
    	 WebElement datein=driver.findElement(By.id("datepick_in"));
    	 datein.sendKeys("09/09/2022");
    	 WebElement dateout=driver.findElement(By.id("datepick_out"));
    	 dateout.sendKeys("11/09/2022");
    	 WebElement perroom=driver.findElement(By.id("child_room"));
    	 perroom.click();
    	 perroom.sendKeys(Keys.DOWN);
    	 perroom.sendKeys(Keys.DOWN);
    	 perroom.sendKeys(Keys.DOWN);
    	 perroom.sendKeys(Keys.RETURN);
    	 driver.findElement(By.className("reg_button")).click();
     }
     @Test
     public void testcase2(){
    	 //I am Selecting the hotel
    	 driver.findElement(By.id("radiobutton_0")).click();
    	 driver.findElement(By.xpath("//input[@name='continue']")).click();
     }
     @Test
     public void testcase3() {
    	 driver.findElement(By.name("first_name")).sendKeys("Chandu");
    	 driver.findElement(By.name("last_name")).sendKeys("Naga Sudheer");
    	 driver.findElement(By.name("address")).sendKeys("Tanuku-534211");
    	 driver.findElement(By.name("cc_num")).sendKeys("1234567812345678");
    	 WebElement CCtype=driver.findElement(By.name("cc_type"));
    	 CCtype.click();
    	 CCtype.sendKeys(Keys.DOWN); CCtype.sendKeys(Keys.DOWN); CCtype.sendKeys(Keys.DOWN);
    	 CCtype.sendKeys(Keys.RETURN);
    	 WebElement expmonth=driver.findElement(By.name("cc_exp_month"));
    	 expmonth.click();
    	 expmonth.sendKeys(Keys.DOWN);
    	 expmonth.sendKeys(Keys.RETURN);
    	 WebElement expyear=driver.findElement(By.name("cc_exp_year"));
    	 expyear.click();
    	 expyear.sendKeys(Keys.DOWN);
    	 expyear.sendKeys(Keys.DOWN);expyear.sendKeys(Keys.DOWN);expyear.sendKeys(Keys.DOWN);expyear.sendKeys(Keys.DOWN);expyear.sendKeys(Keys.DOWN);expyear.sendKeys(Keys.DOWN);
    	 expyear.sendKeys(Keys.RETURN);
    	 driver.findElement(By.name("cc_cvv")).sendKeys("123");
    	 driver.findElement(By.name("book_now")).click();
    	}
     @Test
     public void testcase4()
     {
    	 //getting the orderId
    	 String text = driver.findElement(By.className("disable_text")).getText();
 		 System.out.println(text);
    	 
     }
     
     
     
}
