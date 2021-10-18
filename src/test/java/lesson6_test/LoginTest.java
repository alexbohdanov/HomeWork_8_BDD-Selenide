package lesson6_test;

import com.geekbrains.lesson6.CreateExpensePage;
import com.geekbrains.lesson6.ExpensesSubMenu;
import com.geekbrains.lesson6.LoginPage;
import com.geekbrains.lesson6.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Story("Заявка на расход")
public class LoginTest extends BaseTest{



    @BeforeEach
    void goToBasePage() {

        webDriver.get("https://crm.geekbrains.space/");
    }

    @Test
    @Description("Тест создания заявки на расход")
    @TmsLink("234")
    void loginTest() throws InterruptedException {
        new LoginPage(webDriver)
                .fillLogin("Applanatest1")
                .fillPassword("Student2020!")
                .submitLogin();

        new MainPage(webDriver).navigationMenu.openNavigationSubMenuItems("Расходы");
        new ExpensesSubMenu(webDriver)
                .expensesButtonClick()
                .setCreateExpenseButtonClick();

        new CreateExpensePage(webDriver)
                .fillExpenseAppointment("test")
                .selectBusinessUnit("Research & Development")
                .selectExpenditure("01101 - OC: вычислительная техника инфраструктуры")
                .selectCurrency("Доллар США")
                .fillSumPlanInput("100")
                .selectPlannedDate("15")
                .saveAndCloseButtonClick();


        webDriverWait.until(ExpectedConditions.invisibilityOf(webDriver.findElement(By.xpath("//div[@class='loader-frame well']"))));

        Assertions.assertTrue(webDriver.findElement(By.xpath("//*[.='Заявка на расход сохранена']")).isDisplayed());

        webDriver.get("https://afisha.ru");

    }


    }

