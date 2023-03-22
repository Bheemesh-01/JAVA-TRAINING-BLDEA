package TrainingCodes;
class Calculator{
	void add() {
		int a = 10;
		int b = 20;
		
		int res = a+b;
		System.out.println(res);
	}
}
public class VariableExmp2 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1);//to find the address value of the object
		c1.add();
	}
}
