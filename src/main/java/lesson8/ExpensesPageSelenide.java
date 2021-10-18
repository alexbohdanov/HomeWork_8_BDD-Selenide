package lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ExpensesPageSelenide {

    private SelenideElement createExpenseButton = $(By.xpath("//a[.='Создать заявку на расход']"));

    @Step("Клик на кнопку создания заявки на расход")
    public void setCreateExpenseButtonClick() {
        createExpenseButton.click();
}
}
