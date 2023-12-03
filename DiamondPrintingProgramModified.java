import java.util.Scanner;

public class DiamondPrintingProgramModified{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.print("Enter An Odd Number from 1-19: ");
		int number = input.nextInt();
		 int number1 = 0;
		int counter1 = 1;
	
	while(counter1<=1){
		while(number%2==0){
			System.out.print("Enter Am Odd Number From 1-19,Listen To Instructions ");
			number = input.nextInt();
		}
		
	 if(number/2!=0){
		number1= (number/2)+1;
	for(int count = 1; count<=number1; count++){
		for(int counter =number1; counter>=count;counter--){
			System.out.print(" ");
		}
			for(int count1=1;count1<=count;count1++){
			System.out.print("* ");

			}
			System.out.println();
	}
	  
	for(int count2 = 1;count2<= number1 ;count2++){
			System.out.print(" ");
		for(int count3 = 1;count3<=count2;count3++){
			System.out.print(" ");
				}
		for(int count4 = (number1-1); count4>= count2;count4--){
			System.out.print("* ");

		}
		System.out.println();

		}

			
		

			}

			
		counter1++;
		
		}

	




      }


}