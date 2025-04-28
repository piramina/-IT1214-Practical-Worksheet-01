class Manager extends Employee{
	Manager(String name,int id,double salary){
		super(name,id,salary);
	}
	
	void displayDetails(){
		super.displayDetails();
        double bonus = salary * 0.1;
        System.out.println("Bonus: " + bonus);
	}
}