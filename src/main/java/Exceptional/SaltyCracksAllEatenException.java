package Exceptional;

import Exceptional.ProductNotFoundException;
import vending.product.Product;

public class SaltyCracksAllEatenException extends ProductNotFoundException {
    public SaltyCracksAllEatenException(Product product){
        super("SaltyCracksAllEatenException");

    }
}
