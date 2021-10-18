package lesson8;

import com.codeborne.selenide.SelenideElement;

import com.geekbrains.lesson6.ExpensesPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ExpensesSubMenuSelenide {

    private SelenideElement createExpenseButton = $(By.xpath("//span[.='Заявки на расходы']"));



    @Step("Клик на кнопку Расходы")
    public ExpensesPage expensesButtonClick() {
        createExpenseButton.click();
        return page(ExpensesPage.class);

    }
}

