package chain_test;

public class Numbers {
    private int number1;
    private int number2;
    private String calculationWanted;
    
    //인스턴스 변수에 계산하길 원하는 값과 어떤 연산을 할건지에 대한 값 저장
    //constructor
    public Numbers(int newNumber1, int newNumber2, String calcWanted)
    {
        number1 = newNumber1;
        number2 = newNumber2;
        calculationWanted = calcWanted;
    }
    //인스턴스 변수를 가져오기 위한 메소드 생성
    public int getNumber1() {return number1;}
    public int getNumber2() {return number2;}
    public String getCalcWanted()
    {
        return calculationWanted;
    }

}
