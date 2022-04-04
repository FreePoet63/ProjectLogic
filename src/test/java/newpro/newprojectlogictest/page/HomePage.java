package newpro.newprojectlogictest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Duration;

@Component
public class HomePage {
    @Autowired
    private WebDriver driver;

    @PostConstruct
    public void HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()=\"Marks\"]")
    private WebElement clickMarks;

    @FindBy(xpath = "//button[text()=\"Cars\"]")
    private WebElement clickCars;

    @FindBy(xpath = "//button[text()=\"Model\"]")
    private WebElement clickModels;

    public void buttonMarks() {
        getWaitClickableButton(5, clickMarks);
        clickMarks.click();
    }

    public void buttonCars() {
        getWaitClickableButton(5, clickCars);
        clickCars.click();
    }

    public void buttonModels() {
        getWaitClickableButton(5, clickModels);
        clickModels.click();
    }

    private void getWaitClickableButton(int sec, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(sec))
                .until(ExpectedConditions.elementToBeClickable(element));
    }
}
