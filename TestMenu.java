package BasicTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMenu {
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
	// Exploring Productivity
	public void Productivity() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/app-root/app-main/div/div[1]/app-menu/div/div[2]/ul/li/ul/div[1]/li/a")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Tableau de Bord")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/app-root/app-main/div/div[1]/app-menu/div/div[2]/ul/li/ul/div[1]/li/a")).click();
            driver.findElement(By.linkText("Mes Documents")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/app-root/app-main/div/div[1]/app-menu/div/div[2]/ul/li/ul/div[1]/li/a")).click();
            driver.findElement(By.linkText("Tous les Calendriers")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/app-root/app-main/div/div[1]/app-menu/div/div[2]/ul/li/ul/div[1]/li/a")).click();
            driver.findElement(By.linkText("Projets")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/app-root/app-main/div/div[1]/app-menu/div/div[2]/ul/li/ul/div[1]/li/a")).click();
            driver.findElement(By.linkText("Formulaires")).click();
            driver.findElement(By.linkText("Mes Formulaires")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/app-root/app-main/div/div[1]/app-menu/div/div[2]/ul/li/ul/div[1]/li/a")).click();
            driver.findElement(By.linkText("Messages")).click();
            driver.findElement(By.cssSelector("a.p-link:nth-child(1)")).click();
            }
	// Exploring Contact
	public void Contact() throws InterruptedException {
            driver.findElement(By.linkText("Contacts")).click();
            driver.findElement(By.linkText("Identités")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Contacts")).click();
            driver.findElement(By.linkText("Enseignants")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Contacts")).click();
            driver.findElement(By.linkText("Employés")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Contacts")).click();
            driver.findElement(By.linkText("Clients")).click();
            Thread.sleep(2000);
            }
	// Exploring Trésorerie
	public void Tresor() throws InterruptedException {
            driver.findElement(By.linkText("Trésorerie")).click();
            driver.findElement(By.linkText("Transactions")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Trésorerie")).click();
            driver.findElement(By.linkText("Transferts")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Trésorerie")).click();
            driver.findElement(By.linkText("OCR")).click();
            driver.findElement(By.linkText("Validate Invoices")).click();
            Thread.sleep(2000);
            }
	// Exploring Education
	public void Education() throws InterruptedException {
            driver.findElement(By.linkText("Education")).click();
            driver.findElement(By.linkText("Niveaux d'étude")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Education")).click();
            driver.findElement(By.linkText("Matières")).click();
            Thread.sleep(2000);
            }
	// Exploring Ressources Humaines
	public void HR() throws InterruptedException {
            driver.findElement(By.linkText("Ressources Humaines")).click();
            driver.findElement(By.linkText("Paie")).click();
            driver.findElement(By.linkText("Salaires")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Ressources Humaines")).click();
            driver.findElement(By.linkText("Paie")).click();
            driver.findElement(By.linkText("Analyse")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Ressources Humaines")).click();
            driver.findElement(By.linkText("Compétences")).click();
            driver.findElement(By.linkText("Tableau de Bord")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Ressources Humaines")).click();
            driver.findElement(By.linkText("Compétences")).click();
            driver.findElement(By.linkText("Compétences")).click();
            Thread.sleep(2000);
            }
	// Exploring Produits et stock
	public void Prod() throws InterruptedException {
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Produits et Services")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Sorties Stock")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Inventaires")).click();
            Thread.sleep(2000);
            }
	// Exploring CRM
	public void CRM() throws InterruptedException {
            driver.findElement(By.linkText("CRM")).click();
            driver.findElement(By.linkText("Suivi des Click")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("CRM")).click();
            driver.findElement(By.linkText("Envoyer Email")).click();
            Thread.sleep(2000);
            }
	// Exploring Vente
	public void Vente() throws InterruptedException {
            driver.findElement(By.linkText("Ventes")).click();
            driver.findElement(By.linkText("Factures Clients")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Ventes")).click();
            driver.findElement(By.linkText("Commandes Clients")).click();
            Thread.sleep(2000);
            }	
	// Exploring Espace client
	public void EC() throws InterruptedException {
            driver.findElement(By.linkText("Espace Client")).click();
            driver.findElement(By.linkText("Produits Disponibles")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Espace Client")).click();
            driver.findElement(By.linkText("Mes Factures")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Espace Client")).click();
            driver.findElement(By.linkText("Mes Devis")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Espace Client")).click();
            driver.findElement(By.linkText("Mes Commandes")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Espace Client")).click();
            driver.findElement(By.linkText("Mes Bons de Livraisons")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Espace Client")).click();
            driver.findElement(By.linkText("Mes Règlements")).click();
            Thread.sleep(2000);
            }	
	// Exploring Achats
	public void Achats() throws InterruptedException {
            driver.findElement(By.linkText("Achats")).click();
            driver.findElement(By.linkText("Factures Fournisseurs")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Achats")).click();
            driver.findElement(By.linkText("Devis Fournisseurs")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Achats")).click();
            driver.findElement(By.linkText("Commandes Fournisseurs")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Achats")).click();
            driver.findElement(By.linkText("Bons de Livraisons Fournisseurs")).click();
            Thread.sleep(2000);
            }		
	// Exploring Espace Comptable
	public void Ecomp() throws InterruptedException {
            driver.findElement(By.linkText("Espace Comptable")).click();
            driver.findElement(By.linkText("Déclarations")).click();
            Thread.sleep(2000);
            }
	// Exploring Infrastructure
	public void Infra() throws InterruptedException {
            driver.findElement(By.linkText("Infrastructure")).click();
            driver.findElement(By.linkText("Postgresql")).click();
            driver.findElement(By.linkText("Instances")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Infrastructure")).click();
            driver.findElement(By.linkText("GIT")).click();
            driver.findElement(By.linkText("NLog Charts")).click();
            Thread.sleep(2000);
            }
	// Exploring Configuration
	public void Conf() throws InterruptedException {
            driver.findElement(By.cssSelector("button.p-element:nth-child(2)")).click();
            driver.findElement(By.linkText("Général")).click();
            driver.findElement(By.linkText("Types Activités")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Général")).click();
            driver.findElement(By.linkText("Types Zones")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Contacts")).click();
            driver.findElement(By.linkText("Documents d'identités")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Mes Paramètres")).click();
            driver.findElement(By.linkText("Mes Entreprises")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Trésorerie")).click();
            driver.findElement(By.linkText("Periodes Déclaration")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Trésorerie")).click();
            driver.findElement(By.linkText("Banques")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Trésorerie")).click();
            driver.findElement(By.linkText("Taxes")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Trésorerie")).click();
            driver.findElement(By.linkText("Type de Revenues")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Productivité")).click();
            driver.findElement(By.linkText("Types Attachements")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Productivité")).click();
            driver.findElement(By.linkText("Type de calendrier")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Productivité")).click();
            driver.findElement(By.linkText("Types des Taches")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Productivité")).click();
            driver.findElement(By.linkText("Formulaires")).click();
            driver.findElement(By.linkText("Types de Formulaires")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Education")).click();
            driver.findElement(By.linkText("Types de Périodes Enseignement")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Education")).click();
            driver.findElement(By.linkText("Types de Classes")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Education")).click();
            driver.findElement(By.linkText("Disciplines")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Education")).click();
            driver.findElement(By.linkText("Session des évaluations")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Ressources Humaines")).click();
            driver.findElement(By.linkText("Catégories Employés")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Ressources Humaines")).click();
            driver.findElement(By.linkText("Paie")).click();
            driver.findElement(By.linkText("Types Salaires")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Ressources Humaines")).click();
            driver.findElement(By.linkText("Paie")).click();
            driver.findElement(By.linkText("Types de Prêts")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Ressources Humaines")).click();
            driver.findElement(By.linkText("Compétences")).click();
            driver.findElement(By.linkText("Domaines de Compétences")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Types Produits et Services")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Produits & Stock")).click();
            driver.findElement(By.linkText("Catégorie Produits et Services")).click();
            Thread.sleep(2000);
            }		
	// Logout
	public void Logout() throws InterruptedException {
            driver.findElement(By.cssSelector("button.p-link:nth-child(7) > div:nth-child(1) > app-user-icon:nth-child(2)")).click();
            driver.findElement(By.cssSelector("li.p-element:nth-child(10)")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            driver.findElement(By.cssSelector("button.p-link:nth-child(7) > div:nth-child(1) > app-user-icon:nth-child(2)")).click();
            driver.findElement(By.cssSelector("li.p-element:nth-child(12)")).click();
            System.out.println("The page title is :" + driver.getCurrentUrl());
            Thread.sleep(4000);
            }
	// Close the browser
	public void closebrowser() {
            driver.quit();
            }

	public static void main(String[] args) throws InterruptedException {
            TestMenu obj = new TestMenu();
            obj.LaunchBrowser();
            obj.Login();
            obj.Productivity();
            obj.Contact();
            obj.Tresor();
            obj.Education();
            obj.HR();
            obj.Prod();
            obj.CRM();
            obj.Vente();
            obj.EC();
            obj.Achats();
            obj.Ecomp();
            obj.Infra();
            obj.Conf();
            obj.Logout();
            obj.closebrowser();
            }
}

