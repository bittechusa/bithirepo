import org.junit.Test;
import org.openqa.selenium.By;


public class SmokeTest extends BaseTest
{
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("paul.bithi@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("u_0_n")).click();
	}
	
	
	@Test
	public void signUp()
	{
		driver.findElement(By.id("u_0_1")).sendKeys("abc");
		driver.findElement(By.id("u_0_3")).sendKeys("juthi");
	}
	

}
