/* -----------------------------------------------------------------------------
 *
 * File Name:  Factorial.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab05
 * Description:  This program will compute the factorial of a number.
 * Date: Feb 23, 2012
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args){
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to compute factorial:");
		int A = input.nextInt();
		//variables for equations
		int factorial=1;
		int cnt = 1;
		while (A<0){//negative check
			System.out.println("Please enter a non-negative number:");
			A = input.nextInt();
		}
		if (A > 0){//factorial
			while (cnt <= A){
				factorial *= cnt;
				cnt ++;
			}
		}
		//output
		System.out.println("The factorial is:" + factorial);
	}

}