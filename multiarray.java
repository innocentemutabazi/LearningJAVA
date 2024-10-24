public class multiarray {
  public static void main(String[] args) {
      int [][] num ={{1,2,3,4},{4,5,6,7,89}};
      int lowest=num[0][0];
      int highest=num[0][0];
      for (int i = 0; i < num.length; i++) {
          for(int j=0;j<num[i].length;j++){
            if(num[i][j]>highest){
              highest = num[i][j];
            } else if(num[i][j]<lowest){
              lowest = num[i][j];
            }
          }
      }
      System.out.println("The highest number is "+ highest);
      System.out.println("The lowest number is " + lowest);
  }
  
}
