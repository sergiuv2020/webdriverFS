import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//*[@id='user_header']//a[text()=\"Contul meu\"]")
    private WebElement autButton;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAutButton() {
        return autButton;
    }

    public void clickLogin() {
        getAutButton().click();
    }
    
}
