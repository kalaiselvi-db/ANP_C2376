
public class SwitchCaseDemo5 {
public static void main(String[] args) {
	int day=11;
	String dayVal=switch(day) {
	case 1->"Mon";
	case 2->"Tue";
	default->"Not a valid input";
	};
	System.out.println(dayVal);
}
}
