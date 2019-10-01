package teabreak;

public class NumberManipulate {
	
	int splitter(int num)
	{
	    int res=num%100;
		return res;
	}

	public static void main(String[] args) {
		
		NumberManipulate obj= new NumberManipulate();
		int val = obj.splitter(1225);
		System.out.println(val);

	}

}
