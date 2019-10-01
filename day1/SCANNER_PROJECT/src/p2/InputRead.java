package p2;
import java.util.Scanner;
public class InputRead {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	int ival= s.nextInt();
	System.out.println("------------------------");
	
	float fval=s.nextFloat();
	System.out.println("------------------------");
	
	boolean bval=s.nextBoolean();
	System.out.println("------------------------");
	
	String myname=s.next();
	System.out.println("------------------------");
	
	System.out.println(ival + "::"+fval+"::"+bval+"::"+myname);


	}

}
