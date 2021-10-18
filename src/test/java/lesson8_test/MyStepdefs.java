package lesson8_test;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lesson8.*;


public class MyStepdefs {
        @Given("^I am authorized$")
        public void iAmAuthorized() {
            new LoginPageSelenide().login("applanatest1", "Student2020!");
        }





        @And("^I select business unit$")
        public void iSelectBusinessUnit() {
            new CreateExpensePageSelenide().selectBusinessUnit("Research & Development");
        }

        @And("^I select expenditure$")
        public void iSelectExpenditure() {
            new CreateExpensePageSelenide().selectExpenditure("01101 - ОС: вычислительная техника инфраструктуры");
        }

        @And("^I select currency$")
        public void iSelectCurrency() {
            new CreateExpensePageSelenide().selectCurrency("Доллар США");
        }

        @And("^I fill sum plan$")
        public void iFillSumPlan() {
            new CreateExpensePageSelenide().fillSumPlanInput("15");
        }

        @And("^I fill data$")
        public void iFillData() {
            new CreateExpensePageSelenide().selectPlannedDate("15");
        }

        @And("^I click save and close button$")
        public void iClickSaveAndCloseButton() {
            new CreateExpensePageSelenide().saveAndCloseButtonClick();
        }

        @Then("^I can see success message$")
        public void iCanSeeSuccessMessage() {
            new CreateExpensePageSelenide().expenseRequestCreationSuccessful.shouldBe(Condition.visible);
        }

        @Given("I hover expenses menu")
        public void iHoverExpensesMenu() {
            new MainPageSelenide().navigationMenu.openNavigationSubMenuItems("Расходы");
        }
        @And("I click create expense button")
        public void iClickCreateExpenseButton() {
        new ExpensesPageSelenide().setCreateExpenseButtonClick();
    }

        @And("I click all expenses button")
        public void iClickAllExpensesButton() {
            new ExpensesSubMenuSelenide().expensesButtonClick();
        }



        @When("I fill field expense appointment with {string}")
        public void iFillFieldExpenseAppointmentWithName(String name) {
        new CreateExpensePageSelenide().fillExpenseAppointment(name);
    }
}

