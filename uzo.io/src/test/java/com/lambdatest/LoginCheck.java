package com.lambdatest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class LoginCheck {
@Test
    public void checklog(){
    open("https://staging.uzo.io/");
    $(By.id("header-account")).click();
    sleep(1000);
    $(By.xpath("//input[@placeholder='Email']")).sendKeys("rawevi13938@etcone.net");
    $(By.xpath("//input[@placeholder='Password']")).sendKeys("qwertyqq123");
    sleep(1000);
    $(".sign-in__button").click();
    sleep(5000);
    $(By.id("__nuxt")).isDisplayed();
    $(By.className("content")).isDisplayed();

}

}
