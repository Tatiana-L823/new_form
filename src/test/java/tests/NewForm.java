package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
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

      $("#subjectsInput").setValue("Biology").pressEnter();

      $("#hobbies-checkbox-1").parent().click();


      $("#uploadPicture").uploadFromClasspath("Screenshot_40.png");


       $("#currentAddress").setValue("Some street 1");

        $("#state").scrollIntoView(true).click();
        $(byText("NCR")).click();

        $("#city").scrollIntoView(true).click();
        $(byText("Gurgaon")).click();



        $("#submit").click();

        // After submitting
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form")); // check modal appears

        $(".table-responsive").shouldHave(
                text("Viktoria Smith"),
                text("smithV@gmail.com"),
                text("Female"),
                text("0447381234"),
                text("15 May,1990"),
                text("Biology"),
                text("Sports"),
                text("Screenshot_40.png"),
                text("Some street 1"),
                text("NCR Gurgaon")
        );
        $("#closeLargeModal").click();

// Assert modal is closed
        $(".modal-content").shouldNot(appear);
//
//        $("#output #firstName").shouldHave(text("Viktoria"));
//        $("#output #lastName").shouldHave(text("Smith"));
//        $("#output #email").shouldHave(text("smithV@gmail.com"));
//
//        $("#output #currentAddress").shouldHave(text("Some street 1"));
//        $("#output #permanentAddress").shouldHave(text("Some street 2"));

    }

}
