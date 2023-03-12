package chain_test;

public class MultiplierNumbers implements Chain{
    private Chain nextlnChain;
    public void setNextChain(Chain nextChain)
    {
        nextlnChain = nextChain;
    }
    public String toString()
    {
        return "[Multiplier Server]";
    }
    public void calculate(Numbers request)
    {
        if(request.getCalcWanted() == "mult")
        {
            System.out.println("Multiplier requested..");
            System.out.println(this + "Working ...");
            System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = " + (request.getNumber1()*request.getNumber2()));
            System.out.println("=========================================");
        }
        else
        {
            System.out.println("Multiplier server passing the operation to the next server.");
            nextlnChain.calculate(request);
        }
    }
}
