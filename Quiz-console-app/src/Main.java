import java.util.Scanner;

public class Main{
    static void main() {
        QuestionService service = new QuestionService();

        int score = 0;
        for(Questions q:service.getQuestionsList()){
            System.out.println(q.question);

            for(String s:q.opt){
                System.out.println(s);
            }

            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine();

            if(ans.equals(q.answer)){
                System.out.println("Correct answer!");
                score++;
            }else{
                System.out.println("Wrong answer!");
            }
        }

        System.out.println("You scored : " + score);
    }
}