package TrainingCodes;
//Instance Variable Example
class Dog
{
	String name;
	int cost;
	int age;
	String color;
}
public class VariableExmp1 {
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.name);
		System.out.println(d.cost);
		System.out.println(d.age);
		System.out.println(d.color);
		
		d.name="tommy";
		d.cost=5000;
		d.age=4;
		d.color="black";
		
		System.out.println(d.name);
		System.out.println(d.cost);
		System.out.println(d.age);
		System.out.println(d.color);
	}
}
