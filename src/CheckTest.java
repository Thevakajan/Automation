import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Selanium//chromedriver_win32_3//chromedriver.exe ");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/?stype=lo&jlou=AfdwAvtGGC7AiIpse5TTG4huWtoqArm1GXXD_hqTDNAuuA_R1BVFd5XcQ4Hyl6aF93WRSpguO4HGfvOua1b_b8gH1-5ZmGapsdT26ASsyJu7RQ&smuh=32360&lh=Ac8ebceAgEE-GOcz/");
         
//         driver.findElement(By.id("email")).clear();
//         driver.findElement(By.id("email")).sendKeys("");
//          driver.findElement(By.id("pass")).clear();
//         driver.findElement(By.id("pass")).sendKeys("");
//         driver.findElement(By.id("u_0_2")).click();
   
         driver.findElement(By.name("firstname")).sendKeys("Theva");
         driver.findElement(By.name("lastname")).sendKeys("Kajan");
         driver.findElement(By.name("reg_email__")).sendKeys("Thevakajan3@gmail.com");
         driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Thevakajan3@gmail.com");
         driver.findElement(By.name("reg_passwd__")).sendKeys("0777507231");
         driver.findElement(By.name("birthday_day")).sendKeys("10");
         driver.findElement(By.name("birthday_month")).sendKeys("Jun");//u_0_a
         driver.findElement(By.name("birthday_year")).sendKeys("1996");
         driver.findElement(By.name("sex")).click();
       //  driver.findElement(By.class("_58mt")).sendKeys("1996");
         driver.findElement(By.name("websubmit")).click();
         
         //System.out.println("Login Good");
	}

}
