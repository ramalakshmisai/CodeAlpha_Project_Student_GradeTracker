package Student_Info;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
	System.out.println("Welcome to the Student Grade Tracker");
	System.out.println("***********************");
	Scanner sc=new Scanner(System.in);
	Student_management sms=new Student_management1();
	while(true)
	{
		System.out.println("\n1.addstudent\n2.remove student\n3.display Student\n4 .displayallstudent\n5.higestgrade\n6.lowestgrade\n7.avggrade");
		System.out.println("enter choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			sms.addStudent();
			break;
		case 2:
			sms.removeStudent();
			break;
		case 3:
			sms.displayStudent();
			break;
		case 4:
			sms.displayAllStudent();
			break;
		case 5:
			sms.findStudentwithHighestgrade();
			break;
		case 6:
			sms.findStudentwithLowestgrade();
			break;
		case 7:
			sms.findAvgeragegrade();
			break;
			
			default:
				System.out.println("thank you");
			
		}
		System.out.println("----------------");
	}
}
}
