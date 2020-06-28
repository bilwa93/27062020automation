package ifelsestatements;

public class ifelsestatementlogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//And Operator
		int age=18;
		boolean voterID=true;
		
		if(age>=18 && voterID) {
			System.out.println("You are eligible");
		}else
		{
			System.out.println("You are not eligible");
		}
		
	
	//OR Operator	
	boolean pancard=true;
	boolean aadharcard=true;
	
	if(pancard || aadharcard)
	{
		System.out.println("You are eligible");
		
	}
	else
	{
		System.out.println("You are Not eligible");

	}

}
}

