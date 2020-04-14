package com.ciber.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YT_FLASH {
	
	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software1\\jars\\chromedriver.exe");		
		WebDriver driver= new ChromeDriver();
		
		//defirne wait 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/watch?v=HwFIOAMRilk");

		
		//create the object sceenclass - sikuli
		Screen s= new Screen();
		
		Pattern pauseImg= new Pattern("YT_PAUSE.PNG");
		s.wait(pauseImg,2000);
		s.click();
	    s.click();
		Thread.sleep(2000);
		Pattern playImg= new Pattern("YT_PLAY.PNG");
		s.wait(playImg,2000);
		s.click();
				
				
		
	}

}
