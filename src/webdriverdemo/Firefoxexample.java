package webdriverdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefoxexample extends DriverClass{
	//class variable
	int myage=0;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub 
		//WebDriver driver = new FirefoxDriver();
		
		//DriverClass drv = new DriverClass();
		//instance variable
		//WebDriver driver = drv.GetDriver();
		
		//method variable or local variable
		int age = 0;
		WebDriver driver = GetDriver();
		
		driver.get("http://www.google.com");
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("books");
		Thread.sleep(10000);
		element.submit();		
		driver.quit();	
		
		//iDE>>gmail regirstration
		//amazon cart adding
	}

}

