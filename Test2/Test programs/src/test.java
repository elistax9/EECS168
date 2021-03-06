/*
 * 	File Name: McEllhiney_Q2
	Author: Elise McEllhiney 
    KUID: 2298962
	Email Address: elisemmc@yahoo.com 
	Test Problem Number: 2
	Description: Determines if number is a palindrome.
	Last Changed: Mar. 8, 2012

 */
import java.util.Scanner;
public class test{
	public static void main(String[] args){
		int c =1;//continue variable
		while(c > 0){
			Scanner input=new Scanner(System.in);
			System.out.print("Please enter an integer number:");
			int x = input.nextInt();//original number
			int y = reverse(x);//reversed number
			palindrome(x,y);//is original number equal to its inverse?
			System.out.print("Would you like to continue? (0 or negative for NO)");
			c = input.nextInt();//allow user to determine continuation
		}
		System.out.println("Bye");
	}
	//reverse the number
	public static int reverse(int x){
		int remainder = x;
		int y = 0;
		do {
			int lastDigit;
			lastDigit = remainder%10;
			remainder = remainder/10;
			y = (y + lastDigit)*10;
		}while(remainder >= 10);
		y = y + remainder;
		return y;
	}
	//determine if number is a palindrome
	public static void palindrome(int x, int y){
		//compare number and its reverse
		if (x == y){//number = to its inverse
			System.out.println("This number is a palindrome. Its reverse order is " + y);
		}
		else {//number not = to its inverse
			System.out.println("This number is NOT a palindrome. Its reverse order is " + y);
		}
	}

}