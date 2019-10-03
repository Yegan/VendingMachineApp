package Exceptions;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {

    public  SoftDrinksOutOfStockException() {
        super("Out of soft drinks");
    }
}
