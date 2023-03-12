package chain_test;

public class SubtractNumbers implements Chain{
    private Chain nextlnChain;
    public String toString()
    {
        return "[Subtract Server]";
    }
    public void setNextChain(Chain nextChain)
    {
        nextlnChain = nextChain;
    }
    public void calculate(Numbers request)
    {
        if(request.getCalcWanted() == "sub")
        {
            System.out.println("Subtraction requested..");
            System.out.println(this + "Working ...");
            System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = " + (request.getNumber1()-request.getNumber2()));
            System.out.println("=========================================");
        }
        else
        {
            System.out.println("subtract server passing the operation to the next server.");
            nextlnChain.calculate(request);
        }
    }
}
