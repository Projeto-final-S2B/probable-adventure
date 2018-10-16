package pucrs.s2b.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import VerificationPoint.VerificaProdutoVerificationPoint;
import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.BuscarProdutoTasks;


public class BuscarProdutoTestCase
{
	private WebDriver driver;
	public BuscarProdutoTasks buscar; 
	public VerificaProdutoVerificationPoint V;
	
	@Before
	public void setupTest() {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		this.buscar = new BuscarProdutoTasks(driver);
    	driver.get("https://www.gamestorrents.tv");	
    	V = new VerificaProdutoVerificationPoint(driver);
	}
	
	@Test
    public void testeBuscarBatman()
    {
		this.buscar.digitarValor("Batman");
		this.buscar.apertarButtonBusca();
		this.V.checarBuscaBatman();
    }
	
	@Test
    public void testeBuscarHeavy()
    {
		this.buscar.digitarValor("Heavy");
		this.buscar.apertarButtonBusca();
		this.V.checarBuscaHeavy();
    }
	
	/*@Test
    public void testeBuscarWar()
    {
		this.buscar.digitarValor("War");
		this.buscar.apertarButtonBusca();
    }
	
	@Test
    public void testeBuscarPs3()
    {
		this.buscar.apertarButtonPs3();
		this.buscar.apertarGenero();
		this.buscar.apertarGeneroAventura();
    }
	
	@Test
    public void testeBuscarXbox360()
    {
		this.buscar.apertarButtonXbox360();
		this.buscar.apertarGenero();
		this.buscar.apertarGeneroAventura();
    }
	
	@Test
    public void testeTabelaJogo()
    {
		this.buscar.apertarTabelaJogo();
    }*/
	
	
	@After
	public void tearDown() {
		//driver.close();		
	}
	
	
	
}
