package lesson8;

import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;
import org.openqa.selenium.By;


import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class NavigationMenuSelenide {
    private List<SelenideElement> NavigationMenuItemsSelenide = $$(By.xpath("//ul[@class='nav nav-multilevel main-menu']/li"));

    @Step("Открыть пункт навигационного меню")
    public void openNavigationSubMenuItems(String menuName) {
        NavigationMenuItemsSelenide.stream().filter(element -> element.getText().equals(menuName))
                .findFirst().get().hover();
    }

    }


