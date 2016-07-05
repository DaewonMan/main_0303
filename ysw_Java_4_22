/*
   Get java, Problem 4-2-2
   confirm the third, the fifth of bit
 */
public class P4_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15678;
		int temp = 0;
		
		/* solution using loop
		for(int i = 1;num > 0;i++)
		{
			temp = num % 2; // allocate from most right bit
			num /= 2; // to get second right bit
			
			if(i == 3 || i == 5) System.out.println(temp); 
		}
		*/
		
		/* solution using bit operator */
		num >>= 2; // move to the right twice
		System.out.println((num & 1)); // print the third bit
		
		num >>= 2; // move to the right three times
		System.out.println(num & 1); // print the fifth bit
		
	}

}
