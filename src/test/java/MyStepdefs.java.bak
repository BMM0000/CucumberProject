import PageObjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
     //WebDriver driver;
     public  static WebDriver driver;
    LoginRepository objLoginRepository;
    HomePage objHomePage;

    NewLead objNewLead;

    OpportunityDetail objOppDetail;

    GenerateOrder objGenerateOrder;


    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.gecko.driver","D:\\\\geckodriver.exe");
        driver=new FirefoxDriver();
        //driver.get("https://login.salesforce.com/?locale=in");
        driver.get("https://test.salesforce.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println("Successfully Navigated");

    }

    @And("User Enters UserName")
    public void user_enters_user_name() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(8000);
        objLoginRepository=new LoginRepository(driver);
        objLoginRepository.enterUserName("hemangi.kadam@hicare.in");
        System.out.println("Enters user name");

    }

    @And("User Enters Password")
    public void user_enters_password() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(8000);
        objLoginRepository=new LoginRepository(driver);
        objLoginRepository.enterPassword("welcome1");
        System.out.println("Enters password");

    }

    @And("User clicks login button")
    public void userClicksLoginButton() throws InterruptedException {
        Thread.sleep(8000);
        objLoginRepository=new LoginRepository(driver);
        objLoginRepository.clickSubmit();
        System.out.println("Submit button clicked");

    }


//    @Then("User Should get a successful login message")
//    public void userShouldGetASuccessfulLoginMessage() throws InterruptedException {
//
//        Thread.sleep(20000);
//        objLoginRepository=new LoginRepository(driver);
//        objLoginRepository.clickCloseBtn();
//
//
//
//
//
////    String actTitle= driver.getTitle();
////    String expctdTitle="Salesforce - Enterprise Edition";
//
//
////    if(actTitle.equalsIgnoreCase(expctdTitle) ){
////
////        System.out.println("Login Successful");
////    }
////    else {
////        System.out.println("Invalid Login");
////    }
////
// }


    @When("user clicks on leads tab")
    public void user_clicks_on_leads_tab() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actionsThread.sleep(7000);
        Thread.sleep(8000);
         objHomePage=new HomePage(driver);
        objHomePage.clickleadLink();



    }
    @When("user clicks on new button")
    public void user_clicks_on_new_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        objHomePage=new HomePage(driver);
        objHomePage.clicknewBtn();


    }
    @When("user clicks continue")
    public void user_clicks_continue() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        objHomePage=new HomePage(driver);
        objHomePage.clickContBtn();

    }

    @Then("user should be on New Lead Page")
    public void userShouldBeOnNewLeadPage() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("User on New Lead Page");

    }

    @When("user creates lead")
    public void userCreatesLead() throws InterruptedException {

         Thread.sleep(3000);
         objNewLead=new NewLead(driver);
         objNewLead.newLead();
    }

    @And("user clicks on save")
    public void userClicksOnSave() throws InterruptedException {
        Thread.sleep(3000);
        objNewLead.clickSaveBtn();

    }


    @When("user clicks on New Services Pitched")
    public void userClicksOnNewServicesPitched() throws InterruptedException {
        Thread.sleep(10000);
        objOppDetail=new OpportunityDetail(driver);
        objOppDetail.clickNewSerPitchd();

    }

    @And("user clicks on Save All Service Request")
    public void userClicksOnSaveAllServiceRequest() throws InterruptedException {
        Thread.sleep(3000);
        objOppDetail.clickSaveAllServicesRequest();

    }


    @Then("user should be navigated to Opportunity Details Page")
    public void userShouldBeNavigatedToOppurtunityDetailsPage() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("User is on Opportunity Details Page");
    }


    @When("user is on opportunity details page")
    public void user_is_on_opportunity_details_page() throws InterruptedException {

        Thread.sleep(3000);
        System.out.println("User is on opportunity details page.");

    }

    @And("user generates order")
    public void userGeneratesOrder() throws InterruptedException {

        Thread.sleep(3000);
        objGenerateOrder=new GenerateOrder(driver);
        objGenerateOrder.generateOrder();


    }



}
