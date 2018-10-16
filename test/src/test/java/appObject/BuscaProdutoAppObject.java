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
	
	public WebElement getBuscarPs3() {
		return driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]"));
	}
	
	public WebElement getBuscarXbox360() {
		return driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]"));
	}
	
	public WebElement getBuscarGenero() {
		return driver.findElement(By.xpath("//*[@id=\"myTabContent\"]/div[2]/div/div[1]/div[1]"));
	}
	
	public WebElement getBuscarAventuras() {
		return driver.findElement(By.xpath("//*[@id=\"myTabContent\"]/div[2]/div/div[1]/div[1]/select/option[3]"));
	}
	
	public WebElement getBuscarTabelaJogo() {
		return driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]"));
	}
	
	public String getBuscarBatman() {
		WebElement OutElement = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div[3]/div/table/tbody/tr[1]/td[1]"));
		return OutElement.getText();
	}
	public String getBuscarHeavy() {
		WebElement OutElement = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div[3]/div/table/tbody/tr[1]/td[1]"));
		return OutElement.getText();
	}
}
