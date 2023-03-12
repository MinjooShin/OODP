package chain_test;

public class DivideNumbers implements Chain{
    private Chain nextlnChain;
    public void setNextChain(Chain nextChain)
    {
        nextlnChain = nextChain;
    }
    public String toString()
    {
        return "[Divide Server]";
    }
    public void calculate(Numbers request)
    {
        if(request.getCalcWanted() == "div")
        {
            System.out.println("Division requested..");
            System.out.println(this + "Working ...");
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1()/request.getNumber2()));
            System.out.println("=========================================");
        }
        else
        {
            System.out.println("divide server passing the operation to the next server.");
            nextlnChain.calculate(request);
        }
    }
}
