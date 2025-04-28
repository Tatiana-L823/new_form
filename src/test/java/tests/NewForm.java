package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class NewForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }



    @Test
    void fillnewTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Viktoria");


          $("#lastName").setValue("Smith");


        $("#userEmail").setValue("smithV@gmail.com");

        $(byText("Female")).click();


       $("#userNumber").setValue("0447381234");

       $("#dateOfBirthInput").click();

      $(".react-datepicker__month-select").selectOption("May");

       $(".react-datepicker__year-select").selectOption("1990");

      $(".react-datepicker__day--015").click();

      $("#subjectsInput").setValue("Biology");

      $("#hobbies-checkbox-1").parent().click();


      $("#uploadPicture").uploadFromClasspath("Screenshot_40.png");


       $("#currentAddress").setValue("Some street 1");

        $("#state").click();
        $(byText("NCR")).click();


        $("#city").click();
        $(byText("Gurgaon")).click();


       $("#submit").click();
//
//        $("#output #firstName").shouldHave(text("Viktoria"));
//        $("#output #lastName").shouldHave(text("Smith"));
//        $("#output #email").shouldHave(text("smithV@gmail.com"));
//
//        $("#output #currentAddress").shouldHave(text("Some street 1"));
//        $("#output #permanentAddress").shouldHave(text("Some street 2"));

    }

}
