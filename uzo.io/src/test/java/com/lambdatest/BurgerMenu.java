package com.lambdatest;




import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.title;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BurgerMenu {
    @Test
    public void menuside (){
        open("https://staging.uzo.io/");
        $(By.className("sidebar-menu")).click();
        sleep(2000);
        $(By.id("sidebar-widget")).isDisplayed();
        $(By.className("sidebar-body")).isDisplayed();
        $(By.xpath("//*[@id=\"sidebar-widget\"]/div/div[2]/div/div[1]/div")).click();
        sleep(5000);
        $(By.className("col")).shouldHave(Condition.text("Women’s Fashion"));
    }
}
