package practice01;

/*
java inheritance (subclass and superclass)
한 클래스의 속성과 메소드를 다른 클래스로 상속할 수 있다.
subclass (child) - 다른 클래스로부터 상속받는 클래스
superclass (parent) - 상속되는 클래스
extends 키워드를 사용해서 한 클래스를 상속한다.
*/

//짝수에 대한 요청 처리를 완료할 수 있는 클래스
public class Even_Receiver extends Receiver{
    public Even_Receiver(String name)
    {
        super(name);
    }
    public boolean resolve(int number)
    {
        if(number%2==0) return true;
        else return false;
    }
    public void done(int number)
    {
        System.out.println(number + ":" + name + "가 해결!");
    }
}
