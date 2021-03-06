/* -----------------------------------------------------------------------------
 *
 * File Name:  FindMinMax.java
 * Author: Elise McEllhiney
 * Assignment:   EECS-168 Lab06
 * Description:  This program will give the min and max of three numbers
 * Date: Mar 1, 2012
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class FindMinMax {

	public static void main(String[] args){
		int c = 1;
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter three numbers:");
			int x= input.nextInt();
			int y= input.nextInt();
			int z= input.nextInt();
			System.out.println("The max number is " + Max(x,y,z) + ".");
			System.out.println("The min number is " + Min(x,y,z) + ".");
			System.out.println("");
			System.out.println("Would you like to continue? (1 for Yes, 0 for No)");
			c = input.nextInt();
		} while (c == 1);
	}
	
	//find max
	public static int Max(int x, int y, int z){
		int M;
		if((x>y)&&(x>z)){
			M = x;
		}
		else if(y>z){
			M = y;
		}
		else
			M = z;
		return M;
	}
	
	//find min
	public static int Min(int x, int y, int z){
		int m;
		if((x<y)&&(x<z)){
			m = x;
		}
		else if(y<z){
			m = y;
		}
		else
			m = z;
		return m;
	}
}
