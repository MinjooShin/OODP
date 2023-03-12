package practice01;

//수신 객체가 가져야할 공통 인터페이스 정의 및 구현하기 위한 클래스
public abstract class Receiver 
    {
    public String name; //receiver name
    private Receiver next = null; //next receiver instance

    public Receiver(String name)
    {
        this.name = name;
    }
    public Receiver setNext(Receiver next) //다음으로 수신할 객체 지정
    {
        this.next = next;
        return next;
    }
    public final void support(int number) //처리
    {
        if(resolve(number)) //수신 객체가 요청을 처리했는지 판단
        {
            done(number); //수신 객체가 요청을 처리했다는 메세지 출력
        }
        else if(next != null) //요청을 처리 못했다면 다음 수신객체에게 처리 요청
        {
            next.support(number);
        }
        else //chain에 있는 어떤 객체도 처리를 못한 경우 
        {
            System.out.println("no handle any instance.");
        }
    }
    public abstract boolean resolve(int number);
    public abstract void done(int number);
}