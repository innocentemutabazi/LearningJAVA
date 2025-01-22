import java.util.Scanner;

public class quizGame {
  public static void main(String[] args) {
    Scanner userAnswer = new Scanner(System.in);
    int score = 0;
    String [] questions = {"Where was I born ? \nA.Gikondo \nB.Kicukiro \nC.Gihundwe","How old am I? \nA.19 \nB.20 \nC.12","Who is your mother? \nA.Joselyne \nB.Tina \nC.Rose","What is my family name? \nA.MUTABAZI \nB.Rutagengwa \n.C.Kayiranga"};
    String [] correctAnswers = {"C","A","A","A"};
    for (int i=0; i<questions.length;i++){
     System.out.println(questions[i]);
     String givenanswers = userAnswer.nextLine();
     if(givenanswers.toUpperCase().equals(correctAnswers[i])){
      score ++;
      System.out.println("Yaaay! You nailed it");
     }else{
      System.out.print("Oopsie! Wrong Answer The correct one is "+ correctAnswers[i]+"\n");
     }
    };
    System.out.println("Your final score is "+ score +"/"+ questions.length);
    userAnswer.close();
    if(score == questions.length){
      System.out.println("You nailed the quiz");
    }else{
      System.out.println("Nice attempt! You tried your best");
    }
  }
}
