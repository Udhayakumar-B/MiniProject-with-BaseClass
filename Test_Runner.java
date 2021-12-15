package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Runner {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspaceNew\\Selenium_Project1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("udhayabalavanit@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("Savukath@12345");
		WebElement login = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		login.click();
		Thread.sleep(2000);
		WebElement woman = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(woman).build().perform();
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
		clickOnElement(dress);
		WebElement size = driver.findElement(By.id("layered_id_attribute_group_2"));
		size.click();
		WebElement color = driver.findElement(By.id("layered_id_attribute_group_24"));
		color.click();
		WebElement composition = driver.findElement(By.id("layered_id_feature_3"));
		composition.click();
		WebElement style = driver.findElement(By.id("layered_id_feature_16"));
		style.click();
		WebElement properties = driver.findElement(By.id("layered_id_feature_19"));
		properties.click();
		WebElement available = driver.findElement(By.id("layered_quantity_1"));
		available.click();
		WebElement manufact = driver.findElement(By.id("layered_manufacturer_1"));
		manufact.click();
		WebElement condition = driver.findElement(By.id("layered_condition_new"));
		condition.click();
		Thread.sleep(6000);
		WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		clickOnElement(image);
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='http://automationpractice.com/index.php?id_product=4&controller=product&content_only=1']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		act.moveToElement(addtocart).click().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		WebElement proceed = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		act.moveToElement(proceed).click().perform();
		WebElement tocheckout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		tocheckout.click();
		WebElement address = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		address.click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	submit1.click();
		
		
		
	}

}
