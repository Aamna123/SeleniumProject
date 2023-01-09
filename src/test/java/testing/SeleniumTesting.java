package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTesting {

	 public static void addTodo( WebDriver driver ) throws InterruptedException {
		 String todoStr = "TODO ADD TEST";
//		 driver.get("https://todo-list-aamna.netlify.app/");
//			driver.manage().window().maximize();
		      Thread.sleep(1000);

			 driver.findElement(By.id("add-input")).click();
			 Thread.sleep(1000);

			 driver.findElement(By.id("add-input")).sendKeys(todoStr);
			 Thread.sleep(1000);

			 driver.findElement(By.id("add-btn")).click();
			 Thread.sleep(1000);

			 WebElement l = driver.findElement(By.id("todo-0"));

			    String addedVal = l.getText();
		
			if(addedVal.equalsIgnoreCase(todoStr)) {
				System.out.println("ADD SUCCESS");}
			
		    else
		    {
			System.out.println("ADD FAIL");
		    }
	 }
	 
	 public static void clearTodos( WebDriver driver ) throws InterruptedException {

//		 driver.get("https://todo-list-aamna.netlify.app/");
//			driver.manage().window().maximize();
		      Thread.sleep(1000);

			 driver.findElement(By.id("clear-btn")).click();
			 Thread.sleep(1000);
			 
			 int l = driver.findElements(By.className("todo")).size();

			if(l==0) {
				System.out.println("CLEAR SUCCESS");}
			
		    else
		    {
			System.out.println("CLEAR FAIL");
		    }
	 }
	 public static void removeTodo(WebDriver driver ) throws InterruptedException {
		
//		 driver.get("https://todo-list-aamna.netlify.app/");
//			driver.manage().window().maximize();
		      Thread.sleep(1000);

		      driver.findElement(By.id("delete-btn-0")).click();
		      Thread.sleep(1000);
			 int l = driver.findElements(By.id("todo-0")).size();

			if(l==0) {
				System.out.println("REMOVE SUCCESS");}
			
		    else
		    {
			System.out.println("REMOVE FAIL");
		    }
	 } 
	 public static void checkTodo( WebDriver driver ) throws InterruptedException {
		
//		 driver.get("https://todo-list-aamna.netlify.app/");
//			driver.manage().window().maximize();
		      Thread.sleep(1000);

			 driver.findElement(By.id("add-input")).click();
			 Thread.sleep(1000);

			 driver.findElement(By.id("add-input")).clear();
			 Thread.sleep(1000);
			 driver.findElement(By.id("add-input")).sendKeys("todo to check");
			 Thread.sleep(1000);

			 driver.findElement(By.id("add-btn")).click();
			 Thread.sleep(1000);
		

			 driver.findElement(By.id("checkbox-todo-0")).click();
			 Thread.sleep(1000);
			 boolean isChecked = driver.findElement(By.id("checkbox-todo-0")).isSelected();

			if(isChecked) {
				System.out.println("CHECK SUCCESS");}
			
		    else
		    {
			System.out.println("CHECK FAIL");
		    }
	 }
	 
	 public static void uncheckTodo(  WebDriver driver) throws InterruptedException {
		
//		 driver.get("https://todo-list-aamna.netlify.app/");
//			driver.manage().window().maximize();
		      Thread.sleep(1000);

			 driver.findElement(By.id("add-input")).click();
			 Thread.sleep(1000);

			 driver.findElement(By.id("add-input")).clear();
			 Thread.sleep(1000);
			 driver.findElement(By.id("add-input")).sendKeys("uncheck todo");
			 Thread.sleep(1000);

			 driver.findElement(By.id("add-btn")).click();
			 Thread.sleep(1000);

			 driver.findElement(By.id("checkbox-todo-1")).click();
			 Thread.sleep(1000);

			 driver.findElement(By.id("checkbox-todo-1")).click();
			 Thread.sleep(1000);
			 boolean isChecked = driver.findElement(By.id("checkbox-todo-1")).isSelected();
	

			if(!isChecked) {
				System.out.println("UNCHECK SUCCESS");}
			
		    else
		    {
			System.out.println("UNCHECK FAIL");
		    }
	 }
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.silentOutput", "true");
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nexgen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions().setHeadless(true);
 
		WebDriver driver = new ChromeDriver(options);

		 driver.get("https://todo-list-aamna.netlify.app/");
			driver.manage().window().maximize();
		addTodo(driver);
		removeTodo(driver);
		checkTodo(driver);
		uncheckTodo(driver);
		clearTodos(driver);
		driver.close();

}}
