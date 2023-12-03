import java.util.Scanner;
import java.util.Random;

public class RandomNumber{
     public static void main(String[] args){
         Random random = new Random();
         Scanner input = new Scanner(System.in);
int lotteryNumber = random.nextInt(1000)+100;

   System.out.print("Enter Three Interger: ");
   int number = input.nextInt();


int lottery1 = lotteryNumber/100;
int remainder = lotteryNumber%100;
int lottery2 = remainder/10;
int lottery3 = remainder%10;

int digit1 = number/100;
int remainder2 = number%100;
int digit2= remainder2/10;
int digit3 =  remainder2%10;

      System.out.println(lotteryNumber);

 if(lotteryNumber==number){ 
         System.out.print("Congratulation You won a ground price of $10,000 ");
}


 if((lottery1==digit2) && (lottery2==digit3) && (lottery3==digit1)){
      System.out.print("Congratulation You won a ground price of $3,000 ");

        if((lottery1==digit1) && (lottery2==digit3) && (lottery3==digit2)){
              System.out.print("Congratulation You won a ground price of $3,000 ");

            if((lottery1==digit3) && (lottery2==digit1) && (lottery3==digit2)){
                      System.out.print("Congratulation You won a ground price of $3,000 ");

                    if((lottery1==digit2) && (lottery2==digit1) && (lottery3==digit3)){
                             System.out.print("Congratulation You won a ground price of $3,000 ");

                          if((lottery1==digit3) && (lottery2==digit2) && (lottery3==digit1)){
                              System.out.print("Congratulation You won a ground price of $3,000 ");
                          }
                     }
             }
       }

}   
else if((lottery1==digit3) && (lottery2==digit2) && (lottery3==digit1)){
      System.out.print("Congratulation You won a ground price of $3,000 ");
}


 if(lottery1==digit1 || lottery1==digit2 || lottery1 == digit3 || lottery2 == digit1 || lottery2 == digit2 || lottery2 == digit3 || lottery3 == digit1 || lottery3 == digit2 || lottery3==digit3){
            System.out.print("Congratulation You won a ground price of $1,000 ");
 }else{
          System.out.print("Opps you weren't lucky to have won, Keep Trying (YOU CAN DO IT)!!!");
    }







    }








}