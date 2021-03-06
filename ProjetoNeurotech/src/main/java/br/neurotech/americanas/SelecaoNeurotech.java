package br.neurotech.americanas;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SelecaoNeurotech {

	WebDriver driver;
	
	@Before //inicializa antes de cada execu??o;
	public void inicializar() {
    driver = new FirefoxDriver();
	driver.get("https://www.americanas.com.br/");
	
}
	
//	@After
//	public void finalizar() {
//		driver.quit();
//	}
//	
//	@Test
//	public void acessarSiteAmericanas() {
//		inicializar();	
//	}
//	
//	@Test
//	public void buscarConsole() {
//		driver.findElement(By.id("h_search-input")).sendKeys("console ps4");
//		driver.findElement(By.id("h_search-btn")).click();
//		
//	}
//	
//	@Test
//	public void selecionarProduto() {
//		driver.findElement(By.id("h_search-input")).sendKeys("console ps4");
//		driver.findElement(By.id("h_search-btn")).click();
//		driver.findElement(By.id("lgpd-accept")).click();
//		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/a[1]/div[2]/div[1]/picture[1]/img[1]")).click();	
//		
//	}
//	
//	//favor executar a segunda vez caso de erro na primeira execu??o;
//	@Test
//	public void imprimirValoresDoFrete() {
//		driver.findElement(By.id("h_search-input")).sendKeys("console ps4");
//		driver.findElement(By.id("h_search-btn")).click();
//		driver.findElement(By.id("lgpd-accept")).click();
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/a[1]/div[2]/div[1]/picture[1]/img[1]")).click();
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[1]/div[3]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("53050110");
//		driver.findElement(By.xpath("//button[contains(text(),'ok')]")).click();
//		
//	}
//	
//
//       // Thiago Brayner, vou ficar devendo o print, pq n?o sei tirar o print s? de um metodo, uso 
//	   //o screenshot que tira os prints em execu??o;
//	
//	@Test
//	public void clicarComprar() {
//		driver.findElement(By.id("h_search-input")).sendKeys("console ps4");
//		driver.findElement(By.id("h_search-btn")).click();
//		driver.findElement(By.id("lgpd-accept")).click();
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/a[1]/div[2]/div[1]/picture[1]/img[1]")).click();
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[1]/div[3]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("53050110");
//		driver.findElement(By.xpath("//button[contains(text(),'ok')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'comprar')]")).click();
//	}
//	
//	@Test
//	public void selecionarGarantia() {
//		driver.findElement(By.id("h_search-input")).sendKeys("console ps4");
//		driver.findElement(By.id("h_search-btn")).click();
//		driver.findElement(By.id("lgpd-accept")).click();
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/a[1]/div[2]/div[1]/picture[1]/img[1]")).click();
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[1]/div[3]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("53050110");
//		driver.findElement(By.xpath("//button[contains(text(),'ok')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'comprar')]")).click();
//		driver.findElement(By.xpath(""
//				+ "//body/div[@id='content']/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")).click();
//	}
//	
//	@Test
//	public void ClicarEmContinuar() {
//		driver.findElement(By.id("h_search-input")).sendKeys("console ps4");
//		driver.findElement(By.id("h_search-btn")).click();
//		driver.findElement(By.id("lgpd-accept")).click();
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/a[1]/div[2]/div[1]/picture[1]/img[1]")).click();
//		driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[1]/div[3]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("53050110");
//		driver.findElement(By.xpath("//button[contains(text(),'ok')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'comprar')]")).click();
//		driver.findElement(By.xpath(""
//				+ "//body/div[@id='content']/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Continuar')]")).click();
//	}
	
	@Test
	public void validarProdutoNaCesta() {
		driver.findElement(By.id("h_search-input")).sendKeys("console ps4");
		driver.findElement(By.id("h_search-btn")).click();
		driver.findElement(By.id("lgpd-accept")).click();
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/a[1]/div[2]/div[1]/picture[1]/img[1]")).click();
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[3]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("53050110");
		driver.findElement(By.xpath("//button[contains(text(),'ok')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'comprar')]")).click();
		driver.findElement(By.xpath(""
				+ "//body/div[@id='content']/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Continuar')]")).click();
		Assert.assertEquals("1", driver.findElement(By.xpath("//body/div[@id='app']/section[1]/section[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/div[1]/div[3]/div[1]/input[1]")).getAttribute("value"));
	}
}
