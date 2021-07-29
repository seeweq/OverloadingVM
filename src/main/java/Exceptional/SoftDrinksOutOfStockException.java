package Exceptional;

import Exceptional.ProductNotFoundException;
import vending.product.Product;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {

    Product product;

    public SoftDrinksOutOfStockException(Product product){
        super("SoftDrinksOutOfStockException");
    }


}
