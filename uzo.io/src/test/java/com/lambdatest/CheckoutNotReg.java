package com.lambdatest;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.title;


import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;


public class CheckoutNotReg  {
@Test
public void testcheckoutworeg (){
    open("https://staging.uzo.io/");
    $("[data-id='13339']").click();
    sleep(1000);
    $(".add-to-cart").click();
    $(".widget-button.success").click();
    sleep(1000);
    $("button.-bg").click();
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(1000);
    $("input.email[placeholder='Email']").sendKeys("username"+randomInt+"@test123.com");
    sleep(1000);
    $(By.xpath("//input[@placeholder='First name']")).sendKeys("TestUserName");
    $(By.xpath("//input[@placeholder='Last name']")).sendKeys("TestUserLastname");
    $(By.xpath("//input[@placeholder='Street and number']")).sendKeys("Koploperstraat 50");
    $(".uzo-popover__item").click();
    //$(By.xpath("//input[@placeholder='City']")).sendKeys("Beverli Hills");
    //$(By.xpath("//input[@placeholder='Zip Code']")).sendKeys("90210");
    $(By.xpath("//input[@placeholder='Phone']")).sendKeys("84343442423");
    $(".payment-option__option").click();
    $("#root > form > div > div.CardField-input-wrapper.is-ready-to-slide").scrollTo().sendKeys("42424242424242");
    $(".uzo-button.uzo-button--disabled").click();
    sleep(100);

    sleep(4000);




    //чекаут пока не делать ждем нового диза//
}
}
