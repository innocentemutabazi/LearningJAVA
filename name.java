import java.util.Scanner;

public class name {
  public static void main(String[] args) {
    Scanner theName = new Scanner(System.in);
    System.out.println("Please Enter your name");
    String userName = theName.nextLine();
    System.out.println("Enter your age");

    int userAge = theName.nextInt();
    System.out.println("Your name is " + userName + " and You're "+ userAge + " old.");
    theName.close();
  }
}