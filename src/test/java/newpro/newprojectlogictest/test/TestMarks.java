package newpro.newprojectlogictest.test;

import newpro.newprojectlogictest.page.MainPage;
import newpro.newprojectlogiс.NewprojectlogicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = NewprojectlogicApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TestMarks {

    @Autowired
    private MainPage mainPage;

    @Test
    public void resultMarks() {
        mainPage.getListMarks();
    }
}
