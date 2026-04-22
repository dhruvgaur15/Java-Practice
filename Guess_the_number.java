import java.util.Random;
import java.util.Scanner;

public class Guess_the_number {

    Guess_the_number(){
        Random  random = new Random();
        random_number = random.nextInt(100);
    }

    int random_number;
    int userInput;
    int number_of_guesses;
    void takeUserInput(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your guess:");
        userInput = sc.nextInt();
        isCorrectNumber();
    }

    void isCorrectNumber(){
        number_of_guesses += 1;

        if(random_number == userInput){
            return;
        }else if(random_number<userInput){
            System.out.println("Your guess is higher");
        }else{
            System.out.println("Your guess is lower");
        }

        takeUserInput();

    }
    static void main() {
        Guess_the_number guess = new Guess_the_number();
        guess.takeUserInput();
        System.out.println("Total number of gusses : " + " " + guess.number_of_guesses);
    }
}
