import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAmbiente {
	@Test
    public void Test(){
    	//System.setProperty("webdriver.gecko.driver","/Windows/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
    	//System.setProperty("webdriver.chrome.driver","/Windows/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	//System.setProperty("webdriver.ie.driver","C:/Users/Inmetrics/Downloads/IEDriverServer/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		//driver.manage().window().setPosition(new Point(100,100));
		
		//driver.manage().window().setSize(new Dimension(500,500));
		driver.manage().window().maximize();
		driver.get("https://srbarriga.herokuapp.com");
		System.out.println(driver.getTitle());
		
		Assert.assertEquals("Seu Barriga - Log in",driver.getTitle());
		
		
		driver.quit();
	}


}
