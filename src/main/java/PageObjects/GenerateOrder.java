package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenerateOrder {

    By chkbxAction=By.xpath("//*[@id=\"allBox_00N28000008qSVg\"]");

    By btnGenOrder=By.xpath("//input[contains(@value,'Generate Order')]");

    By chkbxISCode = By.xpath("//input[contains(@name,':checkedone')]");

    By linkGoogleLoctn = By.xpath("/html/body/form[7]/span[6]/div/div[2]/div/div[1]/table/tbody/tr[4]/td[2]/a");

    By txtLoctn = By.xpath("//*[@id=\"pac-input\"]");

    By btnSubmit = By.xpath("/html/body/form[1]/span/span/div/div/div[4]/div/div/div/div/a[1]");

    By txtCustPrefDate = By.xpath("/html/body/form[7]/span[6]/div/div[2]/div/div[1]/table/tbody/tr[6]/td[2]/input");

    By datePlusIcon = By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[1]/div/a[1]");

    By btnSetDate = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/a[1]");

    By drpdwnNoSlotReason = By.xpath("//select[contains(@id,':SelectReason')]");

    By linkSchFirstServ = By.xpath("/html/body/form[7]/span[6]/div/div[2]/div/div[1]/table/tbody/tr[8]/td[2]/a");

    By drpdwnPrefDayOfServ=By.xpath("//select[contains(@id,':preDay')]");

    By txtSchDate = By.xpath("//input[contains(@name,':S_sate')]");

    By rbtnSelSLot = By.xpath("/html/body/form[3]/div[1]/div/div/div/span[2]/table[2]/tbody/tr[2]/td[1]/input");

    By btnBookAppmnt=By.xpath("/html/body/form[3]/div[1]/div/div/div/span[3]/center/input[1]");

    By linkServConsltnQstn=By.xpath("//*[@id=\"j_id0:frm:j_id258\"]");

    //CMS Questions
    By rbtn1=By.xpath("/html/body/form[6]/div[1]/div/div/div[2]/span[1]/div/fieldset/table/tbody/tr/td[2]/input");
    By rbtn2=By.xpath("/html/body/form[6]/div[1]/div/div/div[2]/span[2]/div/fieldset/table/tbody/tr/td[2]/input");
    By rbtn3=By.xpath("/html/body/form[6]/div[1]/div/div/div[2]/span[3]/div/fieldset/table/tbody/tr/td[1]/input");
    By rbtn4=By.xpath("/html/body/form[6]/div[1]/div/div/div[2]/span[4]/div/fieldset/table/tbody/tr/td[1]/input");


    //TMS Questions

    By tmsrbtn1=By.xpath("/html/body/form[5]/div[1]/div/div/div[2]/div[1]/fieldset/table/tbody/tr/td[2]/input");
    By tmsrbtn2=By.xpath("/html/body/form[5]/div[1]/div/div/div[2]/div[2]/fieldset/table/tbody/tr/td[1]/input");
    By tmsrbtn3=By.xpath("/html/body/form[5]/div[1]/div/div/div[2]/div[3]/fieldset/table/tbody/tr/td[1]/input");
    By tmsrbtn4=By.xpath("/html/body/form[5]/div[1]/div/div/div[2]/div[4]/fieldset/table/tbody/tr/td[1]/input");
    By tmsrbtn5=By.xpath("/html/body/form[5]/div[1]/div/div/div[2]/div[5]/fieldset/table/tbody/tr/td[2]/input");
    By tmsrbtn6=By.xpath("/html/body/form[5]/div[1]/div/div/div[2]/div[6]/fieldset/table/tbody/tr/td[1]/input");

    By btnSave=By.xpath("//input[contains(@id,':saveBtn')]");

    By drpdwnPaymentMode=By.xpath("/html/body/form[7]/span[6]/div/div[2]/div/div[1]/table/tbody/tr[22]/td[2]/span/select");

    By rowColor = By.xpath("//*[@id=\"j_id0:frm2:j_id37\"]/table[2]/tbody/tr[2]");

    By btnGenerateOrder=By.xpath("/html/body/form[7]/span[6]/div/div[2]/table/tbody/tr[1]/td[2]/div[1]/input");



    WebDriver driver;

    public GenerateOrder(WebDriver driverParam){

        this.driver=driverParam;


    }
    public void generateOrder() throws InterruptedException {

        Thread.sleep(10000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("window.scrollBy(0,250)", "");

        Thread.sleep(3000);

        driver.findElement(chkbxAction).click();
        Thread.sleep(3000);

        driver.findElement(btnGenOrder).click();

        Thread.sleep(15000);
        driver.findElement(chkbxISCode).click();
        Thread.sleep(10000);

        driver.findElement(linkGoogleLoctn).click();
        Thread.sleep(10000);
        driver.findElement(txtLoctn).sendKeys("Jaswanti Landmark, Godrej & Boyce Industry Estate, Vikhroli West, Mumbai, Maharashtra, India");
        driver.findElement(btnSubmit).click();
        Thread.sleep(10000);

        driver.switchTo().alert().accept();
        Thread.sleep(5000);

        driver.findElement(txtCustPrefDate).click();
        Thread.sleep(5000);

        Actions act = new Actions(driver);
        WebElement wb = driver.findElement(datePlusIcon);
        act.doubleClick(wb).perform();
        Thread.sleep(5000);

        driver.findElement(btnSetDate).click();
        Thread.sleep(5000);

        Select sel = new Select(driver.findElement(drpdwnNoSlotReason));
        sel.selectByIndex(5);
        Thread.sleep(5000);



        driver.findElement(linkSchFirstServ).click();
        Thread.sleep(5000);

        driver.findElement(txtSchDate).click();

        Actions act1 = new Actions(driver);
        WebElement wb1 = driver.findElement(datePlusIcon);
        act1.doubleClick(wb1).perform();
        Thread.sleep(5000);

        driver.findElement(btnSetDate).click();
        Thread.sleep(7000);

        driver.findElement(rbtnSelSLot).click();
        Thread.sleep(7000);

        driver.findElement(btnBookAppmnt).click();
        Thread.sleep(5000);

        Select sel4=new Select(driver.findElement(drpdwnPrefDayOfServ));
        sel4.selectByIndex(3);
        Thread.sleep(5000);

        if(driver.getPageSource().contains("Click Here")) {
            driver.findElement(linkServConsltnQstn).click();
            Thread.sleep(5000);

            //CMS
            driver.findElement(rbtn1).click();
            Thread.sleep(5000);

            driver.findElement(rbtn2).click();
            Thread.sleep(5000);

            driver.findElement(rbtn3).click();
            Thread.sleep(5000);

            driver.findElement(rbtn4).click();
            Thread.sleep(5000);



            //TMS
//            driver.findElement(tmsrbtn1).click();
//            Thread.sleep(5000);
//            driver.findElement(tmsrbtn2).click();
//            Thread.sleep(5000);
//            driver.findElement(tmsrbtn3).click();
//            Thread.sleep(5000);
//            driver.findElement(tmsrbtn4).click();
//            Thread.sleep(5000);
//            driver.findElement(tmsrbtn5).click();
//            Thread.sleep(5000);
//            driver.findElement(tmsrbtn6).click();
//            Thread.sleep(5000);

            driver.findElement(btnSave).click();
            Thread.sleep(5000);


            js.executeScript("window.scrollBy(0,250)", "");


            js.executeScript("window.scrollBy(0,250)", "");


            js.executeScript("window.scrollBy(0,250)", "");

            Thread.sleep(5000);

            Select sel3 = new Select(driver.findElement(drpdwnPaymentMode));
            sel3.selectByIndex(1);

        }

        else {

            Select sel2 = new Select(driver.findElement(drpdwnPaymentMode));
            sel2.selectByIndex(1);

        }
        Thread.sleep(5000);
        driver.findElement(btnGenerateOrder).click();
        Thread.sleep(5000);


    }
}
