package chain_test;
//Chain 인터페이스 상속
public class AddNumbers implements Chain{
    private Chain nextlnChain;
    public void setNextChain(Chain nextChain)
    {
        nextlnChain = nextChain;
    }
    public String toString()
    {
        return "[Addition Server]";
    }
    public void calculate(Numbers request)
    {
        if(request.getCalcWanted() == "add")
        {
            System.out.println("Addition requested..");
            System.out.println(this + "Working ...");
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " + (request.getNumber1()+request.getNumber2()));
            System.out.println("=========================================");
        }
        else
        {
            System.out.println("Addition server passing the operation to the next server.");
            nextlnChain.calculate(request);
        }
    }
}
