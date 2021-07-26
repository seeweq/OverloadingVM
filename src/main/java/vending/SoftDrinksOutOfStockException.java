package vending;

import vending.product.Product;

class SoftDrinksOutOfStockException extends ProductNotFoundException{

    Product product;

    public SoftDrinksOutOfStockException(Product product){
        super("SoftDrinksOutOfStockException");
    }


}
