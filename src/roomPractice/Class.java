package roomPractice;
import java.util.Scanner;
public class Class {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter two integer value");
		int a=s.nextInt();
		int b=s.nextInt();
		 performAddition(a,b);
	        performSubtraction(a, b);
	}
public static void performAddition(int a, int b) {
    int result = a + b;
    System.out.println("Addition result: " + result);
}
public static void performSubtraction(int a,int b) {
    int result = a - b;
    System.out.println("Subtraction result: " + result);
}
}