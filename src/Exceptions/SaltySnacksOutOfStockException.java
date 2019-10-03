package Exceptions;

public class SaltySnacksOutOfStockException extends ProductNotFoundException{
    public  SaltySnacksOutOfStockException() {
        super("out of salty snacks");
    }
}
