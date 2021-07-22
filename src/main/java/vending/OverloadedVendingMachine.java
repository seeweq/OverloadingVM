package vending;

import vending.product.*;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {
    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        // set the stockLevel instance variables for each product in the constructor
    }
    void buy(SoftDrink softDrink){
        System.out.println("buy 1 SoftDrink");

    }
    void buy(SaltySnack saltySnack){
        System.out.println("buy 1 SaltySnack");
    }
    void buy(Chocolate chocolate){
        System.out.println("buy 1 Chocolate");
    }
    void buy(Product product){
        System.out.println("buy 1 of each product");
    }
}
