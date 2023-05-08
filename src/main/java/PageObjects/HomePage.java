package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver=driver;
    }




    By leadLink = By.xpath("//a[contains(@title,'Leads Tab')]");

    By newBtn = By.xpath("//input[contains(@title,'New')]");

    By contBtn=By.xpath("//input[contains(@title,'Continue')]");




    public void clickleadLink(){

        driver.findElement(leadLink).click();
    }

    public void clicknewBtn(){

        driver.findElement(newBtn).click();

    }

    public void clickContBtn(){

        driver.findElement(contBtn).click();
    }
}

