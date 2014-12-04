import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	FirefoxDriver fd;
	BaseTest(FirefoxDriver apple)
	{
		fd=apple;
	}//end constructor
	public void type(By by, String value)
	{
		fd.findElement(by).sendKeys(value);
	}//end of type method
	public void verifyText(String textname)
	{
		if(fd.getPageSource().contains(textname))
		{
			System.out.println("text found");
		}
		else
		{
			System.out.println("not found");
		}
	}//end of method
	
	public void verifyElementPresent(By by)
	{
		if(fd.findElement(by).isDisplayed())
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("not present");
		}
	}//end method
	
	public void click(By by)
	{
		fd.findElement(by).click();
		
	}
	 public void verifyTitle(String value)
	 {
		if( fd.getTitle().contains(value))
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("not matched");
		}
		 
	 }

}
