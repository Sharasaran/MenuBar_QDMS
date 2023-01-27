package base;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class initial {

	public static WebDriver driver;
	@Test
	
    public void main() throws InterruptedException {
    	
    	
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        driver =  new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("http://192.168.1.35:8083/#/");
       
        driver.findElement(By.xpath("//*[@id=\"usernameOrEmail\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("tokyo@admin");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")).click();
		WebElement element = driver.findElement(By.cssSelector("#root > div > section > section > header > ul"));
		String color = element.getCssValue("color");
		Thread.sleep(2000);
		
		
//	//1//	
//		WebElement menuBar = driver.findElement(By.cssSelector("#root > div > section > section > header > ul"));
//		 String actualColor = menuBar.getCssValue("background-color");
//		 Thread.sleep(2000);
//		 assertEquals("##001531", actualColor);
//		
		
		
		
		
		
		//2//
		
		   SoftAssert softast = new SoftAssert();
		   
	        WebElement menubar = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/ul"));
	           String ActualColour = menubar.getCssValue("background-color");
               System.out.println("rgb :"+ActualColour);
              

               String hexcolour = Color.fromString(ActualColour).asHex();
               String ExpectedColour = "rgba(0, 21, 41, 1)";
               
              softast.assertEquals(ActualColour, ExpectedColour);
               softast.assertAll();
		
               
                 
               
               
               
	
		
		
		
		
		
		
		
		//3//
		
//		 WebElement menubar = driver.findElement(By.xpath("\"/html/body/div[1]/div/section/section/header/ul\""));;
//		  String acColor = menuBar.getCssValue("background-color");
//		 assertEquals("#001531", acColor);
//	
//		String menuBarColor = menuBar.getCssValue("background-color");
//
//	
//	
//		if(menu.equals("rgb(0, 32,32))")) 
//		{
//			System.out.println("Menu bar color is as expected");
//		} 
//		else 
//		{
//		    System.out.println("Menu bar color is not as expected");
//		}
//
//		
//		
//		
//		
//		
		
		
		
		
		
	
		
//		 Assert.assertEquals("rgba(,0,21,41 )",color);
//		System.out.println("colar is black");
		
	
		
//		assertEquals("rgba(,0,21,41 )", color);
//		
//		
//		System.out.println("colar is black");
//		
//		
//		driver.quit();
		
		
//		if (color.equals("rgba,(0, 21, 41)"))
//		{
//			
//			System.out.println("test case pass");
//		}
//		
//		else
//		{
//			System.out.println("text case is fail");
//		}
//		
		
		
		
		
		
		
//		WebElement menuBar = driver.findElement(By.xpath("#root > div > section > section > header > ul"));
//		String menuBarColor = menuBar.getCssValue("#001529");
//		System.out.println("Menu bar color: " + menuBarColor);
		
//		String color = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/ul")).getCssValue("color");
//		System.out.println(color);
//		String [] hexValue = color.replace("rgb(", "").replace(")", "").split(",");
//		System.out.println("hexvalue");
//		
//
//		hexValue[0]=hexValue[0].trim();
//		int hexValue1 =Integer.parseInt(hexValue[0]);
//		
//
//		hexValue[1]=hexValue[0].trim();
//		int hexValue2 =Integer.parseInt(hexValue[1]);
//		
//		
//		hexValue[2]=hexValue[0].trim();
//		int hexValue3 =Integer.parseInt(hexValue[2]);
//		
//
//		String actualcolor = String.format(color, hexValue1,hexValue2,hexValue3);
//		
//	
//		System.out.println(actualcolor);
//		Assert.assertTrue( actualcolor.equals("#001529"), "Test case is failed as colode code is correct for menbar");
//		driver.close();
//		
//		
		
		
		
		
		
		
		
}

	
}
