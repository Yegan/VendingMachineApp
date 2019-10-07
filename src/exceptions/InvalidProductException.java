package exceptions;

public class InvalidProductException extends ProductNotFoundException {
    public InvalidProductException(){
        super("Invalid product");
    }
}
