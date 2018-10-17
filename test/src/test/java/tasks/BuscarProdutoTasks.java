package tasks;

import org.openqa.selenium.WebDriver;

import appObject.BuscaProdutoAppObject;

public class BuscarProdutoTasks {
	
	private WebDriver driver;
	private BuscaProdutoAppObject busca;
	
	public BuscarProdutoTasks (WebDriver driver){
		this.driver = driver;
		busca = new BuscaProdutoAppObject(driver);
	}
	
	public void digitarValor (String busca) {
		this.busca.getCampoBusca().sendKeys(busca);
	}
	
	public void apertarButtonBusca() {
		this.busca.getBuscarButton().click();
	}
	
	public void apertarButtonPs3() {
		this.busca.getBuscarPs3().click();
	}
	
	public void apertarButtonJogo() {
		this.busca.getBuscarJogo().click();
	}
	
	public void apertarButtonXbox360() {
		this.busca.getBuscarXbox360().click();
	}
	
	public void apertarGenero() {
		this.busca.getBuscarGenero().click();
	}
	
	public void apertarGeneroAventura() {
		this.busca.getBuscarAventuras().click();
	}
	
	public void apertarTabelaJogo() {
		this.busca.getBuscarTabelaJogo().click();
	}
}
