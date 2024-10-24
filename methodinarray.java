public class methodinarray {
  static void myIntro(String name , int age, String school){
    System.out.println("My names are "+ name + " and I'm "+ age + " years old and I study at "+ school);
  }
  static void isOdd(int [] nums){
  for (int num : nums) {
     System.out.println( num % 2 == 0 ? num + " is an even number" : num + " is an odd number");
  }
  }
  public static void main(String[] args) {
      myIntro("Innocente Mutabazi Umuhuza", 19, "African Leadership University");
      myIntro("Ntidendereza Gisa Loic", 10, "Centre Scolaire Utunyenyeri");
      int [] numbers = {12,43,521,4532,624,324,565,53,2,24,4};
      isOdd(numbers);
  }
}
