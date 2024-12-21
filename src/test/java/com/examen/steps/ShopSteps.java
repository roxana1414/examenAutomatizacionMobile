package com.examen.steps;

import com.examen.screens.CatalogScreen;
import com.examen.screens.ProductScreen;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopSteps {
    CatalogScreen catalogScreen = new CatalogScreen();
    ProductScreen productScreen = new ProductScreen();
    public void loadCatalogSuccess(){
        Assert.assertTrue("Visibilidad de título products", catalogScreen.isCatalogDisplayed());
    }

    public void selectProduct(String nameProduct) {
        catalogScreen.clickProduct(nameProduct);
    }
    public void clickCartProduct() {
        catalogScreen.clickCartProduct();
        Assert.assertTrue("Visibilidad del detalle del producto", productScreen.isTittleProductDisplayed());

    }

}
