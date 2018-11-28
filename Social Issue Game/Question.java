//Chamin, Emily, Tony; 11/20/18
public class Question {
   private String question;
   private String answer;
//What is your default Q&A?
   public Question() {
	   question = "What is your name?";
	   answer = "IDK";
   }
//Two arg constructor
   public Question (String q, String a) {
	   question = q;
	   answer = a;
   }
//Accessor Methods
   public String getQuestion() {
	   return question;
   }
   public String getAnswer() {
	   return answer;
   }
//Mutator Methods
   public void setQuestion(String q) {
	   question = q;
   }
   public void setAnswer(String a) {
	   answer = a;
   }
}