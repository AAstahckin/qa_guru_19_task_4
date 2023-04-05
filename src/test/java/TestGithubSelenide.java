import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestGithubSelenide extends TestBase {

    @Test
    void searchJunitFromSelenide() {

        open("/selenide/selenide");
        $("#repository-container-header").shouldHave(text("selenide"));
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("[data-filterable-for=wiki-pages-filter]").$(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("2. Using JUnit4 just describe rule inside test class:"));

    }

}
