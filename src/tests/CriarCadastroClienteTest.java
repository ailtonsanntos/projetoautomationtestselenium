package tests;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CriarCadastroClienteTest {

	@Test
	void testCriarCadastroClienteComSucesso() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\Chrome\\89\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Carlos");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Alberto");
		
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("alberto890@teste.com");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("2198786789");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"countries\"]/option[33]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[67]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[13]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[25]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Ab123456");
		
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Ab123456");
		
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		
		driver.close();
		
		
	}

}
