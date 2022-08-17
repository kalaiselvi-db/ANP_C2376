
public class ForLoopDemo {
	static void display(){
		System.out.println("display");
	}
public static void main(String[] args) {
	// for(initialization;condition;increment/decrement)
int x=0;
for(;x<5;) {
	display();
	//System.out.println(x);
	x++;
}
for(int y=1;y<=5;y++)
	System.out.println(y);

System.out.println("Main method");

}
}
