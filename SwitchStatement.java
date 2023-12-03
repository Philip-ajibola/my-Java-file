import java.util.Scanner;

public class SwitchStatement{
     public static void main(String[] args){
		Scanner input = new Scanner(System.in);
         
           System.out.print("Enter Your Grade From Range 0-100: \nType The End File Indicator To Terminate Input\nOn UNIX/macOS/LINUX Type <Ctrl> d Then Press The Enter Key\n On Windows type <Ctrl> z Then Press Enter \n");
int totalGrade = 0;
int counter = 0;
int Acount = 0;
int Bcount = 0;
int Ccount = 0;
int Dcount = 0;
int Fcount = 0;
  int grade = 0; 

         
while(input.hasNext()){
	
	
	    totalGrade +=grade;
	    counter++;
	switch(grade/10){
                case 9:
		case 10:
			Acount++;
			break;
		case 8:
			Bcount++;
			break;
		case 7:
			Ccount++;
			break;
		case 6:
			Dcount++;
			break;
		default:
			Fcount++;
			break;

 
	}
     
          
}
    double average = (double)totalGrade/counter;

   System.out.print("Grade Report \n");
		if(counter >0){
			System.out.println("The Class Average Is "+average);
			System.out.println("The Number Of Student in Range A Are "+Acount);
			System.out.println("The  Number Of Student in Range B Are "+Bcount);
			System.out.println("The  Number Of Student in Range C Are "+Ccount);
			System.out.println("The  Number Of Student in Range D Are "+Dcount);
			System.out.println("The Number Of Student in Range F Are  "+Fcount);
	       }else{
			System.out.print("No Grade Was Entered ");
		  }
    
    


     }







}