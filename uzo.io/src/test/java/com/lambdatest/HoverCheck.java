package com.lambdatest;



import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;


public class HoverCheck {
    @Test
    public void checkhover(){
        open("https://staging.uzo.io/");
        sleep(1000);
        $(By.id("header-account")).hover().isDisplayed();
        sleep(1000);
        $(By.id("__bv_popover_220__")).isDisplayed();
        $(By.id("header-wishlist")).hover().isDisplayed();
        $(By.id("__bv_popover_221__")).isDisplayed();
        $(By.id("header-cart")).hover().isDisplayed();
        $(By.id("__bv_popover_222__")).isDisplayed();

    }
}
