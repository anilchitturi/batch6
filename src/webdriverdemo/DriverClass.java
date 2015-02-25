package webdriverdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


//data types
//int = 0,688
//string = "ghh"
//bollen


 public class DriverClass {

	 // type <name>(){}
	 //void >> non return methods
	 public static WebDriver GetDriver() {
		// TODO Auto-generated method stub 
		WebDriver driver = new FirefoxDriver();
		return driver;
		
	}

}

