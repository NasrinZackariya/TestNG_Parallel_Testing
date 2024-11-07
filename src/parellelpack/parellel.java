package parellelpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parellel {
	WebDriver driver;
	
  @Test (priority = 5)
  public void facebook() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();	  
 }
  
  @Test (priority = 4)
  public void flipkart () {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();	 
  }
  
  @Test (priority = 3)
  public void myg () {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwj9x_CIlceJAxXFpWYCHbXzB60YABAAGgJzbQ&co=1&ase=2&gclid=EAIaIQobChMI_cfwiJXHiQMVxaVmAh218wetEAAYASAAEgLbpvD_BwE&ohost=www.google.com&cid=CAASJuRoRw1GqQ6F3inO1J9SlNpz087w-e2kXutMMCoDiDxaDQOC4tCt&sig=AOD64_05v0v4UopcewWdLw9XxooimYgXDw&q&nis=4&adurl&ved=2ahUKEwiXqOuIlceJAxUz1TgGHWPDMqQQ0Qx6BAgLEAE");
	  driver.manage().window().maximize();	
  }

  
 @Test (priority = 1)
	  public void spotify () {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://open.spotify.com/");
	  
  }

 @Test (priority = 1)
 public void youtube () {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\AUTOMATION\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.youtube.com/?themeRefresh=1");
   
  
 }
}