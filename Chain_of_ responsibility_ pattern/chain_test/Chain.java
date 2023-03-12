package chain_test;
//interface 정의
public interface Chain 
{
    public void setNextChain(Chain nextChain);
    public void calculate(Numbers request);
}

