import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class B
{

	public static void main(String[] args)
	{
		FirefoxDriver x=new FirefoxDriver();
		x.get("http://www.bluefly.com");
		x.manage().window().maximize();//to maximize the window
		A mn=new A(x);
		mn.type(By.xpath("//input[@id='searchterms']"),"Bithi");
		
		
		
		


	}

}
