import java.util.Scanner;

public class StudentGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	int countA = 0;
	int countB = 0;
	int countC =0;
	int countD =0;
	int  count  = 1;


	while(count<=5)	{	
		System.out.print("Enter Your Name \n");
			String name = input.next();
	System.out.print("Enter Your Grade (e.g Student 1 A ) ");
		String grade = input.next();

	switch(grade){
		case "A":
		case "a": 
			countA++;
		break;
		case "B":
		case "b":
			countB++;
		break;
		case "C":
		case "c":
			countC++;
		break;
		case "D":
		case "d":
			countD++;
		break;
	
	}
		count++;
	}

	System.out.printf("%d Student Got a Grade Of 'A' \n",countA);
	System.out.printf("%d Student Got a Grade Of 'B' \n",countB);
	System.out.printf("%d Student Got a Grade Of 'C' \n",countC);	
	System.out.printf("%d Student Got a Grade Of 'D' \n",countD);
	
	}





}