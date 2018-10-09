package appObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscaProdutoAppObject {
	private WebDriver driver;
	
	public BuscaProdutoAppObject (WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getCampoBusca () {
		return driver.findElement(By.id("s")); 
	}
	
	public WebElement getBuscarButton() {
		return driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/center/form/div/button"));
	}
}
