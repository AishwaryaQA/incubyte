package COMPOSEEMAIL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class COMPOSE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	WebElement Emailid=driver.findElement(By.id("identifierId"));
	Emailid.click();
	Emailid.sendKeys("qateam.jiffy@gmail.com");
	driver.findElement(By.xpath("//span[.='Next']")).click();
	driver.findElement(By.name("password")).sendKeys("Option#123");
	driver.findElement(By.xpath("//span[.='Next']")).click();
	Thread.sleep(3000);
	driver.findElement(By.className("T-I T-I-KE L3")).click();
	driver.findElement(By.id(":zh")).sendKeys("aishunmckm@gmail.com");
	WebElement ELE=driver.findElement(By.name("subjectbox"));
ELE.click();
ELE.sendKeys("HI");
driver.findElement(By.id(":yp")).click();


	}

}
