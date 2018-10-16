package VerificationPoint;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.openqa.selenium.WebDriver;
import appObject.BuscaProdutoAppObject;

public class VerificaProdutoVerificationPoint {
	private WebDriver driver;
	private BuscaProdutoAppObject busca;
	public VerificaProdutoVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	public void checarBuscaBatman() {
		String expectedMessage = "Batman";
		if(this.driver.getPageSource().contains(expectedMessage)){
			busca = new BuscaProdutoAppObject(driver);
			String actual = busca.getBuscarBatman().substring(0,6);
			String expected = "Batman";
			assertEquals(expected, actual);
			//assertTrue(true);
		} else {
			assertFalse(true);;
		}
	}
	public void checarBuscaHeavy() {
		String expectedMessage = "Heavy";
		if(this.driver.getPageSource().contains(expectedMessage)){
			busca = new BuscaProdutoAppObject(driver);
			String actual = busca.getBuscarHeavy().substring(0,6);
			String expected = "Heavy";
			assertEquals(expected, actual);
			//assertTrue(true);
		} else {
			assertFalse(true);;
		}
	}
}
