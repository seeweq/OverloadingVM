package Exceptional;

import vending.product.*;

public class ExceptionalVendingMachine {
    int softDrinkQty;
    int saltySnacksQty;
    int chocolatesQty;
    public ExceptionalVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

        public void buy(Product product) throws ProductNotFoundException, RuntimeException{
        if(!(product instanceof SoftDrink) && !(product instanceof SaltySnack) && !(product instanceof Chocolate)){
            throw new InvalidProductException(product);
        }
            if (product instanceof SoftDrink && (softDrinkQty - 1) <= 0) {
                throw new SoftDrinksOutOfStockException(product);
            } else {
                softDrinkQty -= 1;
            }
            if (product instanceof SaltySnack && (saltySnacksQty - 1) <= 0) {
                throw new SaltyCracksAllEatenException(product);
            } else {
                saltySnacksQty -= 1;
            }

            if (product instanceof Chocolate && (chocolatesQty - 1) <= 0) {
                throw new ChocolatesAllGoneException(product);
            } else {
                chocolatesQty -= 1;
            }

        }


     void addStock(Product product, int qty){
        if(product instanceof SoftDrink && (softDrinkQty - qty) > 0) { softDrinkQty+=qty; }
        if(product instanceof SaltySnack && (saltySnacksQty - qty ) >0 ) { saltySnacksQty+=qty; }
        if(product instanceof Chocolate && (chocolatesQty - qty >0 )) { chocolatesQty+=qty; }

    }
    public int getStock(Product product) {
        if (product instanceof SoftDrink) {
            return softDrinkQty;
        }
        if (product instanceof SaltySnack) {
            return saltySnacksQty;
        }
        if (product instanceof Chocolate) {
            return chocolatesQty;

        } else {
            return 0;
        }


    }

    public static void main(String[] args) {

    }
}
