package vending;

import vending.product.Product;

public class ChocolatesAllGoneException extends ProductNotFoundException {
    Product product;

    public ChocolatesAllGoneException(Product product){
       super("ChocolatesAllGoneException");
    }
}
