public class javamethods {
 static void Odd(int num){
  if (num % 2 !=0){
    System.out.println(num + " is odd");
  };
 }
 public static void main(String[] args) {
     int [] nums ={1,2,3,4,5,6,7,8,9,10};
     for (int num : nums){
      Odd(num);
     }

 }
}
