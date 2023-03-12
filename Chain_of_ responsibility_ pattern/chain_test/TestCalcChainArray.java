package chain_test;

public class TestCalcChainArray {
    public static void main(String[] args)
    {
        //인터페이스에서 정의한 메소드를 모든 클래스에서 구현했고, 
        //메인에서 그 상속받은 클래스를 사용하기 위해 
        //인터페이스 인스턴스를 생성해서 접근하는 것...!
        Chain AddServer = new AddNumbers();
        Chain SubtractServer = new SubtractNumbers();
        Chain DivideServer = new DivideNumbers();
        Chain MultiplierServer = new MultiplierNumbers();

        AddServer.setNextChain(SubtractServer);
        SubtractServer.setNextChain(MultiplierServer);
        MultiplierServer.setNextChain(DivideServer);

        Numbers MultiRequest = new Numbers(30, 3, "mult");
        Numbers SubRequest = new Numbers(50, 40, "sub");
        Numbers AddRequest = new Numbers(13, 19, "add");
        Numbers DivRequest = new Numbers(70, 7, "div");

        Numbers[] requestArray = {MultiRequest, SubRequest, AddRequest, DivRequest};

        for(int i=0; i<requestArray.length; i++)
        {
            AddServer.calculate(requestArray[i]);
        }

    }
}
