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
	
	public void apertarButton() {
		this.busca.getBuscarButton().click();
	}

}
