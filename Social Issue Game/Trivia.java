//Chamin, Emily, Tony; 11/20/18
import java.util.*;

public class Trivia {
   public List<Question>listOfQuestions;
   public int totalCorrect = 0;

   public Trivia(List <Question> qs) {
	   listOfQuestions = qs;
   }
   public void play() {
   //Ask each question in the list
   //Prompt the user for an answer
   //If answered correctly add 1 to totalCorrect
   //If answered incorrectly provide the correct answer
   //After all questions have been asked, provide a report of # correctly answered
	   Scanner scanner = new Scanner(System.in);
	   for (int i = 0; i < listOfQuestions.size(); i++) {
		   System.out.println(listOfQuestions.get(i).getQuestion());
		   System.out.println("What is the answer?");
		   if(checkAnswer(listOfQuestions.get(i), scanner.next()) == true) {
			   updateScore();
		   }
		   else	
			   System.out.println("The answer was " + getAnswer(listOfQuestions.get(i)) + ".");
	   }
	   System.out.println("The # of question you got right is " + getScore());
   }
   public String getAnswer(Question q) {
      return q.getAnswer();
   }

   public boolean checkAnswer(Question q, String ans) {
     if(q.getAnswer().equalsIgnoreCase(ans)) {
    	 return true;
     }
     return false;
   }
   public void updateScore() {
	   totalCorrect++;
   }
   public int getScore() {
      return totalCorrect;
   }
}