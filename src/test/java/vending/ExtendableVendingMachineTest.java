package vending;
import org.junit.jupiter.api.Test;

import vending.product.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ExtendableVendingMachineTest {
    @Test
    public void ShouldBeAbleToSpecifyAProductQtyToAddStock(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(1,1,1,1);
        Chocolate chocolate = new Chocolate();
        evm.addStock(chocolate);
        assertEquals(4, evm.getStock(chocolate));
    }
    @Test
    public void ShouldBeAbleToSpecifyAProductQtyToBuyProduct(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(12,14,1,1);
        Biltong biltong = new Biltong();
        evm.buy(biltong);
        assertEquals(0, evm.getStock(biltong));
    }
    @Test
    public void ShouldBeAbleToReturnZeroIfItsNotASupportProduct(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(12,14,1,1);
        Popcorn popcorn = new Popcorn();
        evm.buy(popcorn);
        assertEquals(0, evm.getStock(popcorn));
    }

    @Test
    public void ShouldBeAbleToReturnZeroIfItsNotASupportProductToAddStock(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(12,14,1,1);
        Popcorn popcorn = new Popcorn();
        evm.addStock(popcorn,1);
        assertEquals(0, evm.getStock(popcorn));
    }
}
