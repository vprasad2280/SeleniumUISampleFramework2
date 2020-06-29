package SampleFramework.SampleFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import  org.testng.annotations.*;

public class debug {

	
	static String baseURL="https://demo.midtrans.com/";
	String userNasme="";
	String passWord="";
	public static WebDriver driver;

	@Test

	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@class='btn buy']")).click();
		driver.findElement(By.xpath("//div[@class='cart-checkout']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[@class='button-main-content']")).click();
		driver.findElement(By.xpath(".//div[contains(text(),'Credit Card')]")).click();
		//driver.switchTo().frame(1);
		driver.findElement(By.xpath(".//input[@name='cardnumber']")).sendKeys("4811111111111114");
		
		//WebElement ele = driver.findElement(By.xpath("//div[@class='input-group col-xs-7']"));
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", //ele);
		/*WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='input-group col-xs-7']")));*/
		//driver.findElement(By.xpath("//input[@placeholder='MM / YY']")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//input[@placeholder='MM / YY']")).sendKeys("0921");
		driver.findElement(By.xpath("//input[@placeholder='123']")).sendKeys("321");
		driver.findElement(By.xpath(".//a[@class='button-main-content']")).click();
		//driver.switchTo().frame(1);
		//driver.switchTo().alert().dismiss();
		 // Find the checkbox or radio button element by its name.
	      //List list = driver.findElements(By.xpath(".//div[@class='checkbox checkbox-left']"));
		driver.findElement(By.xpath(".//label[contains(text(),'Midtrans Promo')]")).click();
		driver.findElement(By.xpath(".//div[@class='text-button-main']")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		//driver.switchTo().frame("iframe");
		//driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("112233");
		WebElement ele = driver.findElement(By.xpath(".//input[@placeholder='112233']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", ele);
		//driver.findElement(By.xpath("")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath(".//input[@placeholder='112233']")).sendKeys("112233");
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		String Failed_text=driver.findElement(By.xpath(".//div[@class='text-failed']")).getText();        //Your card got declined by the bank
		System.out.println("Transaction failed text is :"+Failed_text);

	}

	/*@AfterTest

	public void teardown()
	{
		driver.close();

	}*/
}
