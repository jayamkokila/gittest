package Test_1904;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_Dropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://djangovinoth.pythonanywhere.com/exam/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/header/nav/div/div/div[2]/a[1]")).click();
		WebElement usermane =  driver.findElement(By.name("username"));
		usermane.sendKeys("kokilas");
		WebElement password =  driver.findElement(By.name("password"));
		password.sendKeys("pass123$");
		WebElement submit = driver.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button"));
		submit.click();
		WebElement skill =  driver.findElement(By.id("navbarDropdownMenuLink"));
		skill.click();
		WebElement Labpractice = driver.findElement(By.xpath("/html/body/header/nav/div/div/div[2]/li/div/a[3]"));
		Labpractice.click();
		WebElement set2 = driver.findElement(By.id("element10"));
		set2.click();
		WebElement dropdown = driver.findElement(By.id("element11"));
		dropdown.click();
		WebElement district = driver.findElement(By.id("month"));
		district.click();
		//for dropdow object created by using select.
		Select a = new Select(district);
		List<WebElement> listtxt =  a.getOptions();
		listtxt.size();
		System.out.println("Total list count is: "+listtxt.size());
		//int i;
		for(int i=0; i<listtxt.size(); i++) 
		{
			String disttext = listtxt.get(i).getText();
			System.out.println(disttext);	
		}
		
		
		

	}

}
