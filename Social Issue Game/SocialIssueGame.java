//Chamin, Emily, Tony; 11/20/18
import java.util.*;
public class SocialIssueGame {

   public static void main(String[] args) {
      List <Question> myQuestions = new ArrayList<Question>();
      myQuestions.add(new Question("Access to education is available to everyone. True or false.",
         "false"));
      myQuestions.add(new Question("Harlem's Children's Zone provides free education and charter schools for children. True or False?", "true"));
      myQuestions.add(new Question("It costs 14 billion doillars to give every child on the planet a primary school education? True or False?", "true"));
      myQuestions.add(new Question("Harlem's Children's Zone is giving poor kids the same opportunitities as middle or upper class kids in terms of education? True or False?", "true"));
      myQuestions.add(new Question("Many children in third world countries don't recieve schooling because their family needs them to work to help provide for the family? True or False?", "true"));
      myQuestions.add(new Question("Boys are the first ones to be oulled out of school? True or False?", "false"));
      myQuestions.add(new Question("Teaching poor parents that education begins when a baby is born is important in ensuring that poor children will recieve a proper education? True of False?", "true"));

      //Enter at least more questions here
      Trivia game = new Trivia(myQuestions);
      game.play();
   }
}