package com.bldea.encapsulation.pkg1;

class Plane{
	void takeOff() {
		System.out.println("plane took off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plan landed");
	}
}
class CargoPlane extends Plane{
	void fly() {
		System.out.println("cargo plane is flying at low heights");
	}
	void carryGoods() {
		System.out.println("cargoplane carry goods");
	}
}
class FighterPlane extends Plane{
	void fly() {
		System.out.println("fighter plane is flying at great heights");
	}
	void carryWeapons() {
		System.out.println("fighter plane carry weapons");
	}
}
class PassengerPlane extends Plane{
	void fly() {
		System.out.println("Passenger plane is flying at medium heights");
	}
	void carryPassengers() {
		System.out.println("Passenger plane carry passengers");
	}
}
public class Launch2 {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		PassengerPlane pp = new PassengerPlane();
		
		Plane ref;
		ref = cp;
		
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		System.out.println("---------");
		
		ref = fp;
		
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.carryWeapons();
		System.out.println("---------");
		
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryPassengers();
		
	}
}
