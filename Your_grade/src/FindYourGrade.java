import java.util.Scanner;
public class FindYourGrade {

	public static void main(String[] args) {
	
	Scanner Grade = new Scanner(System.in);
	
System.out.print("ENTER YOUR MARK: ");

		int mark, grade;
	mark = Grade.nextInt();
	if (mark <=100 && mark >=90)
		System.out.println("Your grade is: A");
	else if (mark <90 && mark >=80)
		System.out.println("Your Grade is: B");
	else if (mark <80 && mark >=70)
		System.out.println("Your Grade is: C");
	else if (mark <70 && mark >=60)
		System.out.println("Your Grade is: D");
	else if (mark <60)
		System.out.println("Your Grade is: F");
	
		

	}

}
