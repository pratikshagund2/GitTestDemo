//package stepDefination;
//
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//
//public class LoginStepDefination {
//
//	
//	WebDriver driver;
//	@Given("^User is already on Login page$")
//	public void user_is_already_on_Login_page() throws InterruptedException  {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hP\\new_eclipse_workspace\\Cucumberbdd\\chromedriver.exe");
//	    driver=new ChromeDriver(); 	    
//	    driver.manage().window().maximize();
//	   driver.get("https://freecrm.com/");
//
//	}
//
//	@When("^Title of login page is free CRM$")
//	public void title_of_login_page_is_free_CRM() throws InterruptedException  {
//	  
//		Thread.sleep(2000);
//		String title=driver.getTitle();
//		System.out.println("Title of CRM is: "+title);
//		Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
//		   Thread.sleep(2000);
//	}
//	
//	
//	//Reg Exp:
////	 //1. \"([^\"]*)\"
////	 //2. \"(.*)\"
//
//
////	@Then("^User enters username  and Password$")
////	public void user_enters_username_and_Password() throws Exception {
////	    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/a")).click();
////		Thread.sleep(5000);
////		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("gundpratiksha@gmail.com");
////	 driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Pratiksh@2");
////	}
//
//	//\"(.*)\" for simple example
//	@Then("^User enters \"(.*)\"  and \"(.*)\"$")
//	public void user_enters_username_and_Password( String username,String password) throws Exception {
//	    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/a")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys(username);
//	 driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys(password);
//	}
//	@Then("^user clicks on login Button$")
//	public void user_clicks_on_login_Button()  {
//		
//		WebElement  loginBtn=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//	   
//	}
//
//	 @Then("^user is on home page$")
//	 public void user_is_on_hopme_page(){
//	 String title = driver.getTitle();
//	 System.out.println("Home Page title ::"+ title);
//	 Assert.assertEquals("Cogmento CRM", title);
//	 }
//
////	 @Then("^Close the browser$")
////	 public void close_the_browser(){
////		 driver.close();
////	 }
//}
