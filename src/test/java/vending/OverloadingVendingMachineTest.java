package vending;

import org.junit.jupiter.api.Test;
import vending.OverloadedVendingMachine;
import vending.product.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OverloadingVendingMachineTest {
    @Test
    public void shouldBeAbleToBuyOfEachProductAndCheckProductsInStock() {

        OverloadedVendingMachine vm = new OverloadedVendingMachine(3,1,1,1);
        Product product = new Product();
        vm.buy(product);
        assertEquals(2, vm.getStock());
    }
    @Test
    public void ShouldBeAbleToBuyACheckStockForSoftDrink(){
        OverloadedVendingMachine vm = new OverloadedVendingMachine(2,1,1,1);
        SoftDrink softDrink = new SoftDrink();
        vm.buy(softDrink);
        assertEquals(1, vm.getStock(softDrink));
    }
    @Test
    public void ShouldBeAbleToBuyAndCheckStockForSaltySnack(){
        OverloadedVendingMachine vm = new OverloadedVendingMachine(1,3,1,1);
        SaltySnack saltySnack = new SaltySnack();
        vm.buy(saltySnack);
        assertEquals(2, vm.getStock(saltySnack));
    }
    @Test
    public void ShouldBeAbleToBuyAndCheckStockForChocolate(){
        OverloadedVendingMachine vm = new OverloadedVendingMachine(1,1,1,1);
        Chocolate chocolate = new Chocolate();
        vm.buy(chocolate);
        assertEquals(0, vm.getStock(chocolate));
    }
    @Test
    public void ShouldBeAbleToAddStockAndCheckWholeStockForChocolate(){
        OverloadedVendingMachine vm = new OverloadedVendingMachine(1,1,10,1);
        Chocolate chocolate = new Chocolate();
        vm.addStock(chocolate);
        assertEquals(11, vm.getStock(chocolate));
    }
    @Test
    public void ShouldBeAbleToAddStockAndCheckWholeStockForSoftDrink(){
        OverloadedVendingMachine vm = new OverloadedVendingMachine(12,1,1,1);
        SoftDrink softDrink = new SoftDrink();
        vm.addStock(softDrink );
        assertEquals(13, vm.getStock(softDrink ));
    }
    @Test
    public void ShouldBeAbleToAddStockAndCheckWholeStockForSaltySnack(){
        OverloadedVendingMachine vm = new OverloadedVendingMachine(1,14,1,1);
        SaltySnack saltySnack = new SaltySnack();
        vm.addStock(saltySnack);
        assertEquals(15, vm.getStock(saltySnack));
    }
    @Test
    public void ShouldBeAbleToSpecifyAProductQtyToAddStock(){
        OverloadedVendingMachine vm = new OverloadedVendingMachine(1,14,1,1);
        SaltySnack saltySnack = new SaltySnack();
        vm.addStock(saltySnack,12);
        assertEquals(26, vm.getStock(saltySnack));
    }
    @Test
    public void ShouldBeAbleToSpecifyAProductQtyToBuyProduct(){
        OverloadedVendingMachine vm = new OverloadedVendingMachine(12,14,1,1);
        SoftDrink softDrink = new SoftDrink();
        vm.buy(softDrink,6);
        assertEquals(6, vm.getStock(softDrink));
    }
    @Test
    public void ShouldBeAbleToBuyAndCheckStockForBiltong(){
        OverloadedVendingMachine vm = new OverloadedVendingMachine(1,3,1,2);
        Biltong biltong = new Biltong();
        vm.buy(biltong);
        assertEquals(1, vm.getStock(biltong));
    }

}
