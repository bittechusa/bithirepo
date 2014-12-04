import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A 
{
	

	FirefoxDriver x;
	A(FirefoxDriver y)
	{
		x=y;
	}
	
	public void type(By by,String value)
	
	{
		x.findElement(by).sendKeys(value);
		
	}
	
	public void verifyText(String textname)
	{
		if(x.getPageSource().contains(textname))
		{
			System.out.println("found");
			
		}
		else
		{
			System.out.println("not found");
		}
		
		
	}
	
	public void verifyElementPresent(By by)
	{
		if(x.findElement(by).isDisplayed())
		{
			System.out.println("found");
			
		}
		else
		{
			System.out.println("not found");
		}
		
	}
	
	public void click(By by)
	{
		x.findElement(by).click();
	}
	
	public void verifyTitle(String value)
	{
		if(x.getTitle().contains("bluefly"))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}
	

}
