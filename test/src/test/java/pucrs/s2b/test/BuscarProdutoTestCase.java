package pucrs.s2b.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.BuscarProdutoTasks;


public class BuscarProdutoTestCase
{
	private WebDriver driver;
	public BuscarProdutoTasks buscar; 
	
	
	@Before
	public void setupTest() {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		this.buscar = new BuscarProdutoTasks(driver);
    	driver.get("https://www.gamestorrents.tv");	
	}
	
	@Test
    public void  main()
    {
		this.buscar.digitarValor("Batman");
		this.buscar.apertarButton();
    }
	
	@After
	public void tearDown() {
		//driver.close();		
	}
	
}
