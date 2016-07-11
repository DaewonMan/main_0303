/*
 * Get java, Problem 6-3-2
 * change Decimal to binary using recursion
 */
import java.util.*;

public class P6_3_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		System.out.print("정수 입력 : ");
		num = in.nextInt(); // Decimal input
		
		binaryNum(num);
	}
	
	public static void binaryNum(int n){
		if (n<=1) // base case
			System.out.print(n);
		else{ 
			binaryNum(n/2); // recursive step
			System.out.print(n%2);
		}
		
	}
}
