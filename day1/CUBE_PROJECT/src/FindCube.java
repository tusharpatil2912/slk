
public class FindCube {
	
	
	int mycube(int val)
	{
		return (val*val*val);
	}

	public static void main(String[] args) {
		
	FindCube ref=new FindCube();
	int temp=ref.mycube(10);	
	System.out.println("Cube = " +temp);
	}

}
