import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static  void main(String[] args){
        Random rand_number = new Random();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the chances you want to play: ");
        int chances = sc1.nextInt();

        int computer_wins = 0;
        int user_wins = 0;

        int count_loop = 1;
        while(count_loop <=chances){
            int randomInt = rand_number.nextInt(3);
            Scanner sc = new Scanner(System.in);
            System.out.println("User please enter 0 is for rock , 1 is for paper and 2 is for scissors");

            int data = sc.nextInt();
            System.out.println("Computer: " + randomInt + ", User: " + data);


            if(randomInt == data){
                System.out.println("draw");
            }else if((data == 0 && randomInt ==1) || (data == 1 && randomInt ==2) ||(data == 2 && randomInt ==0) ){
                computer_wins ++;
            }else{
                user_wins ++;
            }

            count_loop++;
            System.out.println("score: computer -> " + computer_wins + ", user-> " + user_wins);

        }

        if(computer_wins > user_wins){
            System.out.println("computer wins");
        }else{
            System.out.println("user wins");
        }
    }


}
