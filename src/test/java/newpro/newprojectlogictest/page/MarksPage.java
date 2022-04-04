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
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

@Component
public class MarksPage {

   @Autowired
   private WebDriver driver;

   @PostConstruct
   public void MarksPage() {
      PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//div[@class=\"webix_cell\"]")
   List<WebElement> listMarks;
   
   public List<String> getListMarks() {
      return listMarks
              .stream()
              .map(ele -> ele.getText())
              .collect(Collectors.toList());
   }
   
   public void resultAssertMarks() {
      getVisibilityList(6, listMarks);
      assertThat(getListMarks(), hasItems("Lada", "BMW", "Audi", "Нива", "Волга"));
   }

   private List<WebElement> getVisibilityList(int sec, List<WebElement> list) {
      return new WebDriverWait(driver, Duration.ofSeconds(sec))
              .until(ExpectedConditions.visibilityOfAllElements(list));
   }
}
