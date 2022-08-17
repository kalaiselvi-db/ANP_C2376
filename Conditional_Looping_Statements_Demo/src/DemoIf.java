
public class DemoIf {
	public static void main(String[] args) {
		int a=256,b=190, c=100;
		if(a>b)
		{
			System.out.println("true block statement1");
			if(a>c) {
				System.out.println("Inner if True block statement2");
				System.out.println("A is the greatest");
			}
			
		}
		else
		{
			System.out.println("false block statement1");
			if(b>c)
			{
				System.out.println("Else block inner if true block statement");
				System.out.println("B is the greatest");
			}
			else {
				System.out.println("Else block inner if-else block statement");
				System.out.println("C is the greatest");
			}
			
	
		}
		System.out.println("Main method1");
		System.out.println("Main method2");
		
	}

}
