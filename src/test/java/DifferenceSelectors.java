import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DifferenceSelectors {

    @Test
    void difference1() {

        open("https://qa.guru/");
        String s1 = $("div.container-std div.how-we-teach__container").getText();
        System.out.println("$(\"div.container-std div.how-we-teach__container\") -> " + s1);
        
    }

    @Test
    void difference2() {

        open("https://qa.guru/");
        String s1 = $("div.container-std").$("div.how-we-teach__container").getText();
        System.out.println("$(\"div.container-std\").$(\"div.how-we-teach__container\") -> " + s1);
        
    }

}
