public class breakcontinue {
  public static void main(String[] args) {
      for (int age = 0; age < 30; age++) {
          if(age == 20){
            System.out.println("Cheers to being the woman of your dreams");
            break; // The break statemennt is used to break and stop the loop 
          }
          System.out.println("Happy "+ age + "th birthday");
      };
      for (int age = 0; age < 30; age++) {
        if(age == 20){
          continue; // the continue is used to skip one iteration
        }
        System.out.println("Happy "+ age + "th birthday");
    }
  } 
}
