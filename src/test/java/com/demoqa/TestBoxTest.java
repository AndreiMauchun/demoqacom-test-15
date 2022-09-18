package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTest {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void FillFormTest() {
        String name = "Akim";

        open ("/text-box");
        $("#userName").setValue(name);
        $("#userEmail").setValue("Akim@gmail.com");
        $("#currentAddress").setValue("Orlovskogo 1 ");
        $("#permanentAddress").setValue("Another address 2 ");
        $("#submit").click();

        $("#output #name").shouldHave(text(name));
        $("#output #email").shouldHave(text("Akim@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Orlovskogo 1"));
        $("#output #permanentAddress").shouldHave(text("Another address 2"));





    }
}
