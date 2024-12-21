package com.examen.steps;

import com.examen.screens.DetailsCartScreen;
import org.junit.Assert;

public class DetailsCartSteps {
    DetailsCartScreen detailsCartScreen = new DetailsCartScreen();;
    public void validateQuantityCart(int quantity ){
        Assert.assertTrue("El total de items no es correcto", detailsCartScreen.getTextCartQuantity() ==quantity);

    }
}
