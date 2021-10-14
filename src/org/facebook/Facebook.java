package org.facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.remote.server.jmx.ManagedAttribute;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravindh\\eclipse-workspace\\SeleniumFacebook\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://en-gb.facebook.com/");	
			
	WebElement gMail = driver.findElement(By.xpath("//a[@rel='async']"));
	
	gMail.click();
	
	WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	
	Select select = new Select(year);
	
	List<WebElement> allOptn = select.getOptions();
	
	for (int i = 0; i < allOptn.size(); i++) {
	
		WebElement a = allOptn.get(i);
		
		String text = a.getText();
		
		System.out.println(text);
		
		
		
		
	}
	
	
WebElement user = driver.findElement(By.id("email"));
	
	user.sendKeys("sdadsdsds");
	
	WebElement pass = driver.findElement(By.cssSelector("*[id='pass']"));
	pass.click();
	
	
	driver.navigate().to("google.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
		
		
	}
	


