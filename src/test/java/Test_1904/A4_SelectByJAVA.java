package Test_1904;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4_SelectByJAVA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver web = new ChromeDriver();
		web.get("https://djangovinoth.pythonanywhere.com/exam/");
		web.manage().window().maximize();
		web.findElement(By.xpath("/html/body/header/nav/div/div/div[2]/a[1]")).click();
		WebElement username =  web.findElement(By.name("username"));
		username.sendKeys("kokilas");
		WebElement password =  web.findElement(By.name("password"));
		password.sendKeys("pass123$");
		WebElement submit = web.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button"));
		submit.click();
		WebElement skill =  web.findElement(By.id("navbarDropdownMenuLink"));
		skill.click();
		WebElement lab = web.findElement(By.xpath("/html/body/header/nav/div/div/div[2]/li/div/a[3]"));
		lab.click();
		WebElement set2 = web.findElement(By.id("element10"));
		set2.click();
		WebElement ddown = web.findElement(By.id("element11"));
		ddown.click();
		WebElement ddtxt = web.findElement(By.name("month"));
		ddtxt.click();
		List<WebElement> optxt = web.findElements(By.tagName("option"));
		optxt.size();
		
			
	}

}
