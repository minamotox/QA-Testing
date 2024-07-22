package BasicTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTesting {
	// launch browser
	WebDriver driver;
        
	public void LaunchBrowser() throws InterruptedException {
            System.setProperty("webdriver.gecko.driver","/home/minamotox/Dev/Eclipse/Geckodriver/geckodriver");
            driver= new FirefoxDriver();
            driver.get("https://test.protos-erp.com/");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            Thread.sleep(3000);
}
	//Test Login
	public void Login() throws InterruptedException {
            driver.findElement(By.className("p-button-label")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("email1")).sendKeys("user@nothing.com");
            WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password1\"]/div/input"));
            passwordField.click();
            passwordField.sendKeys("123456");
            Thread.sleep(3000);
            driver.findElement(By.id("rememberme1")).click();
            driver.findElement((By.xpath(("/html/body/app-root/app-login/div/div[2]/div/div/form/div/button/span[1]")))).click();
            Thread.sleep(3000);
            System.out.println("The page title is :" + driver.getTitle());
            Thread.sleep(4000);
            driver.findElement(By.id("email1")).clear();
            driver.findElement(By.id("email1")).sendKeys("admin");
            WebElement passwordField2 = driver.findElement(By.xpath("//*[@id=\"password1\"]/div/input"));
            passwordField2.click();
            passwordField2.clear();
            passwordField2.sendKeys("admin1243");
            Thread.sleep(3000);
            driver.findElement(By.id("rememberme1")).click();
            driver.findElement((By.xpath(("/html/body/app-root/app-login/div/div[2]/div/div/form/div/button/span[1]")))).click();
            Thread.sleep(3000);
	}
	// Close the browser
	public void closebrowser() {
            driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
            LoginTesting obj = new LoginTesting();
            obj.LaunchBrowser();
            obj.Login();
            obj.closebrowser();
	}
}
		
	