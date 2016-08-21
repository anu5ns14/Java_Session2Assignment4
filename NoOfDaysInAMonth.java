import java.util.Scanner;

public class NoOfDaysInAMonth {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a month no: ");
		
		int MonthNum = sc.nextInt();
		
		switch (MonthNum) {
		case 1:
			System.out.println("Jan month has 31 days");
			break;

		case 2:
			System.out.println("Feb month has 28 days \n");
			System.out.println("Feb month has 29 days in a leap year \n");
			break;
			
		case 3:
			System.out.println("Mar month has 31 days");
			break;
			
		case 4:
			System.out.println("Apr month has 30 days");
			break;
			
		case 5:
			System.out.println("May month has 31 days");
			break;
			
		case 6:
			System.out.println("June month has 30 days");
			break;
			
		case 7:
			System.out.println("July month has 31 days");
			break;
			
		case 8:
			System.out.println("Aug month has 31 days");
			break;
			
		case 9:
			System.out.println("Sep month has 30 days");
			break;
			
		case 10:
			System.out.println("Oct month has 31 days");
			break;
			
		case 11:
			System.out.println("Nov month has 30 days");
			break;
			
		case 12:
			System.out.println("Dec month has 31 days");
			break;
			
		default:
			System.out.println("Invalid month, please enter correct month number.");
			break;
		}
		
		sc.close();
	}
}
