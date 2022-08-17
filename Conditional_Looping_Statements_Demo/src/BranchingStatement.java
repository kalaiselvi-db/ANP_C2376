
public class BranchingStatement {
public static void main(String[] args) {
	iloop:
	for(int i=1;i<5;i++) 
	{ 
		jloop:
		for(int j=1;j<=i;j++) 
		{
			System.out.print(i);
			if(j==2)
			continue iloop;
		}
		System.out.println();
	}
	System.out.println("Main method");
}
}
