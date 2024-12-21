package com.examen.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CatalogScreen extends PageObject {
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement lblCatalog;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private WebElement lblCart;


    public CatalogScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver(), Duration.ofSeconds(2)), this);
    }
    public boolean isCatalogDisplayed(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(lblCatalog));
        return lblCatalog.isEnabled();
    }
    public void clickProduct(String nameProduct) {
        String xpath = "//android.widget.ImageView[@content-desc=\""+nameProduct+"\"]";
        WebElement lblProduct = getDriver().findElement(By.xpath(xpath));
        if (lblProduct != null && lblProduct.isDisplayed()) {
            lblProduct.click();
        } else {
            System.out.println("Producto no encontrado: " + nameProduct);
        }
    }
    public void clickCartProduct(){
        lblCart.click();
    }
}
