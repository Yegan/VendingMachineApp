package Exceptions;

public class ChocolatesAllGone extends ProductNotFoundException{
    public ChocolatesAllGone()  {
        super("Out of chocolate");
    }
}
