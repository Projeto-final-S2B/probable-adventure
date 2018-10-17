package VerificationPoint;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import appObject.BuscaProdutoAppObject;

public class VerificaProdutoVerificationPoint {
	private WebDriver driver;
	private BuscaProdutoAppObject busca;
	public VerificaProdutoVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	public void checarBuscaBatman() {
			busca = new BuscaProdutoAppObject(driver);
			String actual = busca.getBuscarBatman().substring(0,6);
			String expected = "Batman";
			assertEquals(expected, actual);
	}
	public void checarBuscaResidentEvil() {
			busca = new BuscaProdutoAppObject(driver);
			String actual = busca.getBuscarResidentEvil().substring(0,13);
			String expected = "Resident Evil";
			assertEquals(expected, actual);
	}
	
	public void checarBuscaWar() {
			busca = new BuscaProdutoAppObject(driver);
			String actual = busca.getBuscarWar().substring(0,13);
			String expected = "War";
			assertTrue(actual.contains(expected));
	}
	
	public void checarBuscaPS3() {
		busca = new BuscaProdutoAppObject(driver);
		String actual = busca.getBuscarGeneroTabela().substring(8,16);
		String expected = "Aventura";
		//assertEquals(expected, actual);
		assertEquals(expected, actual);
	}
	
	public void checarBuscaXBOX360() {
		busca = new BuscaProdutoAppObject(driver);
		String actual = busca.getBuscarGeneroTabela().substring(8,14);
		String expected = "Accion";
		//assertEquals(expected, actual);
		assertEquals(expected, actual);
	}
	
	public void checarBuscaNombre() {
		busca = new BuscaProdutoAppObject(driver);
		String actual = busca.getBuscarNombre().substring(0,6);
		String expected = "Nombre";
		//assertEquals(expected, actual);
		assertEquals(expected, actual);
	}
}
