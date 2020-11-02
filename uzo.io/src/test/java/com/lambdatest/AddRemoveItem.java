package com.lambdatest;



import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.title;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveItem  {
    @Test
    public void addremove(){
        open("https://staging.uzo.io/");
        $("[data-id='13339']").click();
        sleep(1000);
        $(By.cssSelector("button")).click();
        sleep(2000);
        $(By.className("sidebar-wrapper")).isDisplayed();

        $(".widget-button.secondary[href='/en/cart']").click();
        sleep(2000);
        $(By.xpath("//*[@id=\"cart\"]/div/div/div[1]/div[5]/div/div[2]/span")).click();
        sleep(2000);
        $(By.className("info-message-title")).shouldHave(Condition.text("Your shopping cart is empty"));
        sleep(2000);
    }
}
