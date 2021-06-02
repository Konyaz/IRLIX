package tests;


import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class ITestTests extends TestBase {

    @Test
    void successfulFillFormTest() {
        step("Open Website", () -> {
            open("https://irlix.com/");
        });
        step(" Check Menu", () -> {
            $(byText("МЕНЮ")).click();
            $("a.footer-cta").shouldHave(text("Связаться с нами"));
        });
        step(" Check Contacts", () -> {
            $(byLinkText("Контакты")).click();
            $("h2").shouldHave(text("Свяжитесь с нами!"));
        });
        step(" Check Career", () -> {
            $(byText("МЕНЮ")).click();
            $(byLinkText("Вакансии")).click();
            $("h2").shouldHave(text("Новые продукты с интересными людьми?"));
        });
    }
}
