package practice01;

public class Main {
    public static void main(String argsp[])
    {
        Receiver odd_receiver = new Odd_Receiver("odd receiver");
        Receiver even_receiver = new Even_Receiver("even receiver");

        odd_receiver.setNext(even_receiver); //receiver의 요청 처리 순서를 지정

        for(int i=1; i<=20; i++)
        {
            odd_receiver.support(i);
        }
    }
}
