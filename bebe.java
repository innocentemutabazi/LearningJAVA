public class bebe {
 
  public static void main(String[] args) {
    int age=19;
    float networth = 1.6f;
    // to declare variables of the same datatype we can write the datatype then varible names and values separated by a comma and when we put the final keyword at the beginning it will affect each and every variable that we are assigning in this line it also works on the variable declaration without an assignment
    final String name = "Innocente Mutabazi Umuhuza", initial = "I",fullIntro; // The final keyword is like the const keyword in JavaScript it is used to declare variables that can not be reassigned
    char letter = 'i';
    boolean hasBoyfriend = false;
    final String papa; //unlike JS's const when we use final in Java we can leave the variable unassigned
    String x,y,z="bebe";
    x=y=z;
    System.out.println("my name is bebe");
    System.out.println("My mom is Joselyne");
    System.out.println("My brother is called Gitama"); //the printLn always write the text in a new line 
    System.out.print("why all of the sudden do I feel good and then bad ");
    System.out.print("why all of the sudden do I feel good and then bad"); //while the print doesn't start a new line and will always try to fit the print result in one line
    System.out.print(4 + 0.3);
    fullIntro = "Hi my name is " + name + " and my networth is " + networth + " Million Rwf";
    System.out.println(name);
    System.out.println(fullIntro);
    System.out.println(x);
    System.out.println("My name is " + name);
  }
}
