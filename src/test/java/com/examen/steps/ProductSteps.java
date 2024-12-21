package com.examen.steps;

import com.examen.screens.CatalogScreen;
import com.examen.screens.ProductScreen;
import org.junit.Assert;

public class ProductSteps {
    ProductScreen productScreen = new ProductScreen();;
    public void addQuantityProduct(int quantity ){
        if(quantity>1){
            for (int i = 0; i < quantity-1; i++) {
                productScreen.clickPlusQuantityProduct();
            }
        }
        productScreen.clickBtnAddProduct();
    }
}
