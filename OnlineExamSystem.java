import java.util.Scanner;

public class OnlineExamSystem {
    
    public static void main(String[] args) {
      
        String[] questions = {"What is the capital of France?", 
                                "What is the largest mammal in the world?", 
                                "What is the smallest country in the world?"};
        String[] options = {"A) London B) Paris C) Madrid",
                             "A) Elephant B) Blue Whale C) Giraffe",
                             "A) Vatican City B) Monaco C) Nauru"};
        int[] answers = {1, 2, 0};
        
        int numQuestions = questions.length;
        int score = 0;
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < numQuestions; i++) {

            System.out.println(questions[i]);
            System.out.println(options[i]);
    
            System.out.print("Enter your answer (1, 2, or 3): ");
            int userAnswer = input.nextInt() - 1; 
     
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
            
            System.out.println("Current score: " + score + "/" + (i+1));
            System.out.println();
        }
        
        System.out.println("Quiz complete!");
        System.out.println("Final score: " + score + "/" + numQuestions);

        input.close();
    }
}
