
package vending;

import vending.product.*;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {
    public int chocolatesQty;
    public int softDrinkQty;
    public int saltySnacksQty;
    public int biltongQty;

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty,int biltongQty){
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
        this.biltongQty = biltongQty;
    }
    void buy(SoftDrink softDrink){ softDrinkQty -=1;}
    void buy(SaltySnack saltySnack){
        saltySnacksQty-=1;
    }
    void buy(Chocolate chocolate){
       chocolatesQty-=1;
    }
    void buy(Biltong biltong){ biltongQty-=1;}

    void buy(Product product){
        softDrinkQty -=1;
        saltySnacksQty-=1;
        chocolatesQty-=1;
    }
    void addStock(Product product){
        softDrinkQty ++;
        saltySnacksQty++;
        chocolatesQty++;

    }
    void addStock(SoftDrink softDrink){
        softDrinkQty ++;
    }
    void addStock(SaltySnack saltySnack){
        saltySnacksQty++;
    }
    void addStock(Chocolate chocolate){
        chocolatesQty++;
    }
    void addStock(Biltong biltong){
        biltongQty++;
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
    int getStock(Biltong biltong){return biltongQty;}

    int getStock(){
        int totalStock = softDrinkQty + saltySnacksQty + chocolatesQty;
        System.out.println(totalStock);
        return totalStock;
    }



    public static void main(String[] args) {

    }
    public void buy(Product product,int qty){
        if(product instanceof SoftDrink && (softDrinkQty - qty) > 0) { softDrinkQty-=qty; }
        if(product instanceof SaltySnack && (saltySnacksQty - qty ) >0 ) { saltySnacksQty-=qty; }
        if(product instanceof Chocolate && (chocolatesQty - qty > 0 )) { chocolatesQty-=qty; }
    }

    public void addStock(Product product, int qty){
        if(product instanceof SoftDrink && (softDrinkQty - qty) > 0) { softDrinkQty+=qty; }
        if(product instanceof SaltySnack && (saltySnacksQty - qty ) >0 ) { saltySnacksQty+=qty; }
        if(product instanceof Chocolate && (chocolatesQty - qty >0 )) { chocolatesQty+=qty; }
    }
}


