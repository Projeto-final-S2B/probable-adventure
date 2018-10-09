package pucrs.s2b.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import tasks.BuscarProdutoTasks;


public class BuscarProdutoTestCase
{
	private WebDriver driver;
	public BuscarProdutoTasks buscar;  

	@BeforeClass
	public static void setupClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\teste\\chromedriver.exe");
	}
	
	@Before
	public void setupTest() {
		driver = new ChromeDriver();
		this.buscar = new BuscarProdutoTasks(driver);
	}
	
	@Test
    public void  giveSiteGamesTorrentsWhenPlaceholderappearThenTestLanguage()
    {
    	driver.get("https://www.gamestorrents.tv");	
    	
    	//WebElement clickElement = driver.findElement(By.className("goog-te-gadget-simple"));
    	//clickElement.click();
    	
    	
		WebElement outElement = driver.findElement(By.id("s"));
		String actual = outElement.getAttribute("placeholder");
		String expected = "Buscar Jogo Torrent";
		
		assertEquals(expected, actual);
		driver.close();	
		
    }
	/*@Test
    public void  giveSiteGamesTorrentsWhenThen()
    {
    	driver.get("https://www.gamestorrents.tv/juegos-pc/fishing-sim-world/");	
    	
    	WebElement outElement = driver.findElement(By.id("view31_display_name"));
		String actual = outElement.getAttribute("placeholder");
		String expected = "Nombre";
		
		assertEquals(expected, actual);
		driver.close();	
    }*/
}
