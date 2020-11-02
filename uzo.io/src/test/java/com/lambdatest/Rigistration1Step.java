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


public class Rigistration1Step {
@Test
public void registration1st (){

    open("https://staging.uzo.io/");
    $(By.id("header-account")).click();
    sleep(1000);
    $(".form").click();
    sleep(1000);
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(1000);
    $(By.xpath("//input[@type='email']")).sendKeys("username"+randomInt+"@test123.com");
    sleep(1000);
    $(By.xpath("//input[@placeholder='Firstname']")).sendKeys("TestUserName");
    $(By.xpath("//input[@placeholder='Lastname']")).sendKeys("TestUserLastname");
    $(By.xpath("//input[@type='password']")).sendKeys("T34est123");
    sleep(1000);
    $(By.xpath("//button[@type='submit']")).click();
    sleep(2000);
    $(By.id("__nuxt")).isDisplayed();
    $(By.className("content")).isDisplayed();
}
}
