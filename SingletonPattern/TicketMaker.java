public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();
    private  TicketMaker() {
    }
    //singleton instance는 getInstance()메소드로만 만들어질 수 있음
    public static TicketMaker getInstance() {
        return singleton;
    }
    //synchronized 키워드가 붙은 메소드는 1개의 thread만 사용할 수 있음
    //thread 하나만 해당 메소드를 access할 수 있도록 만듬
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}