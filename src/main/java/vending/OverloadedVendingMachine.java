package vending;

import vending.product.*;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {
    private  int chocolatesQty;
    private int softDrinkQty;
    private int saltySnacksQty;

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
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
    void addStock(Product product){
        System.out.println("add 1 stock item for each Product type");
    }
    void addStock(SoftDrink softDrink){
        System.out.println("add 1 SoftDrink to stock");
    }
    void addStock(SaltySnack saltySnack){
        System.out.println("add 1 SaltySnack to stock");
    }
    void addStock(Chocolate chocolate){
        System.out.println("add 1 Chocolate to stock");
    }
    int getStock(SoftDrink softDrink){
        return softDrinkQty;
    }
    int getStock(SaltySnack saltySnack){
        return saltySnacksQty;
    }
    int getStock(Chocolate chocolate){
        return chocolatesQty;
    }
    int getStock(){
        int totalStock = softDrinkQty + saltySnacksQty + chocolatesQty;
        return totalStock;
    }



    public static void main(String[] args) {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(1, 1, 1);
        Product products = new Product();
        ovm.buy(products);
        ovm.addStock(products);
//        ovm.getStock();

    }
}


