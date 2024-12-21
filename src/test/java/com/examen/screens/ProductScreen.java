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

public class ProductScreen extends PageObject {
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
    private WebElement btnPlusProduct;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement btnAddProduct;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement lblTittleProduct;

    public ProductScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver(), Duration.ofSeconds(2)), this);
    }
    public void clickPlusQuantityProduct(){
        btnPlusProduct.click();
    }
    public void clickBtnAddProduct(){
        btnAddProduct.click();
    }

    public boolean isTittleProductDisplayed(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(lblTittleProduct));
        return lblTittleProduct.isEnabled();
    }
}
