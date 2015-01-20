import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{

	FirefoxDriver driver;
	
	@Before
	public void start()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}
	
	@After
	public void close()
	{
		driver.quit();
	}


}
