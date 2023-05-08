package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpportunityDetail {

    public static WebDriver driver;

    By btnNewServPicthd = By.xpath("//input[contains(@value,'New Services Pitched')]");

    By drpdwnServGrp = By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/span/div/span[2]/div[2]/table/tbody/tr[1]/td[2]/select");

    By drpdwnServPlan = By.xpath("//select[contains(@id,':SerAreaId')]");

    By btnAddServ = By.xpath("//input[contains(@value,'Add Service')]");

    By btnSaveAllServReq = By.xpath("//input[contains(@id,':createbtn')]");

    public OpportunityDetail(WebDriver driverParam) {

        this.driver = driverParam;

    }

    public void clickNewSerPitchd() throws InterruptedException {

        Thread.sleep(8000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,250)", "");

        Thread.sleep(5000);

        driver.findElement(btnNewServPicthd).click();
        Thread.sleep(8000);

        //CMS Service
//        Select sel = new Select(driver.findElement(drpdwnServGrp));
//        sel.selectByIndex(5);
//        Thread.sleep(5000);

        //FMS Service
//        Select sel2 = new Select(driver.findElement(drpdwnServGrp));
//        sel2.selectByIndex(7);
//        Thread.sleep(5000);

        //RMS Service
        Select sel3 = new Select(driver.findElement(drpdwnServGrp));
        sel3.selectByIndex(16);
        Thread.sleep(5000);

        //MMS Service
//        Select sel4 = new Select(driver.findElement(drpdwnServGrp));
//        sel4.selectByIndex(13);
//        Thread.sleep(5000);


        //TMSPOST Service
//        Select sel5 = new Select(driver.findElement(drpdwnServGrp));
//        sel5.selectByIndex(21);
//        Thread.sleep(5000);



        //CMS Plan
//        Select sel5 = new Select(driver.findElement(drpdwnServPlan));
//        sel5.selectByIndex(1);
//        Thread.sleep(5000);

        //FMS Plan
//        Select sel6 = new Select(driver.findElement(drpdwnServPlan));
//        sel6.selectByIndex(1);
//        Thread.sleep(5000);

        //RMS Plan
        Select sel7 = new Select(driver.findElement(drpdwnServPlan));
        sel7.selectByIndex(2);
        Thread.sleep(5000);

        //MMS Plan
//        Select sel8 = new Select(driver.findElement(drpdwnServPlan));
//        sel8.selectByIndex(3);
//        Thread.sleep(5000);


////        //TMSPOST Plan
//        Select sel9 = new Select(driver.findElement(drpdwnServPlan));
//        sel9.selectByIndex(5);
//        Thread.sleep(5000);

        driver.findElement(btnAddServ).click();
        Thread.sleep(5000);

    }


    public void clickSaveAllServicesRequest() throws InterruptedException {

        driver.findElement(btnSaveAllServReq).click();
    }
}



