package com.examen.stepsdefinitions;

import com.examen.screens.DetailsCartScreen;
import com.examen.steps.DetailsCartSteps;
import com.examen.steps.ProductSteps;
import com.examen.steps.ShopSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import java.sql.Driver;

public class ShopStepDefs {
    ShopSteps shopSteps;
    ProductSteps productSteps;
    DetailsCartSteps detailsCartSteps;
    int quantity = 0;
    @Given("estoy en la aplicación de SauceLabs")
    public void estoy_en_la_aplicación_de_sauce_labs() {
        shopSteps = new ShopSteps();
    }
    @And("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria() {
        shopSteps.loadCatalogSuccess();
    }
    @When("agrego {int} del siguiente producto {string}")
    public void agrego_del_siguiente_producto(int cantidad, String nameProduct) {
        shopSteps.selectProduct(nameProduct);
        productSteps = new ProductSteps();
        productSteps.addQuantityProduct(cantidad);
        quantity = cantidad;
    }
    @Then("valido el carrito de compra actualice correctamente")
    public void valido_el_carrito_de_compra_actualice_correctamente() {
        shopSteps.clickCartProduct();
        detailsCartSteps = new DetailsCartSteps();
        detailsCartSteps.validateQuantityCart(quantity);
    }
}
