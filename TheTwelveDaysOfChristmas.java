import java.util.Scanner;

public class TheTwelveDaysOfChristmas{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
	System.out.print("Enter Number 1-12 ");
		int number = input.nextInt();


for(int number1=number;number1==number;number1++){
	switch(number/1){
		case 1:
			 System.out.println("On The First Day Of Christmas \nMy true love sent to me: ");
			 break;
		case 2:
			System.out.println("On The Second Day Of Christmas \nMy true love sent to me: ");
		    	break;
		case 3:
			System.out.println("On The Third Day Of Christmas \nMy true love sent to me: ");	
		   	break;
		case 4:
			System.out.println("On The Forth Day Of Christmas \nMy true love sent to me: ");
		   	break;
		case 5:
			System.out.println("On The Fifth Day Of Christmas \nMy true love sent to me: ");
		   	break;
		case 6:
			System.out.println("On The Sixth Day Of Christmas \nMy true love sent to me:");
		   	break;
		case 7:
			System.out.println("On The Seventh Day Of Christmas \nMy true love sent to me: ");
		   	break;
		case 8:
			System.out.println("On The Eighth Day Of Christmas \nMy true love sent to me: ");
		  	break;
		case 9:
			System.out.println("On The ninth Day Of Christmas \nMy true love sent to me: ");
			break;
 	 	case 10:
			System.out.println("On The Tenth Day Of Christmas \nMy true love sent to me: ");
			break;
		case 11:
			System.out.println("On The Eleventh Day Of Christmas \nMy true love sent to me: ");
			break;
		case 12:
			System.out.println("On The Twelfth Day Of Christmas \nMy true love sent to me: ");			
			break;
		}
			System.out.println();
			System.out.print("Enter The Number Again To Know The Gift Of The Day\n");
				int number2 = input.nextInt();
			while(number2!=number1){
				System.out.print("Please Enter The Number You Input For The Day	\n");
					number2 =input.nextInt();
			}	
	
		switch(number/1){
		case 12:
			System.out.println("Twelve drummers drumming");
		case 11:
			System.out.println("Eleven pipers piping");
		case 10:
			System.out.println("Ten lords a-leaping");
		case 9:
			System.out.println("Nine ladies dancing");
		case 8:
			System.out.println("Eight maids a-milking");
		case 7:
			System.out.println("Seven swans a-swimming");
		case 6:
			System.out.println("Six geese a-laying");
		case 5:
			System.out.println("Five golden rings");
		case 4:
			System.out.println("Four calling birds ");
		case 3:
			System.out.println("Three French hens");
		case 2:
			System.out.println("Two turtle doves and A ");
		
		case 1:
			System.out.println("A partridge in a pear tree ");		

                  } 

	
	}


	}



}