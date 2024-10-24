public class breakcontinuewhileloop {
  public static void main(String[] args) {
      int age= 0;
      while(age<25){
        if (age == 20){
          System.out.println("Happy birthday queen you're amazing");
          break;
        }
        System.out.println("You're "+ age + " old");
        age ++;
      }
  }
  
}
