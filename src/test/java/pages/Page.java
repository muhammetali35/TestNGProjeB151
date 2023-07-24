package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page {
    public Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //burcu hanım
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;
}
