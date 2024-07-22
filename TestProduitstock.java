package BasicTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestProduitstock {
	WebDriver driver;
	public void LaunchBrowser() throws InterruptedException {
            System.setProperty("webdriver.gecko.driver","/home/minamotox/Dev/Eclipse/Geckodriver/geckodriver");
            driver= new FirefoxDriver();
            driver.get("https://test.protos-erp.com");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            }
		//Login
	public void Login() throws InterruptedException {
            driver.findElement(By.className("p-button-label")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("email1")).sendKeys("admin");
            driver.findElement(By.xpath("//*[@id=\"password1\"]/div/input")).sendKeys("admin1243");
            driver.findElement(By.id("rememberme1")).click();
            driver.findElement((By.xpath(("/html/body/app-root/app-login/div/div[2]/div/div/form/div/button/span[1]")))).click();
            System.out.println("The page title is :" + driver.getTitle());
            }
		// Exploring Produits et stock
	public void Prod() throws InterruptedException {
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Produits et Services")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Magazins")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Entrées Stock")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Sorties Stock")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Transfert de Stock")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Suivi Acquisitions")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Inventaires")).click();
            Thread.sleep(2000);
            System.out.println("The page title is :" + driver.getCurrentUrl());
            }
        // Close the browser
        public void closebrowser() {
            driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
            TestProduitstock obj = new TestProduitstock();
            obj.LaunchBrowser();
            obj.Login();
            obj.Prod();
            obj.closebrowser();
            }
}