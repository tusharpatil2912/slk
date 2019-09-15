package p1;
import java.util.Scanner;
public class FibonacciIndex {

	public static int fibonacci(int index) { 
		if (index <= 1) 
		       return index; 
		    return fibonacci(index-1) + fibonacci(index-2); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
	    System.out.println(fibonacci(index)); 
		
		
	}

}
