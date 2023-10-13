package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class ResultPage extends BasePage {
    public ResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".mw-page-title-main")
    private WebElement pageTitle;

    public boolean isTitleCorrect(String title){
        waitElementVisibility(pageTitle);
        return pageTitle.isDisplayed() &&
                pageTitle.getText().toLowerCase().equals(title.toLowerCase());
    }
}
