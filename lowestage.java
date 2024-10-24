public class lowestage {
  public static void main(String[] args) {
      int [] age={1,2,3,4,54,64,24,643,632,264} ;
      int lowest= age[0];
      int highest = age[0];
      for (int i = 0; i < age.length; i++) {
           if (age[i]<lowest){
            lowest=age[i];
           }
           if(age[i]>highest){
            highest=age[i];
           }
      }
      System.out.println("The lowest number is "+lowest);
      System.out.println("The highest number is "+highest);

  }
  
}
