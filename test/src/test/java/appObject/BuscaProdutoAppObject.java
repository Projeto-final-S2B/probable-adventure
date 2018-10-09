package appObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscaProdutoAppObject {
	WebDriver driver;
	WebElement outElement;
	
	public BuscaProdutoAppObject (WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getCampoBusca () {
		return outElement = driver.findElement(By.id("s")); 
	}

}
