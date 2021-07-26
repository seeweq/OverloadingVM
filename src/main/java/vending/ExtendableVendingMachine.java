package vending;

import vending.product.*;

class ExtendableVendingMachine {
    int softDrinkQty;
    int saltySnacksQty;
    int chocolatesQty;
    int biltongQty;

    ExtendableVendingMachine (int softDrinkQty, int saltySnacksQty, int chocolatesQty, int biltongQty){
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
        this.biltongQty = biltongQty;
    }
    public static void main(String[] args) {

    }
    public void buy(Product product){
        if(product instanceof SoftDrink ) { softDrinkQty-=1; }
        if(product instanceof SaltySnack) { saltySnacksQty-=1; }
        if(product instanceof Chocolate) { chocolatesQty-=1; }
        if(product instanceof Biltong){ biltongQty-=1;}
    }
    public void buy(Product product,int qty){
        if(product instanceof SoftDrink && (softDrinkQty - qty) > 0) { softDrinkQty-=qty; }
        if(product instanceof SaltySnack && (saltySnacksQty - qty ) >0 ) { saltySnacksQty-=qty; }
        if(product instanceof Chocolate && (chocolatesQty - qty >0 )) { chocolatesQty-=qty; }
        if(product instanceof Biltong && (biltongQty - qty >0 )) { biltongQty-=qty; }
    }
    public void addStock(Product product, int qty){
        if(product instanceof SoftDrink && (softDrinkQty - qty) > 0) { softDrinkQty+=3; }
        if(product instanceof SaltySnack && (saltySnacksQty - qty ) >0 ) { saltySnacksQty+=3; }
        if(product instanceof Chocolate && (chocolatesQty - qty >0 )) { chocolatesQty+=3; }
        if(product instanceof Biltong && (biltongQty - qty >0 )) { biltongQty+=3; }
    }
    void addStock(SoftDrink softDrink){
        softDrinkQty +=3;
    }
    void addStock(SaltySnack saltySnack){
        saltySnacksQty+=3;
    }
    void addStock(Chocolate chocolate){
        chocolatesQty+=3;
    }

    int getStock(Product product){
        if(product instanceof SoftDrink){
            return softDrinkQty;
        }if(product instanceof SaltySnack){
            return saltySnacksQty;
        }if(product instanceof Chocolate){
            return chocolatesQty;
        }
        if(product instanceof Biltong){
            return biltongQty;
        }else{
            return 0;
        }

    }
}
