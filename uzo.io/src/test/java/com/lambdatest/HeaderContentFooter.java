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

public class HeaderContentFooter {
    @Test
    public void headerfooterpresent(){
        open("https://staging.uzo.io/");
        sleep(1000);
        $(By.id("header")).isDisplayed();
        $(By.id("categories")).isDisplayed();
        $(By.id("sidebar-widget")).isDisplayed();
    }
}
