package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void SetUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
