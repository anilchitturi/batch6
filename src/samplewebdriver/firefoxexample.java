package samplewebdriver;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class firefoxexample extends FFDriver {

		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub 
			//WebDriver driver = new FirefoxDriver();
			WebDriver driver = FFDriver1();
			driver.get("http://www.google.com");
			WebElement element=driver.findElement(By.name("qop"));
			element.sendKeys("books");
			//Thread.sleep(10000);
			element.submit();		
			driver.quit();	
			
			//iDE>>gmail regirstration
			//amazon cart adding
		}

	}
