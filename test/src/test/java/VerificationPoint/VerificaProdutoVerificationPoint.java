package VerificationPoint;

import org.openqa.selenium.WebDriver;

public class VerificaProdutoVerificationPoint {
	private WebDriver driver;
	private String expectedMessage = "Batman";
	public void checkHelloMessage() {
		if(this.driver.getPageSource().contains(expectedMessage)){
			System.out.println("Entrou");
		} else {
			System.out.println("Não encontrou");
		}
	}
}
