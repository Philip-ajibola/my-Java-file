import java.util.Scanner;

public class NonDecreasingOrder{
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    System.out.println("Enter an Integer");
        int number1 = input.nextInt();
      System.out.println("Enter an Integer");
        int number2 = input.nextInt();
        System.out.println("Enter an Integer");
        int number3 = input.nextInt();

    int highest=0;
    int secondHighest=0;
    int lowestNumber=number1;

  if(number1>number2 &&  number1>number3){
       highest = number1;   
  }
         
  if(number2>number1 &&  number2>number3){
       highest = number2;   
  }
    
if(number3>number1 &&  number3>number2){
       highest = number3;   
  }
   
 if(number1<number2 &&  number1<number3){
       lowestNumber = number1;   
  } 
 if(number2<number1 &&  number2<number3){
       lowestNumber = number2;   
  } 
 if(number3<number2 &&  number3<number1){
       lowestNumber = number3;   
  } 
   
 if(number1<highest && number1>lowestNumber){
      secondHighest = number1;
   }
 if(number2<highest && number2>lowestNumber){
      secondHighest = number2;
   }
 if(number3<highest && number3>lowestNumber){
      secondHighest = number3;
   }


   System.out.printf("%d  %d  %d",lowestNumber,secondHighest,highest);



    }




}