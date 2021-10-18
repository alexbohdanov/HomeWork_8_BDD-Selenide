package lesson8_test;


import com.codeborne.selenide.Selenide;
import io.cucumber.junit.Cucumber;
import org.junit.After;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefenitions {
    @After
    public void after() {
        Selenide.closeWebDriver();
    }
}
