package vending;

import org.junit.jupiter.api.Test;
import vending.OverloadedVendingMachine;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OverloadingVendingMachineTest {
    @Test
    public void shouldBeAbleToBuyOfEachProductAndCheckProductsInStock() {

        OverloadedVendingMachine mv = new OverloadedVendingMachine(1,1,1);
        Product product = new Product();
        mv.buy(product);
        assertEquals(3, mv.getStock());
    }
    @Test
    public void ShouldBeAbleToBuyACheckStockForSoftDrink(){
        OverloadedVendingMachine mv = new OverloadedVendingMachine(1,1,1);
        SoftDrink softDrink = new SoftDrink();
        mv.buy(softDrink);
        assertEquals(1, mv.getStock(softDrink));
    }
    @Test
    public void ShouldBeAbleToBuyAndCheckStockForSaltySnack(){
        OverloadedVendingMachine mv = new OverloadedVendingMachine(1,1,1);
        SaltySnack saltySnack = new SaltySnack();
        mv.buy(saltySnack);
        assertEquals(1, mv.getStock(saltySnack));
    }
    @Test
    public void ShouldBeAbleToBuyAndCheckStockForChocolate(){
        OverloadedVendingMachine mv = new OverloadedVendingMachine(1,1,1);
        Chocolate chocolate = new Chocolate();
        mv.buy(chocolate);
        assertEquals(1, mv.getStock(chocolate));
    }
    @Test
    public void ShouldBeAbleToAddStockAndCheckWholeStockForChocolate(){
        OverloadedVendingMachine mv = new OverloadedVendingMachine(1,1,1);
        Chocolate chocolate = new Chocolate();
        mv.addStock(chocolate);
        assertEquals(1, mv.getStock(chocolate));
    }
    @Test
    public void ShouldBeAbleToAddStockAndCheckWholeStockForSoftDrink(){
        OverloadedVendingMachine mv = new OverloadedVendingMachine(1,1,1);
        SoftDrink softDrink = new SoftDrink();
        mv.addStock(softDrink );
        assertEquals(1, mv.getStock(softDrink ));
    }
    @Test
    public void ShouldBeAbleToAddStockAndCheckWholeStockForSaltySnack(){
        OverloadedVendingMachine mv = new OverloadedVendingMachine(1,1,1);
        SaltySnack saltySnack = new SaltySnack();
        mv.addStock(saltySnack);
        assertEquals(1, mv.getStock(saltySnack));
    }

}
