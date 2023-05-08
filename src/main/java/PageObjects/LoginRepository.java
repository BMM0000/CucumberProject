package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRepository {

   WebDriver driver;

   By txtUserName = By.xpath("//input[contains(@name,'username')]");
   By txtPwd = By.xpath("//input[contains(@name,'pw')]");
   By btnLogin=By.xpath("//input[contains(@name,'Login')]");

   By closeBtn=By.xpath("//a[contains(@id,'tryLexDialogX')]");




   public LoginRepository(WebDriver driverParam){

      this.driver=driverParam;
   }

//   public void navigateToUrl() throws InterruptedException {
//      System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
//      driver=new ChromeDriver();
//      driver.get("https://login.salesforce.com/?locale=in");
//      Thread.sleep(5000);
//      driver.manage().window().maximize();
//   }

   public void enterUserName(String userName){

      driver.findElement(txtUserName).sendKeys(userName);

   }
   public void enterPassword(String pwd){

      driver.findElement(txtPwd).sendKeys(pwd);

   }

   public void clickSubmit() throws InterruptedException {

      driver.findElement(btnLogin).click();
      Thread.sleep(6000);

   }
//   public void clickCloseBtn() throws InterruptedException {
//
//      driver.findElement(closeBtn).click();
//
//
//
//   }



}
