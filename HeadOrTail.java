import java.util.Scanner;
import java.util.Random;

public class HeadOrTail{
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         Random random = new Random();

       int randomNumber = random.nextInt(2);

     System.out.println("Guess A Number(Either 1 Or 0) ");
          int guess = input.nextInt();
        if(guess<2||guess<0)
                  System.out.println(randomNumber);
 
      if(guess==randomNumber){
            System.out.print("Your guess was right !!!");   
      }
       
      else if(guess!=randomNumber){
            System.out.print(" Opps Your guess wasn't right, Make Another Guess ");   
      }
       
       else{
       System.out.print("INVALID NUMBER!!!!,Kindly to the right thing");   
      }




       }






}