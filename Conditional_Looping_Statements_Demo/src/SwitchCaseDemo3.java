
public class SwitchCaseDemo3 {
public static void main(String[] args) {
	String day="1";
	switch(day) {
	case "1":
		System.out.println("Sun");	
	case "2":
		System.out.println("Mon");
		break;
	case "3":
		System.out.println("Tue");
		break;
	case "4":
		System.out.println("Wed");
		break;
	case "5":
		System.out.println("Thu");
		break;
	case "6":
		System.out.println("Fri");
		break;
	case "7":
		System.out.println("Sat");
		break;
		default:
			System.out.println("Not a valid day");
	}		
}
}
