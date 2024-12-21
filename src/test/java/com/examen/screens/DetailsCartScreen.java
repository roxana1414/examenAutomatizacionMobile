package com.examen.screens;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DetailsCartScreen extends PageObject {
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/itemsTV")
    private WebElement lblCartQuantity;
    public DetailsCartScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver(), Duration.ofSeconds(2)), this);
    }
    public int getTextCartQuantity(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(lblCartQuantity));
        return Integer.parseInt(lblCartQuantity.getText().split(" ")[0]);
    }
}
