import java.util.Scanner;

public class ResultAnalysis{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
    
    int passed = 0;
    int failed = 0;
    int studentCounter = 1;

     while(studentCounter<=10){
         System.out.print("Enter Result(1 for pass) (2 for fail) ");

       int result = input.nextInt();
       
       if(result==1){
           passed = passed+1;
        }
       if(result==2){
         failed = failed+1;
      }
          studentCounter = studentCounter+1;
     }
 
       System.out.printf("Number of passes: %d%n",passed);
       System.out.printf("Number of failed: %d",failed);

    

      if(passed>=8)
           System.out.print("The Instructor of this Student needs to be rewarded bountifully");



    }   



}