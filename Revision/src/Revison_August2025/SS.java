package Revison_August2025;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SS {
	
	
	
	public static void main(String[] args) throws IOException {
		Random ran = new Random();
		int randomInt = ran.nextInt(1000);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file =new File("./ss1"+randomInt+".png");
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		Files.copy(src, file);
		
		File file2 =new File("./Elementimg"+randomInt+".png");
		WebElement ele = driver.findElement(By.id("name"));
		File src2 = ele.getScreenshotAs(OutputType.FILE);
		Files.copy(src2, file2);
		
		
		
		
	}

}
