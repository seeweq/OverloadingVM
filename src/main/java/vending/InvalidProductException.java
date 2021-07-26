package vending;

import vending.product.Product;

public class InvalidProductException extends RuntimeException{
    InvalidProductException(Product product){
        super("InvalidProductException");
    }
}
