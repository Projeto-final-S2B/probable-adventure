package tasks;

import org.openqa.selenium.WebDriver;

import appObject.BuscaProdutoAppObject;

public class BuscarProdutoTasks {
	
	WebDriver driver;
	
	BuscaProdutoAppObject busca= new BuscaProdutoAppObject(driver);

	public BuscarProdutoTasks (WebDriver driver){
		this.driver = driver;
	}
	
	public void digitarValor (String busca) {
		
	}

}
