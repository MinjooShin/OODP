package practice_chainRule;

//홀수에 대한 요청 처리를 완료할 수 있는 클래스
public class Odd_Receiver extends Receiver{
    public Odd_Receiver(String name)
    {
        super(name);
    }
    public boolean resolve(int number)
    {
        if(number%2 != 0) return true;
        else return false;
    }
    public void done(int number)
    {
        System.out.println(number + ":" + name + "가 해결");
    }
}
