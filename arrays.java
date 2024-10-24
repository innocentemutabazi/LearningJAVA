
import java.lang.reflect.Array;

public class arrays {
  public static void main(String[] args) {
      String [] cars ={"Bentley","Rolls-Royce","Mercedes Benz","Jeep","Hellcat"};
      for (String car : cars){
        System.out.println(car + " is my dream car");
      }
      System.out.println(cars.length);
      System.out.println(cars[0]);
     cars[0] = "dad's car";
     for (String car : cars){
      System.out.println(car + " is my dream car");
    }  }
  
}
