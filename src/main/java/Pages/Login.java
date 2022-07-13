package Pages;

import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BasePage {
    @FindBy(xpath = "//input[@autocomplete=\"username\"]")
    WebElement inputUsername;

    @FindBy(xpath = "//span[text()=\"Next\"]")
    WebElement nextButton;

    public Login(){
        PageFactory.initElements(driver, this);
    }

public void hey(){
    System.out.println("Holis");
}

}
