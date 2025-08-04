import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Documents\\Viswanath_AUTOMATION\\chromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
			
		    WebDriver driver=new ChromeDriver();  
		    driver.manage().window().maximize();  
		    driver.get("https://testautomationpractice.blogspot.com/");
		    Thread.sleep(3);
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"sunday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"monday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"tuesday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"wednesday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"thursday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"friday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"saturday\"]")).click();
		    
		    Thread.sleep(5);
		    
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"sunday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"monday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"tuesday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"wednesday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"thursday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"friday\"]")).click();
		    driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"saturday\"]")).click();
		    
		    boolean sunday= driver.findElement(By.xpath("//input[@Class=\"form-check-input\" and @id=\"sunday\"]")).isSelected();
		    System.out.println("is selected:=" + sunday);
		    
		    List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		    
		    System.out.println(alllinks.size());
		    
		    System.out.println(alllinks);
		    for (WebElement link : alllinks) {
	            String url = link.getAttribute("href");
	            String text = link.getText();
	            System.out.println("Text: " + text + " | URL: " + url);
	        }
		    

	}

}
