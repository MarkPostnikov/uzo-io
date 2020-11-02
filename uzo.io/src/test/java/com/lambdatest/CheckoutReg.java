package com.lambdatest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.title;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;


public class CheckoutReg {
    @Test
    public void checkreg(){
        LoginCheck object = new LoginCheck();
        object.checklog();
        open("https://staging.uzo.io/");
        $("[data-id='13339']").click();
        sleep(1000);
        $(".add-to-cart").click();
        $(".widget-button.success").click();
        sleep(1000);
        $(By.xpath("//input[@placeholder='First name']")).sendKeys("TestUserName");
        $(By.xpath("//input[@placeholder='Last name']")).sendKeys("TestUserLastname");
        $(By.xpath("//input[@placeholder='Street and number']")).sendKeys("Koploperstraat 50");
        $(".uzo-popover__item").click();
        //$(By.xpath("//input[@placeholder='City']")).sendKeys("Beverli Hills");
        //$(By.xpath("//input[@placeholder='Zip Code']")).sendKeys("90210");
        $(By.xpath("//input[@placeholder='Phone']")).sendKeys("84343442423");
        sleep(100);
        $(".payment-option__option").click();
        $("#root > form > div > div.CardField-input-wrapper.is-ready-to-slide").sendKeys("42424242424242");
        $(".uzo-button.uzo-button--disabled").click();

        sleep(4000);

    }
}
