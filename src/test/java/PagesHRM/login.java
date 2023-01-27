package PagesHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
	    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div/span[1]/input")
	    public static WebElement username;

	    @FindBy(xpath = "//input[@placeholder='Password']")
        public static WebElement password;
	    
        @FindBy(xpath = "//button[@type='button']")
	     public static WebElement login;
	


}
