package PackageDay1;

public class Math {

	int value1;
	int value2;
	String Scope;
	String ScopeNew;
	
	
	Math(int temp_value1, int temp_value2, String temp_Scope, String temp_ScopeNew) //constructor
	{
		value1 = temp_value1 ;
		value2 = temp_value2;
		Scope  = temp_Scope;
		ScopeNew= temp_ScopeNew;
		
	}
	void Method1()
	{
		if (Scope=="Add")
		{
			System.out.println("Addition :" + (value1+value2));
		}
		else 
		{
			System.out.println("Substraction :" + (value1-value2));
		}
	}
	
	void Method2()
	{
		do 
		{
			System.out.println("Multiplication: " +value1 * value2);
			 break; // Used break to print multiple it once only
			 
		}
		while (value1>=value2);
		
	}
	
	void Method3()
	{
		if (Scope.equals(ScopeNew)) // "a.equals(b)" is  Case Sensitive
		{
			System.out.println("scope is same");
			
		}
		else System.out.println("Scope is not same");
	}
	void Method4()
	{
		if (Scope.equalsIgnoreCase(ScopeNew)) //"a.equalsIgnoreCase(b) is not Case Sensitive
		{
			System.out.println("Scope is same");
		}
		else System.out.println("Scope is not same");
	}
	
	public static void main(String[] args) 
	
	{
		Math M1= new Math(4, 2, "Add", "ADD");
		M1.Method1();
		M1.Method2();
		M1.Method3();
		M1.Method4();
	}

}

