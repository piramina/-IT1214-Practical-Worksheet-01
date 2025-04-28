class Car extends Vehicle {
	String model;
 
	void display(){
		super.display();
		System.out.println("Car brand is: "+brand+" Speed is: "+speed+" Car model is: "+model);
	}
}