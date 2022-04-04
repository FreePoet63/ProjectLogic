package newpro.newprojectlogictest.page;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends AbstractPage{

    @Value("${url.page}")
    private String BASE_URL;

    @Autowired
    private HomePage homePage;

    @Autowired
    private MarksPage marksPage;

    @Autowired
    private CarsPage carsPage;

    @Autowired
    private ModelsPage modelsPage;

    @Autowired
    private WebDriver driver;

    public void getListMarks() {
        openPage();
        homePage.buttonMarks();
        marksPage.resultAssertMarks();
    }

    public void getListCars() {
        openPage();
        homePage.buttonCars();
        carsPage.resultAssertCars();
    }

    public void getListModels() {
        openPage();
        homePage.buttonModels();
        modelsPage.resultAssertModels();
    }

    @Override
    protected AbstractPage openPage() {
        driver.manage().window().maximize();
        driver.navigate().to(BASE_URL);
        return this;
    }
}
