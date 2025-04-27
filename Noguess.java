import java.util.*;
public class Noguess {
    public static void main(String[] args){
        Random random =new Random();
        Scanner sc=new Scanner(System.in);
        int guess=0;
        int attempts=0;
        int min=1;
        int max=100;
        int randomNumber =random.nextInt(min, max+1);
        System.out.println("Number Gessing game");
        System.out.printf("Guess number between %d-%d\n", min, max);
         do{
            System.out.print("Enter a guess: ");
            guess =sc.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if(guess>randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.println("CORRECR! The number was "+randomNumber);
                System.out.println("# of attempts: "+attempts);
            }
         }while(guess!=randomNumber);
         System.out.println("You have won");
    }
}
