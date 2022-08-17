
public class SwitchCaseDemo2 {
	public static void main(String[] args) {
		int day=2;
		switch(day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		
				System.out.println("Its a weekday");
				System.out.println("Case block");
		
				break;
		case 6:
		case 7:
			System.out.println("Its a weekend");
			break;
			default:
				System.out.println("Not a valid day");
				
		
		}
		
	}
}
