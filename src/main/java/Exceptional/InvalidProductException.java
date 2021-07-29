package Exceptional;

import vending.product.Product;

public class InvalidProductException extends RuntimeException{
    public InvalidProductException(Product product){
        super("InvalidProductException");
    }
}
