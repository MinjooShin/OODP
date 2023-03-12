public class TicketMain {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            //이 예제는 인스턴스 하나에 계속 접근하고 있다는 것을 보여주기 위함
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End.");
    }
}