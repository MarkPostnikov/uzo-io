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



public class SearchCheck {
    @Test
    public void checksearch (){
        open("https://www.uzo.io/");
        sleep(1000);
        $(By.id("search-input")).sendKeys("Dress" + Keys.ENTER);
        sleep(2000);
        $(By.className("product__content-wrapper")).isDisplayed();
    }
}
