package projectEbayTests.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchItem {

    @FindBy(id = "gh-ac")
    WebElement search;


    private ChromeDriver driver ;

    public searchItem (ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    public void searchNameItem (String name){

        search.click();
        search.sendKeys(name);
        search.sendKeys(Keys.ENTER);



    }




}
