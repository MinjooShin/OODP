public class SingleObject {

   //private 변수에 static이 붙으면 클래스내에서 접근가능하다는 말인가?
   private static SingleObject instance = new SingleObject();

   private SingleObject(){}

   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
