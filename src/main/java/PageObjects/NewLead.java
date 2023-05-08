package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewLead {
    public static WebDriver driver;

    public NewLead(WebDriver driverParam){

        this.driver=driverParam;
    }

    By drpSubSource = By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[1]/fieldset/table/tbody/tr[7]/td[2]/span/select");
    By drpStatus = By.xpath("//select[contains(@id,':staus')]");
    By drpDwnSaltn = By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[1]/fieldset/table/tbody/tr[27]/td[2]/div/select");
                                            
    By txtFname = By.xpath("//input[contains(@id,':firstName')]");
    By txtLname = By.xpath("//input[contains(@id,':lastName')]");
    By txtCustMob = By.xpath("//input[contains(@id,':mob')]");
    By txtEmail = By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[1]/fieldset/table/tbody/tr[31]/td[2]/input");
    By txtPinCode = By.xpath("//html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[1]/fieldset/table/tbody/tr[32]/td[2]/input");
    By drpDwnIndSeg = By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[1]/fieldset/table/tbody/tr[35]/td[2]/select");

    By drpDwnBHK = By.xpath("//html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[1]/fieldset/table/tbody/tr[36]/td[2]/span/select");
    By drpDwnIntrstdServ = By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[1]/fieldset/table/tbody/tr[40]/td[2]/select");

    By txtWingFlat = By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[2]/div/fieldset/table/tbody/tr[3]/td[2]/input");

    By txtBldgNm = By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[2]/div/fieldset/table/tbody/tr[4]/td[2]/input");

    By txtStAdrrss = By.xpath("//input[contains(@id,':autocomplete')]");

    By txtLocality = By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[2]/div/fieldset/table/tbody/tr[6]/td[2]/input");

    By txtLandMark = By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[2]/div/fieldset/table/tbody/tr[7]/td[2]/input");

    By btnSave=By.xpath("//html/body/div/div[2]/table/tbody/tr/td[2]/form[2]/div[2]/div/fieldset/table/tbody/tr[21]/td[2]/div[1]/input");

    By btnEdit=By.xpath("//*[@id=\"topButtonRow\"]/input[1]");

    By txtExpValue=By.xpath("//input[contains(@id,':Exp_Value')]");

    By txtExpDate=By.xpath("//input[contains(@id,':Exp_Date')]");

    By datePlusIcon=By.xpath("//*[@id=\"dtBox\"]/div/div/div/div/div[2]/div[1]/div/a[1]");

    By btnSetDate=By.xpath("//*[@id=\"dtBox\"]/div/div/div/div/div[3]/a[1]");



    public void newLead() throws InterruptedException {


        Thread.sleep(7000);
        Select sel = new Select(driver.findElement(drpSubSource));
        sel.selectByIndex(2);
        Thread.sleep(2000);

        Select sel0=new Select(driver.findElement(drpStatus));
        sel0.selectByIndex(2);
        Thread.sleep(2000);

        Select sel1 = new Select(driver.findElement(drpDwnSaltn));
        sel1.selectByIndex(1);
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String str1 = format.format(date);

        String str = "Test Lead BHAV Ind " + " " + str1;


        driver.findElement(txtFname).sendKeys(str);
        driver.findElement(txtLname).sendKeys(str);
        driver.findElement(txtCustMob).sendKeys("109");
        driver.findElement(txtEmail).sendKeys("test@gmail.com");
        driver.findElement(txtPinCode).sendKeys("400079");

        Select sel2 = new Select(driver.findElement(drpDwnIndSeg));
        sel2.selectByIndex(3);
        Thread.sleep(3000);



        Select sel3 = new Select(driver.findElement(drpDwnBHK));
        sel3.selectByIndex(3);
        Thread.sleep(3000);

        driver.findElement(txtExpValue).sendKeys("7500");

        driver.findElement(txtExpDate).click();
        Thread.sleep(5000);

        Actions act=new Actions(driver);
        WebElement wb=driver.findElement(datePlusIcon);
        act.doubleClick(wb).perform();
        Thread.sleep(5000);

        driver.findElement(btnSetDate).click();
        Thread.sleep(5000);

        Select sel4 = new Select(driver.findElement(drpDwnIntrstdServ));
        sel4.selectByIndex(2);
        Thread.sleep(5000);


        driver.findElement(txtWingFlat).sendKeys(str);
        driver.findElement(txtBldgNm).sendKeys(str);
        driver.findElement(txtStAdrrss).sendKeys(str);
        driver.findElement(txtLocality).sendKeys(str);
        driver.findElement(txtLandMark).sendKeys(str);
        //driver.findElement(btnSave).click();
        Thread.sleep(8000);

        //driver.findElement(btnEdit).click();

//        Select sel5=new Select(driver.findElement(drpStatus));
//        sel5.selectByIndex(2);





        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(2000);





    }

    public void clickSaveBtn(){

        driver.findElement(btnSave).click();


    }



}
