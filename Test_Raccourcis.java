package BasicTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Raccourcis {
	WebDriver driver;
	public void LaunchBrowser() throws InterruptedException {
            System.setProperty("webdriver.gecko.driver","/home/minamotox/Dev/Eclipse/Geckodriver/geckodriver");
            driver= new FirefoxDriver();
            driver.get("https://test.protos-erp.com");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            Thread.sleep(3000);
            }
	// Login
	public void Login() throws InterruptedException {
            driver.findElement(By.className("p-button-label")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("email1")).sendKeys("admin");
            driver.findElement(By.xpath("//*[@id=\"password1\"]/div/input")).sendKeys("admin1243");
            driver.findElement(By.id("rememberme1")).click();
            driver.findElement((By.xpath(("/html/body/app-root/app-login/div/div[2]/div/div/form/div/button/span[1]")))).click();
            System.out.println("The page title is :" + driver.getTitle());
            Thread.sleep(3000);
            }
	//Raccourcis
	public void explore() throws InterruptedException {
            driver.findElement(By.cssSelector("button.layout-topbar-button2:nth-child(1)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button.p-link:nth-child(2)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button.p-link:nth-child(3)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button.p-link:nth-child(4)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button.p-link:nth-child(5)")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button.p-link:nth-child(7)")).click();
            driver.findElement(By.className("Mon Profil")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            driver.findElement(By.cssSelector("button.p-link:nth-child(7)")).click();
            driver.findElement(By.className("Aide")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            driver.findElement(By.cssSelector("button.p-link:nth-child(7)")).click();
            driver.findElement(By.className("corp6A")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button.p-link:nth-child(7)")).click();
            driver.findElement(By.className("Portail")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            driver.findElement(By.cssSelector("button.p-link:nth-child(7)")).click();
            driver.findElement(By.className("Déconnexion")).click();
            Thread.sleep(2000);
            System.out.println("The page title is :" + driver.getCurrentUrl());
            // Displayed page: https://test.protos-erp.com/#/public
            }
	// Close the browser
	public void closebrowser() {
            driver.quit();
            }

	public static void main(String[] args) throws InterruptedException {
            Test_Raccourcis obj = new Test_Raccourcis();
            obj.LaunchBrowser();
            obj.Login();
            obj.explore();
            obj.closebrowser();
            }
}