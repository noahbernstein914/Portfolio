package link.bin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
public class sanderVote {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		wordFinder();

	}

	public static void wordFinder() throws InterruptedException, IOException, AWTException {
		// initializing ChromeDriver
		Robot robot = new Robot();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\noahb\\OneDrive\\Desktop\\Java\\chromeD\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,250)");
		WebDriverWait w = new WebDriverWait(driver, 300);
		// getting instagram
		driver.get(
				"https://poll.fm/10996851");
		// signing in

		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*[@id=\"poll\"]/div/div/div/div/main/form/div[2]")))	;								    

		System.out.println(driver.findElement(By.xpath("*[@id=\"poll\"]/div/div/div/div/main/form/div[2]")).isDisplayed());
		driver.findElement(By.name("//*[@id=\"PDI_answer50533698\"]")).click();
		// List<WebElement> things = driver.findElements(By.xpath("//*[@id=\"pds-answer10996851\"]"));
		// System.out.println(things);
		// for(int i =0; i<things.size(); i++){
		// 	System.out.println(things.get(i).getText());
		// }
								//*[@id="pds-answer10996851"]					
		System.out.println("Found 2");
		// driver.findElement(By.xpath("//*[@id=\"PDI_answer50533695\"]")).click();
		// System.out.println("Click sent");
		// w.until(ExpectedConditions
		// 		.presenceOfElementLocated(By.xpath("////*[@id=\"pd-vote-button10996851\"]\"]")));
		// System.out.println("Found 3");
		// driver.findElement(By.xpath("////*[@id=\"pd-vote-button10996851\"]\"]")).click();
		// System.out.println("Click sent");

	}

}
