package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.Popcorn;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionalVendingMachineTest {

    @Test
    public void ShouldCheckExceptionWhenProductOutOfStockSoftDrink(){

        ExceptionalVendingMachine exceptionalVM = new ExceptionalVendingMachine(0,3,7);
        SoftDrink softDrink = new SoftDrink();
        try {
            exceptionalVM.buy(softDrink);
        }
        catch( ProductNotFoundException  e){
            e.printStackTrace();
        }
        assertEquals(0, exceptionalVM.getStock(softDrink));
    }
    @Test
    public void ShouldCheckExceptionWhenProductOutOfStockChocolate(){

        ExceptionalVendingMachine exceptionalVM = new ExceptionalVendingMachine(0,3,0);
        Chocolate chocolate = new Chocolate();
        try {
            exceptionalVM.buy(chocolate);
        }
        catch( ProductNotFoundException e){
            e.printStackTrace();
        }
        assertEquals(0, exceptionalVM.getStock(chocolate));
    }
    @Test
    public void ShouldCheckExceptionWhenProductOutOfStockSaltySnack(){

        ExceptionalVendingMachine exceptionalVM = new ExceptionalVendingMachine(0,3,0);
        SaltySnack saltySnack = new SaltySnack();
        try {
            exceptionalVM.buy(saltySnack);
        }
        catch( ProductNotFoundException e){
            e.printStackTrace();
        }
        assertEquals(0, exceptionalVM.getStock(saltySnack));
    }

    @Test
    public void ShouldThrowAnExceptionIfProductNotFound(){
        ExceptionalVendingMachine exceptionalVM = new ExceptionalVendingMachine(0,3,0);
        Popcorn popcorn = new Popcorn();
        try{
            exceptionalVM.buy(popcorn);
        }catch(ProductNotFoundException e){
            e.printStackTrace();
        }
      assertEquals(0,exceptionalVM.getStock(popcorn));
    }
}
