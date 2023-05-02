package Juintautomacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Bancointer {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		//comando para apontar o driver do navegador
		System .setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// comando para indicar meu driver instanciado
		driver = new ChromeDriver ();
		//comando para indicar o site a ser aberto
		driver.get("https://www.bancointer.com.br/");
		//comando para indicar o elemento a ter a interação
		driver.findElements(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)"));
		

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		String texto;
		Thread.sleep(5000);
		texto = driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div.col-12.text-center.py-4.pt-lg-0 > h2")) .getText();
		System.out.println(texto);
		assertEquals("Abra agora sua Conta Digital", texto);
	}

}
