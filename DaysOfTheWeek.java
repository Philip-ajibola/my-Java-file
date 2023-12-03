import java.util.Scanner;

public class DaysOfTheWeek{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
    
  System.out.print("Enter Year:  "); 
   int year = input.nextInt();
  System.out.print("Enter Month in number: "); 
   int month = input.nextInt();
  System.out.print("Enter the day of the Month(1-31): "); 
   int day = input.nextInt();

   int month1 = 26*(month + 1)/10;
    int yearOfTheCentury = year%100;
    int theCentury = year/100;
     int yearOfTheCentury1 = yearOfTheCentury/4;
     int theCentury1 = theCentury/4;
      int fiveJ = 5*theCentury;
      int dayOfTheWeek = (day+month1+yearOfTheCentury+yearOfTheCentury1+theCentury1+fiveJ)%7;

     if(dayOfTheWeek==0){
       System.out.print("Day of the Week is Saturday");
     }

       if(dayOfTheWeek==1){
       System.out.print("Day of the Week is Sunday");
     }

      
     if(dayOfTheWeek==2){
       System.out.print("Day of the Week is Monday");
     }

      
     if(dayOfTheWeek==3){
       System.out.print("Day of the Week is Tuesday");
     }

      
     if(dayOfTheWeek==4){
       System.out.print("Day of the Week is Wednesday ");
     }

      
     if(dayOfTheWeek==5){
       System.out.print("Day of the Week is Thursday");
     }

    if(dayOfTheWeek==6){
       System.out.print("Day of the Week is Friday");
     }

      





   }





}