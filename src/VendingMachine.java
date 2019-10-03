import Exceptions.ChocolatesAllGone;
import Exceptions.ProductNotFoundException;
import Exceptions.SaltySnacksOutOfStockException;
import Exceptions.SoftDrinksOutOfStockException;
import Products.Coke;
import Products.LaysChips;
import Products.Product;
import Products.SmartieChocolate;

public class VendingMachine {

    public void buy(Product product) throws ProductNotFoundException{
    // checking for the type of product before purchasing that product
    if(product instanceof Coke){
        if(Coke.stock >= 1){
            Coke.stock -=1;
        }
    }
   else if(product instanceof SmartieChocolate) {
        if (SmartieChocolate.stock >= 1) {
            SmartieChocolate.stock -= 1;
        }
    }
   else if(product instanceof LaysChips) {
                if (LaysChips.stock >= 1) {
                    LaysChips.stock -= 1;
                }
   }
    // throwing an exception if the product purchases is below 0
           if(Coke.stock == 0) {
                    throw new SoftDrinksOutOfStockException();
           }
          else if(LaysChips.stock == 0) {
                    throw new SaltySnacksOutOfStockException();
            }
          else if(SmartieChocolate.stock == 0){
                    throw new ChocolatesAllGone();
            }

    }

    public void addStock(Product product, int newStock){
            if (product instanceof Coke) {
                Coke.stock = newStock;
            }
            if (product instanceof SmartieChocolate) {
                SmartieChocolate.stock = newStock;
            }
            if (product instanceof LaysChips) {
                LaysChips.stock = newStock;
            }
        }

    public int getStock(Product product){
        if(product instanceof Coke){
            System.out.println("Coke on hand: " + Coke.stock);
            return Coke.stock;
        }
        if(product instanceof LaysChips){
            System.out.println("Chips on hand: " + LaysChips.stock);
            return LaysChips.stock;
        }
        if(product instanceof SmartieChocolate){
            System.out.println("Chocolates on hand: " + SmartieChocolate.stock);
            return SmartieChocolate.stock;
        }

        return 0;
    }

    public static void main(String[] args) {
        LaysChips laysChips = new LaysChips();
        Coke coke1 = new Coke();
        SmartieChocolate smartieChocolate = new SmartieChocolate();

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addStock(coke1, 2);
        vendingMachine.addStock(laysChips,3);
        vendingMachine.addStock(smartieChocolate,3);
        vendingMachine.getStock(laysChips);
        vendingMachine.getStock(coke1);
        vendingMachine.getStock(smartieChocolate);


        try{
            vendingMachine.buy(laysChips);
            vendingMachine.buy(laysChips);
            vendingMachine.buy(laysChips);
            vendingMachine.buy(laysChips);
        }catch (ProductNotFoundException e){
            e.printStackTrace();
        }

    }

}

